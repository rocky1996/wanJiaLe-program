package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaSaEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaSaDao extends JpaRepository<FaSaEntity, Integer> {

    @Query(value = "select en from FaSaEntity en")
    List<FaSaEntity> selectAll();

    @Query(value = "select en from FaSaEntity en where en.id = ?1")
    FaSaEntity selectById(@Param("id") Integer id);
}
