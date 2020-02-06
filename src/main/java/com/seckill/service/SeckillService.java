package com.seckill.service;

import com.seckill.dto.Exposer;
import com.seckill.dto.SeckillExecution;
import com.seckill.entity.Seckill;
import com.seckill.exception.RepeatKillException;
import com.seckill.exception.SeckillCloseException;
import com.seckill.exception.SeckillException;

import java.util.List;

/**
 * @author handsome
 * @date 2020年 02月06日 20:35:15
 */
public interface SeckillService {

	/**
	 * 查询所有秒杀记录
	 * @date 2020/02/06 20:36:37
	 * @author handsome
	 * @param
	 * @return java.util.List<com.seckill.entity.Seckill>
	 */
	List<Seckill> getSeckillList();

	/**
	 * 查询单个秒杀记录
	 * @date 2020/02/06 20:37:14
	 * @author handsome
	 * @param seckillId
	 * @return com.seckill.entity.Seckill
	 */        
	Seckill getById(long seckillId);

	/**
	 * 秒杀开启输出接口地址否则输出系统时间和秒杀时间
	 * @date 2020/02/06 21:56:56
	 * @author handsome
	 * @param seckillId
	 * @return com.seckill.dto.Exposer
	 */        
	Exposer exportSeckillUrl(long seckillId);

	/**
	 * 执行秒杀操作
	 * @param seckillId
	 * @param userPhone
	 * @param md5
	 */
	SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
			throws SeckillException, RepeatKillException, SeckillCloseException;
}
