package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaYuserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaYuserDao extends JpaRepository<FaYuserEntity, Integer> {

    @Query(value = "select en from FaYuserEntity en")
    List<FaYuserEntity> selectAll();

    @Query(value = "select en from FaYuserEntity en where en.id = ?1")
    FaYuserEntity selectById(@Param("id") Integer id);
}
