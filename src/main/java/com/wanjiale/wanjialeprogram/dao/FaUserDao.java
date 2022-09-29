package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaUserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaUserDao extends JpaRepository<FaUserEntity, Integer> {

    @Query(value = "select en from FaUserEntity en")
    List<FaUserEntity> selectAll();

    @Query(value = "select en from FaUserEntity en where en.id = ?1")
    FaUserEntity selectById(@Param("id") Integer id);
}
