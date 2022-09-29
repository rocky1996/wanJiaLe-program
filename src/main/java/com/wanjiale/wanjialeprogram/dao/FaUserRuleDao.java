package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaUserRuleEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaUserRuleDao extends JpaRepository<FaUserRuleEntity, Integer> {

    @Query(value = "select en from FaUserRuleEntity en")
    List<FaUserRuleEntity> selectAll();

    @Query(value = "select en from FaUserRuleEntity en where en.id = ?1")
    FaUserRuleEntity selectById(@Param("id") Integer id);
}
