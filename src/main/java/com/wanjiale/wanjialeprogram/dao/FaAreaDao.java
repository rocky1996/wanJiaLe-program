package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaAreaEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaAreaDao extends JpaRepository<FaAreaEntity,Integer> {

    @Query(value = "select en from FaAreaEntity en")
    List<FaAreaEntity> selectAll();

    @Query(value = "select en from FaAreaEntity en where en.id = ?1")
    FaAreaEntity selectById(@Param("id") Integer id);
}
