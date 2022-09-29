package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaLikeEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaLikeDao extends JpaRepository<FaLikeEntity, Integer> {

    @Query(value = "select en from FaLikeEntity en")
    List<FaLikeEntity> selectAll();

    @Query(value = "select en from FaLikeEntity en where en.id = ?1")
    FaLikeEntity selectById(@Param("id") Integer id);
}
