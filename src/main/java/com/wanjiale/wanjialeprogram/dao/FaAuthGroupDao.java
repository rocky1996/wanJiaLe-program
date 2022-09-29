package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaAuthGroupEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaAuthGroupDao extends JpaRepository<FaAuthGroupEntity, Integer> {

    @Query(value = "select en from FaAuthGroupEntity en")
    List<FaAuthGroupEntity> selectAll();

    @Query(value = "select en from FaAuthGroupEntity en where en.id = ?1")
    FaAuthGroupEntity selectById(@Param("id") Integer id);
}
