package com.wzh.web.dao;

import com.wzh.web.Do.MerchantsAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by wangzhenhui on 2017/6/26.
 */

public interface MerchantsAccountDao extends JpaRepository<MerchantsAccount,String> {


    MerchantsAccount findById(Long id);



}
