package com.wzh.web.dao;

import com.wzh.web.Do.ZaAreaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ZaAreaDao extends JpaRepository<ZaAreaEntity,String> {
    //根据城市简称查询状态大于0的数据
    @Query(value = "select * from  za_area where status > 0 AND short_name=?1",nativeQuery = true)
    List<ZaAreaEntity> find(String indexCarNo);

    //上海 北京 重庆 天津走这个渠道.
    @Query(value = "select * from  za_area where status > 0 AND province_id=?1",nativeQuery = true)
    List<ZaAreaEntity> find1(String cityId);

    //查询众安所有不支持的城市;
    @Query(value = "select * from  za_area where status = 0",nativeQuery = true)
    List<ZaAreaEntity>  findNoSupport();

    //查询众安所有支持的城市;
    @Query(value = "select * from  za_area where status > 0",nativeQuery = true)
    List<ZaAreaEntity>  findSupport();

    //根据cityId查询众安对应数据;
    @Query(value = "select * from  za_area where city_id=?1",nativeQuery = true)
    List<ZaAreaEntity>  findone(String cityId);

    //根据cityId查询众安对应数据(上海 北京 重庆 天津走这个渠道);
    @Query(value = "select * from  za_area where province_id=?1",nativeQuery = true)
    List<ZaAreaEntity>  findtwo(String cityId);

    @Query(value = "select distinct province_id from  za_area where province_name like %?1%",nativeQuery = true)
    Integer findProvinceIDByProvinceName(String proName);

    //根据cityName查询众安对应数据的状态;
    @Query(value = "select * from  za_area where city_name=?1",nativeQuery = true)
    List<ZaAreaEntity> findCityInfo(String city_name);


    @Query(value = "select distinct city_id from  za_area where city_name like %?1%",nativeQuery = true)
    Integer findCityIDByCityName(String cityName);

    @Query(value = "select distinct area_id from  za_area where area_name like %?1%",nativeQuery = true)
    Integer findAreaIdByAreaName(String areaName);
}
