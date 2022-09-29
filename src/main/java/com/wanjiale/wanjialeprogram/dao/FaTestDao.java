package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaTestEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaTestDao extends JpaRepository<FaTestEntity, Integer> {

    @Query(value = "select en from FaTestEntity en")
    List<FaTestEntity> selectAll();

    @Query(value = "select en from FaTestEntity en where en.id = ?1")
    FaTestEntity selectById(@Param("id") Integer id);
}
