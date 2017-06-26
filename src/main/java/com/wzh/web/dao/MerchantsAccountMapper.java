package com.wzh.web.dao;

import com.wzh.web.Do.MerchantsAccount;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by wangzhenhui on 2017/6/26.
 */
@Mapper
public interface MerchantsAccountMapper {

    @Select("SELECT * FROM T_Account_Merchants WHERE ID = #{id}")
    MerchantsAccount findByID(@Param("id") String id);

    @Select("SELECT * FROM T_Account_Merchants")
    List<MerchantsAccount> findAll();

//    @Insert("INSERT INTO T_ACCOUNT_MERCHANTS(ID, USER_ID) VALUES(#{id}, #{userId})")
//    int insert(@Param("id") Integer id, @Param("userId") String userId);


    @Insert("INSERT INTO T_Account_Merchants(ID, USER_ID,ACCOUNT_STATUS,ACCOUNT_TYPE,CHANNEL_ID,CREATE_TIME,MODIFY_TIME) " +
            "VALUES(#{id}, #{userId},#{accountType},#{accountStatus},#{channelId},#{createTime},#{modifyTime})")
    int insert(MerchantsAccount account);


    @Update("UPDATE T_Account_Merchants SET ACCOUNT_STATUS=#{accountStatus} WHERE id=#{id}")
    int updateStatus(MerchantsAccount account);

    @Delete("DELETE FROM T_Account_Merchants WHERE id =#{id}")
    int deleteAccount(MerchantsAccount account);
}
