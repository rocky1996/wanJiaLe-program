package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaConfigEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaConfigDao extends JpaRepository<FaConfigEntity, Integer> {

    @Query(value = "select en from FaConfigEntity en")
    List<FaConfigEntity> selectAll();

    @Query(value = "select en from FaConfigEntity en where en.id = ?1")
    FaConfigEntity selectById(@Param("id") Integer id);
}
