package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaEmsEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaEmsDao extends JpaRepository<FaEmsEntity, Integer> {

    @Query(value = "select en from FaEmsEntity en")
    List<FaEmsEntity> selectAll();

    @Query(value = "select en from FaEmsEntity en where en.id = ?1")
    FaEmsEntity selectById(@Param("id") Integer id);
}
