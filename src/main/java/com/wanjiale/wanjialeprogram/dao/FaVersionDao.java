package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaVersionEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaVersionDao extends JpaRepository<FaVersionEntity, Integer> {

    @Query(value = "select en from FaVersionEntity en")
    List<FaVersionEntity> selectAll();

    @Query(value = "select en from FaVersionEntity en where en.id = ?1")
    FaVersionEntity selectById(@Param("id") Integer id);
}
