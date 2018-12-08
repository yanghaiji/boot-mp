package com.javayh.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Dylan Yang
 * @Title: SysRoleVO
 * @ProjectName boot-mp
 * @Description: TODO
 * @date 2018/12/819:47
 */
public class SysRoleVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private Boolean available;
    private String description;
    private String role;

    List<String> descList = new ArrayList<>();

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<String> getDescList() {
        return descList;
    }

    public void setDescList(List<String> descList) {
        this.descList = descList;
    }
}

