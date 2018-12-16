package com.javayh.mapper;

import com.javayh.entity.SysUser;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Dylan-haiji123
 * @since 2018-10-16
 */
@Mapper
@Component
public interface SysUserMapper extends BaseMapper<SysUser> {

    @Update(value = "update sys_user set username=#{username},password=#{password} where id=#{id}")
    SysUser updateSysUser(String username,String password,String id);
}
