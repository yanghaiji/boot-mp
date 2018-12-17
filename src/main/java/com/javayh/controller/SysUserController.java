package com.javayh.controller;


import com.javayh.entity.SysUser;
import com.javayh.mapper.SysUserMapper;
import com.javayh.service.JsSysOfficeService;
import com.javayh.service.SysUserService;
import com.javayh.util.tree.BuildTree;
import com.javayh.util.tree.TreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
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

    @Autowired
    private SysUserMapper sysUserMapper;

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

    @GetMapping("getMap")
    public int getMap(HttpServletRequest request){
        return sysUserService.updateSysUser(request);
    }

    @GetMapping("/download")
    public String downloadFile(HttpServletRequest request, HttpServletResponse response) {
        String fileName = "计划安排表.xlsx";// 文件名
        if (fileName != null) {
            //设置文件路径
            File file = new File("C:/Users/计划安排表.xlsx");
            //File file = new File(realPath , fileName);
            if (file.exists()) {
                response.setContentType("application/force-download");// 设置强制下载不打开
                response.addHeader("Content-Disposition", "attachment;fileName=" + fileName);// 设置文件名
                byte[] buffer = new byte[1024];
                FileInputStream fis = null;
                BufferedInputStream bis = null;
                try {
                    fis = new FileInputStream(file);
                    bis = new BufferedInputStream(fis);
                    OutputStream os = response.getOutputStream();
                    int i = bis.read(buffer);
                    while (i != -1) {
                        os.write(buffer, 0, i);
                        i = bis.read(buffer);
                    }
                    return "下载成功";
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (bis != null) {
                        try {
                            bis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (fis != null) {
                        try {
                            fis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return "下载失败libjh";
    }

}

