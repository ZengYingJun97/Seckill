package com.seckill.dao;

import com.seckill.entity.SuccessKilled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {

	//注入Dao实现类依赖
	@Resource
	private SuccessKilledDao successKilledDao;

	@Test
	public void insertSuccessKilled() {
		long id = 2L;
		long userPhone = 13692916769L;
		int insertCount = successKilledDao.insertSuccessKilled(id, userPhone);
		System.out.println("insertCount = " + insertCount);
	}

	@Test
	public void queryByIdWithSeckill() {
		long id = 2L;
		long userPhone = 13692916769L;
		SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(id);
		System.out.println(successKilled);
		System.out.println(successKilled.getSeckill());
	}
}