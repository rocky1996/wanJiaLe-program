package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaAdminLogEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaAdminLogDao extends JpaRepository<FaAdminLogEntity,Integer> {

    @Query(value = "select en from FaAdminLogEntity en")
    List<FaAdminLogEntity> selectAll();

    @Query(value = "select en from FaAdminLogEntity en where en.id = ?1")
    FaAdminLogEntity selectById(@Param("id") Integer id);
}
