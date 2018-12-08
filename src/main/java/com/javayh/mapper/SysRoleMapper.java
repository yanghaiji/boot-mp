package com.javayh.mapper;

import com.javayh.entity.SysRole;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.javayh.vo.SysRoleVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Dylan-haiji123
 * @since 2018-10-21
 */
@Mapper
@Component
public interface SysRoleMapper extends BaseMapper<SysRole> {

    List<?> getList(@Param("list") List<String> list,@Param("vo") SysRoleVO vo);
}
