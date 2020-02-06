package com.seckill.exception;

/**
 * 重复秒杀异常
 *
 * @author handsome
 * @date 2020年 02月06日 22:01:33
 */
public class RepeatKillException extends SeckillException {

	public RepeatKillException(String message) {
		super(message);
	}

	public RepeatKillException(String message, Throwable cause) {
		super(message, cause);
	}
}
