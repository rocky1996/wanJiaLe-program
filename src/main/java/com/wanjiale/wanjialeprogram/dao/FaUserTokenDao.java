package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaUserTokenEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaUserTokenDao extends JpaRepository<FaUserTokenEntity, Integer> {

    @Query(value = "select en from FaUserTokenEntity en")
    List<FaUserTokenEntity> selectAll();

    @Query(value = "select en from FaUserTokenEntity en where en.id = ?1")
    FaUserTokenEntity selectById(@Param("id") Integer id);
}
