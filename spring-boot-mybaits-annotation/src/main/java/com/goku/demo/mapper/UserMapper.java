package com.goku.demo.mapper;

import com.goku.demo.mapper.provider.UserProvider;
import com.goku.demo.model.UserWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

/**
 * Created by nbfujx on 2017-12-04.
 */
@Mapper
public interface UserMapper {


    @Select("select * from user_ where nickName like '%'||#{name}||'%' ")
    List<UserWithBLOBs> selectByNickname(@Param("name") String name);

    @SelectProvider(type=UserProvider.class,method ="selectByNickname2")
    List<UserWithBLOBs> selectByNickname2(@Param("name") String name);
}
