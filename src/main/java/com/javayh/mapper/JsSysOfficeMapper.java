package com.javayh.mapper;

import com.javayh.entity.JsSysOffice;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.javayh.TreeNode;
import java.util.List;

/**
 * <p>
 * 组织机构表 Mapper 接口
 * </p>
 *
 * @author Dylan-haiji123
 * @since 2018-11-19
 */
@Component
@Mapper
public interface JsSysOfficeMapper extends BaseMapper<JsSysOffice> {

//    @ResultType(com.javayh.TreeNode.class)
//    @Select(value = "select * from js_sys_office")
    List<TreeNode> getListAll();
}
