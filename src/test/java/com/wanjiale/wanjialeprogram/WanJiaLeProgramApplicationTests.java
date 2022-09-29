package com.wanjiale.wanjialeprogram;

import com.wanjiale.wanjialeprogram.dao.FaAdminDao;
import com.wanjiale.wanjialeprogram.domain.FaAdminEntity;
import com.wanjiale.wanjialeprogram.util.JacksonUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@SpringBootTest
@Slf4j
@Component
class WanJiaLeProgramApplicationTests {

	@Resource
	private FaAdminDao faAdminDao;

	@Test
	void contextLoads() {
		FaAdminEntity faAdminEntity = faAdminDao.selectById(1);
		log.info(JacksonUtil.beanToStr(faAdminEntity));
	}
}
