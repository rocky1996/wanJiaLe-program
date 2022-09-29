package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaClistEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaClistDao extends JpaRepository<FaClistEntity, Integer> {

    @Query(value = "select en from FaClistEntity en")
    List<FaClistEntity> selectAll();

    @Query(value = "select en from FaClistEntity en where en.id = ?1")
    FaClistEntity selectById(@Param("id") Integer id);
}
