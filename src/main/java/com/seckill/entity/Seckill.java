package com.seckill.entity;

import java.util.Date;

/**
 * Create by ZengYingJun97 on 20/02/05
 */
public class Seckill {

    private long seckillId;

    private String name;

    private int number;

    private Date createTime;

    private Date startTime;

    private Date endTime;

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public long getSeckillId() {
        return seckillId;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }
}
