package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaAuthGroupEntity;
import com.wanjiale.wanjialeprogram.domain.FaAuthRuleEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaAuthRuleDao extends JpaRepository<FaAuthRuleEntity, Integer> {

    @Query(value = "select en from FaAuthRuleEntity en")
    List<FaAuthRuleEntity> selectAll();

    @Query(value = "select en from FaAuthRuleEntity en where en.id = ?1")
    FaAuthRuleEntity selectById(@Param("id") Integer id);
}
