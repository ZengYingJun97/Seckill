package com.seckill.service.impl;

import com.seckill.dto.Exposer;
import com.seckill.dto.SeckillExecution;
import com.seckill.entity.Seckill;
import com.seckill.exception.RepeatKillException;
import com.seckill.exception.SeckillCloseException;
import com.seckill.service.SeckillService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml",
		"classpath:spring/spring-service.xml"})
public class SeckillServiceImplTest {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private SeckillService seckillService;

	@Test
	public void getSeckillList() {
		List<Seckill> seckills = seckillService.getSeckillList();
		logger.info("seckills={}", seckills);
	}

	@Test
	public void getById() {
		long id = 1L;
		Seckill seckill = seckillService.getById(id);
		logger.info("seckill={}", seckill);
	}

	@Test
	public void exportSeckillUrl() {
		long id = 1L;
		Exposer exposer = seckillService.exportSeckillUrl(id);
		logger.info("exposer={}", exposer);
	}

	@Test
	public void executeSeckill() {
		long id = 1L;
		long userPhone = 13692916769L;
		String md5 = "6d34ce2c6e6063a118c6e581f6d30887";
		try {
			SeckillExecution seckillExecution = seckillService.executeSeckill(id, userPhone, md5);
			logger.info("seckillExecution={}", seckillExecution);
		} catch (RepeatKillException e) {
			logger.error(e.getMessage());
		} catch (SeckillCloseException e) {
			logger.error(e.getMessage());
		}
	}
}