package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaGoodsEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaGoodsDao extends JpaRepository<FaGoodsEntity, Integer> {

    @Query(value = "select en from FaGoodsEntity en")
    List<FaGoodsEntity> selectAll();

    @Query(value = "select en from FaGoodsEntity en where en.id = ?1")
    FaGoodsEntity selectById(@Param("id") Integer id);
}
