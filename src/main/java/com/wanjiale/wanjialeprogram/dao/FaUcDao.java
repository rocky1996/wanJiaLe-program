package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaUcEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaUcDao extends JpaRepository<FaUcEntity, Integer> {

    @Query(value = "select en from FaUcEntity en")
    List<FaUcEntity> selectAll();

    @Query(value = "select en from FaUcEntity en where en.id = ?1")
    FaUcEntity selectById(@Param("id") Integer id);
}
