package com.javayh.service;

import com.baomidou.mybatisplus.service.IService;
import com.javayh.entity.SysUser;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Dylan-haiji123
 * @since 2018-10-16
 */
public interface SysUserService extends IService<SysUser> {
   int updateSysUser(HttpServletRequest request);
}
