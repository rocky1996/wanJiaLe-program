package com.wanjiale.wanjialeprogram.dao;

import com.wanjiale.wanjialeprogram.domain.FaAuthGroupAccessEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaAuthGroupAccessDao extends JpaRepository<FaAuthGroupAccessEntity, Integer> {
}
