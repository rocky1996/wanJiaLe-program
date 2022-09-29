package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaUserGroupEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaUserGroupDao extends JpaRepository<FaUserGroupEntity, Integer> {

    @Query(value = "select en from FaUserGroupEntity en")
    List<FaUserGroupEntity> selectAll();

    @Query(value = "select en from FaUserGroupEntity en where en.id = ?1")
    FaUserGroupEntity selectById(@Param("id") Integer id);
}
