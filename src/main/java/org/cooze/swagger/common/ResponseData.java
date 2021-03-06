package org.cooze.swagger.common;

import java.io.Serializable;


public class ResponseData<T> implements Serializable {

    private String msg = "OK";
    private String code = "10000";
    private T result;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
