package com.javayh.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.javayh.util.excel.annotation.ExcelField;
import com.javayh.util.excel.annotation.ExcelSheet;
import org.apache.poi.hssf.util.HSSFColor;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Dylan-haiji123
 * @since 2018-10-16
 */
@TableName("sys_user")
@ExcelSheet(name = "用户列表", headColor = HSSFColor.HSSFColorPredefined.BLUE)
public class SysUser{

    @ExcelField(name = "用户ID",width =1,height = 1)
    private String id;
    @ExcelField(name = "用户姓名",width = -35,height = -20)
    private String username;
    @ExcelField(name = "用户密码",width = -35,height = -20)
    private String password;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "SysUser{" +
        ", id=" + id +
        ", username=" + username +
        ", password=" + password +
        "}";
    }
}
