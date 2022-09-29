package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaCommentsLikeEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaCommentsLikeDao extends JpaRepository<FaCommentsLikeEntity, Integer> {

    @Query(value = "select en from FaCommentsLikeEntity en")
    List<FaCommentsLikeEntity> selectAll();

    @Query(value = "select en from FaCommentsLikeEntity en where en.id = ?1")
    FaCommentsLikeEntity selectById(@Param("id") Integer id);
}
