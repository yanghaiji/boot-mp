package com.javayh.service;

import com.javayh.entity.JsSysOffice;
import com.baomidou.mybatisplus.service.IService;

import com.javayh.util.tree.TreeNode;
import java.util.List;

/**
 * <p>
 * 组织机构表 服务类
 * </p>
 *
 * @author Dylan-haiji123
 * @since 2018-11-19
 */
public interface JsSysOfficeService extends IService<JsSysOffice> {

    List<TreeNode> getList();

}
