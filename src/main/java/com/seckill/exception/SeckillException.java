package com.seckill.exception;

/**
 * 秒杀相关异常
 *
 * @author handsome
 * @date 2020年 02月06日 22:04:07
 */
public class SeckillException extends RuntimeException {

	public SeckillException(String message) {
		super(message);
	}

	public SeckillException(String message, Throwable cause) {
		super(message, cause);
	}
}
