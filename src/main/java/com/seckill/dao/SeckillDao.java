package com.seckill.dao;

import com.seckill.entity.Seckill;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * SeckillDao
 * @author handsome
 * @date 2020年 02月05日 18:28:05
 */
public interface SeckillDao {

    /**
     * 减库存
     * @date 2020/02/05 18:24:59
     * @author handsome
     * @param seckillId
     * @param killTime
     * @return int
     */
    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    /**
     * 通过id查询秒杀商品
     * @date 2020/02/05 18:23:45
     * @author handsome
     * @param seckillId
     * @return com.seckill.entity.Seckill
     */
    Seckill queryById(long seckillId);

    /**
     * 通过偏移量查询秒杀商品列表
     * @date 2020/02/05 18:23:59
     * @author handsome
     * @param offset
     * @param limit
     * @return java.util.List<com.seckill.entity.Seckill>
     */
    List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);


}
