package com.javayh.controller;


import com.baomidou.mybatisplus.service.IService;
import com.javayh.entity.SysUser;
import com.javayh.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Dylan-haiji123
 * @since 2018-10-16
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController  {
    @Autowired
    private SysUserService sysUserService;


    @GetMapping("getSysUserService")
    public SysUser getSysUserService() {
        return sysUserService.selectById(2L);
    }
}

