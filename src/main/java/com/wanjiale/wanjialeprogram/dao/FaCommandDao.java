package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaCommandEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaCommandDao extends JpaRepository<FaCommandEntity, Integer> {

    @Query(value = "select en from FaCommandEntity en")
    List<FaCommandEntity> selectAll();

    @Query(value = "select en from FaClistEntity en where en.id = ?1")
    FaCommandEntity selectById(@Param("id") Integer id);
}
