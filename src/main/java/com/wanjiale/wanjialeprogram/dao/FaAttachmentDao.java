package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaAttachmentEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaAttachmentDao extends JpaRepository<FaAttachmentEntity,Integer> {

    @Query(value = "select en from FaAttachmentEntity en")
    List<FaAttachmentEntity> selectAll();

    @Query(value = "select en from FaAttachmentEntity en where en.id = ?1")
    FaAttachmentEntity selectById(@Param("id") Integer id);
}
