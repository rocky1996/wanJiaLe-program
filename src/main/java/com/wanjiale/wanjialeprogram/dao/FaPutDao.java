package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaPutEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaPutDao extends JpaRepository<FaPutEntity, Integer> {

    @Query(value = "select en from FaPutEntity en")
    List<FaPutEntity> selectAll();

    @Query(value = "select en from FaPutEntity en where en.id = ?1")
    FaPutEntity selectById(@Param("id") Integer id);
}
