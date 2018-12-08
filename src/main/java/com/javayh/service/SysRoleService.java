package com.javayh.service;

import com.javayh.entity.SysRole;
import com.baomidou.mybatisplus.service.IService;
import com.javayh.vo.SysRoleVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Dylan-haiji123
 * @since 2018-10-21
 */
@Service
public interface SysRoleService extends IService<SysRole> {

    List<?> getList(@Param("list") List<String> list, @Param("vo") SysRoleVO vo);
}
