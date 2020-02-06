package com.seckill.enums;

/**
 * 秒杀状态枚举
 *
 * @author handsome
 * @date 2020年 02月06日 22:35:44
 */
public enum SeckillStateEnum {
	SUCCESS(1, "秒杀成功"),
	END(0, "秒杀结束"),
	REPEAT_KILL(-1, "重复秒杀"),
	INNER_ERROR(-2, "系统异常"),
	DATA_REWRITE(-3, "数据篡改");


	private int state;

	private String stateInfo;

	public int getState() {
		return state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	SeckillStateEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}

	public static SeckillStateEnum stateOf(int index) {
		for (SeckillStateEnum state: values()) {
			if (state.getState() == index) {
				return state;
			}
		}
		return null;
	}
}
