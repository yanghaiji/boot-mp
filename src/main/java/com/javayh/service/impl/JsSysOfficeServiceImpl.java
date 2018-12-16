package com.javayh.service.impl;

import com.javayh.util.tree.TreeNode;
import com.javayh.entity.JsSysOffice;
import com.javayh.mapper.JsSysOfficeMapper;
import com.javayh.service.JsSysOfficeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 组织机构表 服务实现类
 * </p>
 *
 * @author Dylan-haiji123
 * @since 2018-11-19
 */
@Service
public class JsSysOfficeServiceImpl extends ServiceImpl<JsSysOfficeMapper, JsSysOffice> implements JsSysOfficeService {

    @Autowired
    private JsSysOfficeMapper officeMapper;

//    @Override
//    public List<TreeNode> getList() {
//        List<JsSysOffice> all = officeMapper.getAll();
//        // 最后的结果
//        List<JsSysOffice> officeList = new ArrayList<JsSysOffice>();
//        // 先找到所有的一级机构
//        for (int i = 0; i < all.size(); i++) {
//            // 一级机构没有parentCode
//            if (StringUtils.isBlank(all.get(i).getParentCode())) {
//                officeList.add(all.get(i));
//            }
//        }
//        // 为一级菜单设置子菜单，getChild是递归调用的
//        for (JsSysOffice office : officeList) {
//            office.setChildMenus(getChild(office.getOfficeCode(), officeList));
//        }
//        return officeList;
//    }

    private List<JsSysOffice> getChild(String id, List<JsSysOffice> rootMenu) {
        // 子菜单
        List<JsSysOffice> childList = new ArrayList<>();
        for (JsSysOffice menu : rootMenu) {
            // 遍历所有节点，将父菜单id与传过来的id比较
            if (StringUtils.isNotBlank(menu.getParentCode())) {
                if (menu.getParentCode().equals(id)) {
                    childList.add(menu);
                }
            }
        }
        // 把子菜单的子菜单再循环一遍
        for (JsSysOffice menu : childList) {// 没有url子菜单还有子菜单
            if (StringUtils.isBlank(menu.getTreeLevel().toString())) {
                // 递归
//                menu.setChildMenus(getChild(menu.getOfficeCode(), rootMenu));
            }
        } // 递归退出条件
        if (childList.size() == 0) {
            return null;
        }
        return childList;
    }

    @Override
    public List<TreeNode> getList() {
        return officeMapper.getListAll();
    }
}