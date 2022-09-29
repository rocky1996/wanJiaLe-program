package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaAdminEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaAdminDao extends JpaRepository<FaAdminEntity,Integer> {

    @Query(value = "select en from FaAdminEntity en")
    List<FaAdminEntity> selectAll();

    @Query(value = "select en from FaAdminEntity en where en.id = ?1")
    FaAdminEntity selectById(@Param("id") Integer id);
}
