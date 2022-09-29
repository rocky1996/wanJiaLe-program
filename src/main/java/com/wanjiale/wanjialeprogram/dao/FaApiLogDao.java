package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaApiLogEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaApiLogDao extends JpaRepository<FaApiLogEntity,Integer> {

    @Query(value = "select en from FaApiLogEntity en")
    List<FaApiLogEntity> selectAll();

    @Query(value = "select en from FaApiLogEntity en where en.id = ?1")
    FaApiLogEntity selectById(@Param("id") Integer id);
}
