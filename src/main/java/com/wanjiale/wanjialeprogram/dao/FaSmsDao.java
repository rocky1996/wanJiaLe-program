package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaSmsEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaSmsDao extends JpaRepository<FaSmsEntity, Integer> {

    @Query(value = "select en from FaSmsEntity en")
    List<FaSmsEntity> selectAll();

    @Query(value = "select en from FaSmsEntity en where en.id = ?1")
    FaSmsEntity selectById(@Param("id") Integer id);
}
