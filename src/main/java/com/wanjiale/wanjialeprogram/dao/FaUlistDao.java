package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaUlistEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaUlistDao extends JpaRepository<FaUlistEntity, Integer> {

    @Query(value = "select en from FaUlistEntity en")
    List<FaUlistEntity> selectAll();

    @Query(value = "select en from FaUlistEntity en where en.id = ?1")
    FaUlistEntity selectById(@Param("id") Integer id);
}
