package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaGcEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaGcDao extends JpaRepository<FaGcEntity, Integer> {

    @Query(value = "select en from FaGcEntity en")
    List<FaGcEntity> selectAll();

    @Query(value = "select en from FaGcEntity en where en.id = ?1")
    FaGcEntity selectById(@Param("id") Integer id);
}
