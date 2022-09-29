package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaSignEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaSignDao extends JpaRepository<FaSignEntity, Integer> {

    @Query(value = "select en from FaSignEntity en")
    List<FaSignEntity> selectAll();

    @Query(value = "select en from FaSignEntity en where en.id = ?1")
    FaSignEntity selectById(@Param("id") Integer id);
}
