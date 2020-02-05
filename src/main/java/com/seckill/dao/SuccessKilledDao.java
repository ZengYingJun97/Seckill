package com.seckill.dao;

import com.seckill.entity.SuccessKilled;

/**
 * SuccessKilledDao
 * @author handsome
 * @date 2020年 02月05日 18:28:05
 */
public interface SuccessKilledDao {

	/**
	 * 插入购买明细，过滤重复
	 * @date 2020/02/05 18:32:42
	 * @author handsome
	 * @param seckillId
	 * @param userPhone
	 * @return int
	 */        
	int insertSuccessKilled(long seckillId, long userPhone);

	/**
	 * 通过id查询SuccessKilled并携带秒杀产品对象实体
	 * @date 2020/02/05 18:36:06
	 * @author handsome
	 * @param seckillId
	 * @return com.seckill.entity.SuccessKilled
	 */        
	SuccessKilled queryByIdWithSeckill(long seckillId);
}
