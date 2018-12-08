package com.javayh.service.impl;

import com.javayh.entity.SysRole;
import com.javayh.mapper.SysRoleMapper;
import com.javayh.service.SysRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.javayh.vo.SysRoleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Dylan-haiji123
 * @since 2018-10-21
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public List<?> getList(List<String> list, SysRoleVO vo) {
        return sysRoleMapper.getList(list,vo);
    }
}
