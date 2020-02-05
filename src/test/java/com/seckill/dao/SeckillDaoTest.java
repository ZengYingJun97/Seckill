package com.seckill.dao;

import com.seckill.entity.Seckill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest {

	//注入Dao实现类依赖
	@Resource
	private SeckillDao seckillDao;

	@Test
	public void reduceNumber() throws Exception {
//		long seckillId = 1;
//		seckillDao.
	}

	@Test
	public void queryById() throws Exception {
		long seckillId = 1;
		Seckill seckill = seckillDao.queryById(seckillId);
		System.out.println(seckill);
	}

	@Test
	public void queryAll() {
	}
}