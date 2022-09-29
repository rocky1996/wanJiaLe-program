package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaShopEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaShopDao extends JpaRepository<FaShopEntity, Integer> {

    @Query(value = "select en from FaShopEntity en")
    List<FaShopEntity> selectAll();

    @Query(value = "select en from FaShopEntity en where en.id = ?1")
    FaShopEntity selectById(@Param("id") Integer id);
}
