package com.goku.demo.mapper.provider;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

/**
 * Created by nbfujx on 2017-12-04.
 */
public class UserProvider {

    public String selectByNickname2()
    {
        return new SQL()
        {
            {
                SELECT("*");
                FROM("user_");
                WHERE("nickName like '%'||#{name}||'%'");
            }
        } .toString();
    }
}
