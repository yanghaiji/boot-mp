package com.javayh.util.aop.enums;

/**
 * @author Dylan Yang
 * @Title: LogAspectType
 * @ProjectName boot-mp
 * @Description: TODO
 * @date 2018/12/2218:02
 */
public enum LogAspectType {
    /**
     * 操作类型
     */
    UNKNOWN("unknown"),
    DELETE("delete"),
    SELECT("select"),
    UPDATE("update"),
    INSERT("insert");

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    LogAspectType(String s) {
        this.value = s;
    }
}


