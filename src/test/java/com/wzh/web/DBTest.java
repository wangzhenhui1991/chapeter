package com.wzh.web;

import com.wzh.web.Do.MerchantsAccount;
import com.wzh.web.Do.ZaAreaEntity;
import com.wzh.web.dao.MerchantsAccountDao;
import com.wzh.web.dao.MerchantsAccountMapper;
import com.wzh.web.dao.ZaAreaDao;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

/**
 * Created by wangzhenhui on 2017/6/26.
 */
public class DBTest extends BaseTest {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ZaAreaDao zaAreaDao;
    @Autowired
    private MerchantsAccountDao merchantsAccountDao;
    @Autowired
    private MerchantsAccountMapper merchantsAccountMapper;

    @Test
    public void getTable(){

        logger.info(zaAreaDao.findNoSupport().toString());
    }
    @Test
    public void insertZaArea(){
        ZaAreaEntity  za = new ZaAreaEntity();
        za.setId(123);
        zaAreaDao.save(za);
    }


    @Test
    public void insertMerchantsAccount(){
        MerchantsAccount account = new MerchantsAccount();
        account.setId(UUID.randomUUID().getLeastSignificantBits());
        account.setAccountStatus(101);
        account.setAccountType(1);
        account.setChannelId(UUID.randomUUID().toString());
        account.setUserId(UUID.randomUUID().toString());
        account.setCreateTime(new Timestamp(new Date().getTime()));
        account.setModifyTime(new Timestamp(new Date().getTime()));
//        merchantsAccountMapper.insert(account);
        merchantsAccountDao.save(account);
    }

    @Test
    public void getMerchantsAccount(){
//        logger.info(merchantsAccountDao.findAll().toString());
        for(MerchantsAccount acc:merchantsAccountDao.findAll()){
            logger.info(acc.toString());
        }

    }

    @Test
    public void getMerchantAccountById(){
        logger.info(merchantsAccountDao.findById(-5001966741261684301L).toString());
    }



}
