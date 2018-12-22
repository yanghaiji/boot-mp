package com.javayh.util.aop.enums;

/**
 * @author Dylan Yang
 * @Title: LogAspectUnit
 * @ProjectName boot-mp
 * @Description: TODO
 * @date 2018/12/2218:03
 */
public enum LogAspectUnit {
    /**
     * 被操作的单元
     */
    UNKNOWN("unknown"),
    Redis("redis"),
    SYSUSER("sys_user");

    private String value;

    LogAspectUnit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
