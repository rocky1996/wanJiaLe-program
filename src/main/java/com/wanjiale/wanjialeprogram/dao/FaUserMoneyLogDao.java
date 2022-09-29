package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaUserMoneyLogEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaUserMoneyLogDao extends JpaRepository<FaUserMoneyLogEntity, Integer> {

    @Query(value = "select en from FaUserMoneyLogEntity en")
    List<FaUserMoneyLogEntity> selectAll();

    @Query(value = "select en from FaUserMoneyLogEntity en where en.id = ?1")
    FaUserMoneyLogEntity selectById(@Param("id") Integer id);
}
