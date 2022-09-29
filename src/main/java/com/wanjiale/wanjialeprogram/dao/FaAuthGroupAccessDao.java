package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaAuthGroupAccessEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaAuthGroupAccessDao extends JpaRepository<FaAuthGroupAccessEntity, Integer> {

    @Query(value = "select en from FaAuthGroupAccessEntity en")
    List<FaAuthGroupAccessEntity> selectAll();

    @Query(value = "select en from FaAuthGroupAccessEntity en where en.id = ?1")
    FaAuthGroupAccessEntity selectById(@Param("id") Integer id);
}
