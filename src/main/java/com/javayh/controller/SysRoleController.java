package com.javayh.controller;


import com.javayh.mapper.SysRoleMapper;
import com.javayh.service.SysRoleService;
import com.javayh.vo.SysRoleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Dylan-haiji
 * @since 2018-10-21
 */
@RestController
@RequestMapping("/sysRole")
public class SysRoleController {

    @Autowired
    private SysRoleService sysRoleService;

    @PostMapping(value = "/getList")
    public List<?> getList(SysRoleVO vo){
        List<String> list = new ArrayList();
        for(String str : vo.getDescList()){
            list.add(str);
        }
        return  sysRoleService.getList(list,vo);
    }
}

