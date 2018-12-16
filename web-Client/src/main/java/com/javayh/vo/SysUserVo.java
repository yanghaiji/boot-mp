package com.javayh.vo;

import com.javayh.entity.SysUser;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dylan Yang
 * @Title: SysUserVo
 * @ProjectName boot-mp
 * @Description: TODO
 * @date 2018/12/1523:13
 */
public class SysUserVo {
    List<SysUser> vo = new ArrayList();

    public List<SysUser> getVo() {
        return vo;
    }

    public void setVo(List<SysUser> vo) {
        this.vo = vo;
    }
}

