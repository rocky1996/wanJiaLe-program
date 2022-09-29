package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaCategoryEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaCategoryDao extends JpaRepository<FaCategoryEntity, Integer> {

    @Query(value = "select en from FaCategoryEntity en")
    List<FaCategoryEntity> selectAll();

    @Query(value = "select en from FaCategoryEntity en where en.id = ?1")
    FaCategoryEntity selectById(@Param("id") Integer id);
}
