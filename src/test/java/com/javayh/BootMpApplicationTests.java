package com.javayh;

import com.javayh.entity.SysUser;
import com.javayh.excel.ExcelExportUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootMpApplicationTests {

    @Test
    public void contextLoads() throws Exception{
        List<SysUser> list = new ArrayList<>();
        for(int i =0;i<10000;i++){
            SysUser sysUser = new SysUser();
            sysUser.setId("User"+i);
            sysUser.setUsername("UserName"+i);
            sysUser.setPassword("Password"+i);
            list.add(sysUser);
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        simpleDateFormat.format(date);
//        String keyLvaue = "用戶id:id,姓名:username,密码:password";
//        ExcelUtil.exportExcel("C:/Users/yanghaiji/Desktop/www.xlsx",keyLvaue,list,"com.javayh.entity.SysUser" );

        ExcelExportUtil.exportToFile("C:/Users/yanghaiji/Desktop/www.xlsx",list);
//        ExcelUtils.write(list,"C:/Users/yanghaiji/Desktop/www.xlsx");
    }

}
