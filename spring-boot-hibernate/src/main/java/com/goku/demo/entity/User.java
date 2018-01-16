package com.goku.demo.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by nbfujx on 2017-12-15.
 */
@Entity
@Table(name = "user_", schema = "springbootdb", catalog = "")
public class User {
    private String id;
    private String emailAddress;
    private String companyId;
    private Integer groupId;
    private String companyName;
    private String firstName;
    private String middleName;
    private String lastName;
    private String nickName;
    private String password;
    private Timestamp birthday;
    private String favoriteActivity;
    private String favoriteFood;
    private String favoriteMovie;
    private String favoriteMusic;
    private String greeting;
    private Timestamp createDate;
    private Timestamp modifiedDate;
    private String recycled;
    private Timestamp loginDate;
    private Timestamp lastLoginDate;
    private String loginIp;
    private String lastLoginIp;
    private String defaultTagId;
    private String description;
    private String country;
    private String area;
    private String male;
    private String type;
    private Integer active;
    private String valid;
    private String mobilePhone;
    private String phone;
    private String leftmenu;
    private Integer extuserid;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "emailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Basic
    @Column(name = "company_id")
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    @Basic
    @Column(name = "groupId")
    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "companyName")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Basic
    @Column(name = "firstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "middleName")
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Basic
    @Column(name = "lastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "nickName")
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Basic
    @Column(name = "password_")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "birthday_")
    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "favoriteActivity")
    public String getFavoriteActivity() {
        return favoriteActivity;
    }

    public void setFavoriteActivity(String favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }

    @Basic
    @Column(name = "favoriteFood")
    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    @Basic
    @Column(name = "favoriteMovie")
    public String getFavoriteMovie() {
        return favoriteMovie;
    }

    public void setFavoriteMovie(String favoriteMovie) {
        this.favoriteMovie = favoriteMovie;
    }

    @Basic
    @Column(name = "favoriteMusic")
    public String getFavoriteMusic() {
        return favoriteMusic;
    }

    public void setFavoriteMusic(String favoriteMusic) {
        this.favoriteMusic = favoriteMusic;
    }

    @Basic
    @Column(name = "greeting_")
    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    @Basic
    @Column(name = "createDate")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "modifiedDate")
    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Basic
    @Column(name = "recycled_")
    public String getRecycled() {
        return recycled;
    }

    public void setRecycled(String recycled) {
        this.recycled = recycled;
    }

    @Basic
    @Column(name = "loginDate")
    public Timestamp getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Timestamp loginDate) {
        this.loginDate = loginDate;
    }

    @Basic
    @Column(name = "lastLoginDate")
    public Timestamp getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Timestamp lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    @Basic
    @Column(name = "loginIP")
    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    @Basic
    @Column(name = "lastLoginIP")
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    @Basic
    @Column(name = "defaultTagId")
    public String getDefaultTagId() {
        return defaultTagId;
    }

    public void setDefaultTagId(String defaultTagId) {
        this.defaultTagId = defaultTagId;
    }

    @Basic
    @Column(name = "description_")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "country_")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "area_")
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Basic
    @Column(name = "male_")
    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    @Basic
    @Column(name = "type_")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "active_")
    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    @Basic
    @Column(name = "valid_")
    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    @Basic
    @Column(name = "mobilePhone")
    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    @Basic
    @Column(name = "Phone_")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "leftmenu")
    public String getLeftmenu() {
        return leftmenu;
    }

    public void setLeftmenu(String leftmenu) {
        this.leftmenu = leftmenu;
    }

    @Basic
    @Column(name = "extuserid")
    public Integer getExtuserid() {
        return extuserid;
    }

    public void setExtuserid(Integer extuserid) {
        this.extuserid = extuserid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (emailAddress != null ? !emailAddress.equals(user.emailAddress) : user.emailAddress != null) return false;
        if (companyId != null ? !companyId.equals(user.companyId) : user.companyId != null) return false;
        if (groupId != null ? !groupId.equals(user.groupId) : user.groupId != null) return false;
        if (companyName != null ? !companyName.equals(user.companyName) : user.companyName != null) return false;
        if (firstName != null ? !firstName.equals(user.firstName) : user.firstName != null) return false;
        if (middleName != null ? !middleName.equals(user.middleName) : user.middleName != null) return false;
        if (lastName != null ? !lastName.equals(user.lastName) : user.lastName != null) return false;
        if (nickName != null ? !nickName.equals(user.nickName) : user.nickName != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (birthday != null ? !birthday.equals(user.birthday) : user.birthday != null) return false;
        if (favoriteActivity != null ? !favoriteActivity.equals(user.favoriteActivity) : user.favoriteActivity != null)
            return false;
        if (favoriteFood != null ? !favoriteFood.equals(user.favoriteFood) : user.favoriteFood != null) return false;
        if (favoriteMovie != null ? !favoriteMovie.equals(user.favoriteMovie) : user.favoriteMovie != null)
            return false;
        if (favoriteMusic != null ? !favoriteMusic.equals(user.favoriteMusic) : user.favoriteMusic != null)
            return false;
        if (greeting != null ? !greeting.equals(user.greeting) : user.greeting != null) return false;
        if (createDate != null ? !createDate.equals(user.createDate) : user.createDate != null) return false;
        if (modifiedDate != null ? !modifiedDate.equals(user.modifiedDate) : user.modifiedDate != null) return false;
        if (recycled != null ? !recycled.equals(user.recycled) : user.recycled != null) return false;
        if (loginDate != null ? !loginDate.equals(user.loginDate) : user.loginDate != null) return false;
        if (lastLoginDate != null ? !lastLoginDate.equals(user.lastLoginDate) : user.lastLoginDate != null)
            return false;
        if (loginIp != null ? !loginIp.equals(user.loginIp) : user.loginIp != null) return false;
        if (lastLoginIp != null ? !lastLoginIp.equals(user.lastLoginIp) : user.lastLoginIp != null) return false;
        if (defaultTagId != null ? !defaultTagId.equals(user.defaultTagId) : user.defaultTagId != null) return false;
        if (description != null ? !description.equals(user.description) : user.description != null) return false;
        if (country != null ? !country.equals(user.country) : user.country != null) return false;
        if (area != null ? !area.equals(user.area) : user.area != null) return false;
        if (male != null ? !male.equals(user.male) : user.male != null) return false;
        if (type != null ? !type.equals(user.type) : user.type != null) return false;
        if (active != null ? !active.equals(user.active) : user.active != null) return false;
        if (valid != null ? !valid.equals(user.valid) : user.valid != null) return false;
        if (mobilePhone != null ? !mobilePhone.equals(user.mobilePhone) : user.mobilePhone != null) return false;
        if (phone != null ? !phone.equals(user.phone) : user.phone != null) return false;
        if (leftmenu != null ? !leftmenu.equals(user.leftmenu) : user.leftmenu != null) return false;
        if (extuserid != null ? !extuserid.equals(user.extuserid) : user.extuserid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (emailAddress != null ? emailAddress.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (favoriteActivity != null ? favoriteActivity.hashCode() : 0);
        result = 31 * result + (favoriteFood != null ? favoriteFood.hashCode() : 0);
        result = 31 * result + (favoriteMovie != null ? favoriteMovie.hashCode() : 0);
        result = 31 * result + (favoriteMusic != null ? favoriteMusic.hashCode() : 0);
        result = 31 * result + (greeting != null ? greeting.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (modifiedDate != null ? modifiedDate.hashCode() : 0);
        result = 31 * result + (recycled != null ? recycled.hashCode() : 0);
        result = 31 * result + (loginDate != null ? loginDate.hashCode() : 0);
        result = 31 * result + (lastLoginDate != null ? lastLoginDate.hashCode() : 0);
        result = 31 * result + (loginIp != null ? loginIp.hashCode() : 0);
        result = 31 * result + (lastLoginIp != null ? lastLoginIp.hashCode() : 0);
        result = 31 * result + (defaultTagId != null ? defaultTagId.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (male != null ? male.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (active != null ? active.hashCode() : 0);
        result = 31 * result + (valid != null ? valid.hashCode() : 0);
        result = 31 * result + (mobilePhone != null ? mobilePhone.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (leftmenu != null ? leftmenu.hashCode() : 0);
        result = 31 * result + (extuserid != null ? extuserid.hashCode() : 0);
        return result;
    }
}
