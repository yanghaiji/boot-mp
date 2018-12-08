package com.javayh.controller;


import com.javayh.entity.JsSysOffice;
import com.javayh.service.JsSysOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 * 组织机构表 前端控制器
 * </p>
 *
 * @author Dylan-haiji123
 * @since 2018-11-19
 */
@Controller
@RequestMapping("/jsSysOffice")
public class JsSysOfficeController {

    @Autowired
    private JsSysOfficeService officeService;



}

