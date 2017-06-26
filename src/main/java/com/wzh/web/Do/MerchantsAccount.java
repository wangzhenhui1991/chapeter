package com.wzh.web.Do;


import com.wzh.web.Util.Printable;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by wangzhenhui on 2017/6/26.
 */
@Entity
@Table(name = "t_account_merchants")
public class MerchantsAccount extends Printable{

    private Long id;
    private String userId;
    private Integer accountType;
    private Integer accountStatus;
    private String channelId;
    private Timestamp createTime;
    private Timestamp modifyTime;

    @Id
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Basic
    @Column(name = "USER_ID")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    @Basic
    @Column(name = "ACCOUNT_TYPE")
    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }
    @Basic
    @Column(name = "ACCOUNT_STATUS")
    public Integer getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(Integer accountStatus) {
        this.accountStatus = accountStatus;
    }
    @Basic
    @Column(name = "CHANNEL_ID")
    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }
    @Basic
    @Column(name = "CREATE_TIME")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
    @Basic
    @Column(name = "MODIFY_TIME")
    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }


}
