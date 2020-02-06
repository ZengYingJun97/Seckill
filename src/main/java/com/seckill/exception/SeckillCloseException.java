package com.seckill.exception;

/**
 * 秒杀关闭异常
 *
 * @author handsome
 * @date 2020年 02月06日 22:02:44
 */
public class SeckillCloseException extends SeckillException{

	public SeckillCloseException(String message) {
		super(message);
	}

	public SeckillCloseException(String message, Throwable cause) {
		super(message, cause);
	}
}
