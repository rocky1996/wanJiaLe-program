package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaScEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaScDao extends JpaRepository<FaScEntity, Integer> {

    @Query(value = "select en from FaScEntity en")
    List<FaScEntity> selectAll();

    @Query(value = "select en from FaScEntity en where en.id = ?1")
    FaScEntity selectById(@Param("id") Integer id);
}
