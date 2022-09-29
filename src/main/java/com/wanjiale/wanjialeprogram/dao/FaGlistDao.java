package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaGlistEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaGlistDao extends JpaRepository<FaGlistEntity, Integer> {

    @Query(value = "select en from FaGlistEntity en")
    List<FaGlistEntity> selectAll();

    @Query(value = "select en from FaGlistEntity en where en.id = ?1")
    FaGlistEntity selectById(@Param("id") Integer id);
}
