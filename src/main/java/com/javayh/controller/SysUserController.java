package com.javayh.controller;


import com.javayh.util.tree.BuildTree;
import com.javayh.util.tree.TreeNode;
import com.javayh.entity.SysUser;
import com.javayh.service.JsSysOfficeService;
import com.javayh.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Dylan-haiji
 * @since 2018-10-16
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController  {
    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private JsSysOfficeService officeService;

    @GetMapping("getList")
    public List<TreeNode> getList(){
        BuildTree buildTree=new BuildTree();
        List<TreeNode> list=officeService.getList();
        List<TreeNode> list2= buildTree.buildTree(list);
        return list2;
    }

    @GetMapping("getSysUserService")
    public SysUser getSysUserService() {
        return sysUserService.selectById(2L);
    }
}

