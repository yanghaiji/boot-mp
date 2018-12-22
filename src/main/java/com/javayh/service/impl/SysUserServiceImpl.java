package com.javayh.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.javayh.entity.SysUser;
import com.javayh.mapper.SysUserMapper;
import com.javayh.service.SysUserService;
import com.javayh.util.aop.annotation.LogAspect;
import com.javayh.util.aop.enums.LogAspectType;
import com.javayh.util.aop.enums.LogAspectUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Dylan-haiji123
 * @since 2018-10-16
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public int updateSysUser(HttpServletRequest request) {
        Map<String,Object> map = new HashMap<>();
        map.put("id",request.getParameter("id"));
        map.put("username",request.getParameter("username"));
        map.put("password",request.getParameter("password"));
        return sysUserMapper.updateMap(map);
    }

    @LogAspect/*(detail = "查询所有用户信息[{{tel}}]",level = 3,logAspectUnit = LogAspectUnit.SYSUSER,logAspectType = LogAspectType.SELECT)*/
    @Override
    public List<SysUser> findAll() {
        return this.sysUserMapper.findAll();
    }
}
