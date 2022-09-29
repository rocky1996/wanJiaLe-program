package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaUserScoreLogEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaUserScoreLogDao extends JpaRepository<FaUserScoreLogEntity, Integer> {

    @Query(value = "select en from FaUserScoreLogEntity en")
    List<FaUserScoreLogEntity> selectAll();

    @Query(value = "select en from FaUserScoreLogEntity en where en.id = ?1")
    FaUserScoreLogEntity selectById(@Param("id") Integer id);
}
