package com.wanjiale.wanjialeprogram.enums;

public enum RestEnum {

    SUCCESS(0, "成功"),
    FAILED(500, "服务端失败"),
    PLEASE_TRY(504, "请重试"),
    ;

    private Integer code;
    private String msg;

    RestEnum() {
    }

    RestEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
