package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaRecordEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaRecordDao extends JpaRepository<FaRecordEntity, Integer> {

    @Query(value = "select en from FaRecordEntity en")
    List<FaRecordEntity> selectAll();

    @Query(value = "select en from FaRecordEntity en where en.id = ?1")
    FaRecordEntity selectById(@Param("id") Integer id);
}
