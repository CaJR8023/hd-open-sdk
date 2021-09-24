package com.fkw.hdopen.model;

import com.fkw.hdopen.comm.JsonUtils;

/**
 * 统一返回
 *
 * @author CAJR
 * @version 1.0.0
 */
public class Result<T> {
    private int code;
    private int flow;
    private String msg;
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getFlow() {
        return flow;
    }

    public void setFlow(int flow) {
        this.flow = flow;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return JsonUtils.toString(this);
    }
}
