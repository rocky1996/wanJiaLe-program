package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaCaEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaCaDao extends JpaRepository<FaCaEntity, Integer> {

    @Query(value = "select en from FaCaEntity en")
    List<FaCaEntity> selectAll();

    @Query(value = "select en from FaCaEntity en where en.id = ?1")
    FaCaEntity selectById(@Param("id") Integer id);
}
