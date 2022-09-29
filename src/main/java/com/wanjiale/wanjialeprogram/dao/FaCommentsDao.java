package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaCommentsEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaCommentsDao extends JpaRepository<FaCommentsEntity, Integer> {

    @Query(value = "select en from FaCommentsEntity en")
    List<FaCommentsEntity> selectAll();

    @Query(value = "select en from FaCommentsEntity en where en.id = ?1")
    FaCommentsEntity selectById(@Param("id") Integer id);
}
