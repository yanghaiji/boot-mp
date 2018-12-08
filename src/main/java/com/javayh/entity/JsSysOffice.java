package com.javayh.entity;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 组织机构表
 * </p>
 *
 * @author Dylan-haiji123
 * @since 2018-11-19
 */
@TableName("js_sys_office")
public class JsSysOffice implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 机构编码
     */
    @TableId("office_code")
    private String officeCode;
    /**
     * 父级编号
     */
    @TableField("parent_code")
    private String parentCode;
    /**
     * 所有父级编号
     */
    @TableField("parent_codes")
    private String parentCodes;
    /**
     * 本级排序号（升序）
     */
    @TableField("tree_sort")
    private BigDecimal treeSort;
    /**
     * 所有级别排序号
     */
    @TableField("tree_sorts")
    private String treeSorts;
    /**
     * 是否最末级
     */
    @TableField("tree_leaf")
    private String treeLeaf;
    /**
     * 层次级别
     */
    @TableField("tree_level")
    private BigDecimal treeLevel;
    /**
     * 全节点名
     */
    @TableField("tree_names")
    private String treeNames;
    /**
     * 机构代码
     */
    @TableField("view_code")
    private String viewCode;
    /**
     * 机构名称
     */
    @TableField("office_name")
    private String officeName;
    /**
     * 机构全称
     */
    @TableField("full_name")
    private String fullName;
    /**
     * 机构类型
     */
    @TableField("office_type")
    private String officeType;
    /**
     * 负责人
     */
    private String leader;
    /**
     * 办公电话
     */
    private String phone;
    /**
     * 联系地址
     */
    private String address;
    /**
     * 邮政编码
     */
    @TableField("zip_code")
    private String zipCode;
    /**
     * 电子邮箱
     */
    private String email;
    /**
     * 状态（0正常 1删除 2停用）
     */
    private String status;
    /**
     * 创建者
     */
    @TableField("create_by")
    private String createBy;
    /**
     * 创建时间
     */
    @TableField("create_date")
    private Date createDate;
    /**
     * 更新者
     */
    @TableField("update_by")
    private String updateBy;
    /**
     * 更新时间
     */
    @TableField("update_date")
    private Date updateDate;
    /**
     * 备注信息
     */
    private String remarks;
    /**
     * 租户代码
     */
    @TableField("corp_code")
    private String corpCode;
    /**
     * 租户名称
     */
    @TableField("corp_name")
    private String corpName;

    /**
      * 获取子机构信息
      */
//    private List<JsSysOffice> childMenus;

    public String getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getParentCodes() {
        return parentCodes;
    }

    public void setParentCodes(String parentCodes) {
        this.parentCodes = parentCodes;
    }

    public BigDecimal getTreeSort() {
        return treeSort;
    }

    public void setTreeSort(BigDecimal treeSort) {
        this.treeSort = treeSort;
    }

    public String getTreeSorts() {
        return treeSorts;
    }

    public void setTreeSorts(String treeSorts) {
        this.treeSorts = treeSorts;
    }

    public String getTreeLeaf() {
        return treeLeaf;
    }

    public void setTreeLeaf(String treeLeaf) {
        this.treeLeaf = treeLeaf;
    }

    public BigDecimal getTreeLevel() {
        return treeLevel;
    }

    public void setTreeLevel(BigDecimal treeLevel) {
        this.treeLevel = treeLevel;
    }

    public String getTreeNames() {
        return treeNames;
    }

    public void setTreeNames(String treeNames) {
        this.treeNames = treeNames;
    }

    public String getViewCode() {
        return viewCode;
    }

    public void setViewCode(String viewCode) {
        this.viewCode = viewCode;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getOfficeType() {
        return officeType;
    }

    public void setOfficeType(String officeType) {
        this.officeType = officeType;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getCorpCode() {
        return corpCode;
    }

    public void setCorpCode(String corpCode) {
        this.corpCode = corpCode;
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }


    @Override
    public String toString() {
        return "JsSysOffice{" +
                "officeCode='" + officeCode + '\'' +
                ", parentCode='" + parentCode + '\'' +
                ", parentCodes='" + parentCodes + '\'' +
                ", treeSort=" + treeSort +
                ", treeSorts='" + treeSorts + '\'' +
                ", treeLeaf='" + treeLeaf + '\'' +
                ", treeLevel=" + treeLevel +
                ", treeNames='" + treeNames + '\'' +
                ", viewCode='" + viewCode + '\'' +
                ", officeName='" + officeName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", officeType='" + officeType + '\'' +
                ", leader='" + leader + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", email='" + email + '\'' +
                ", status='" + status + '\'' +
                ", createBy='" + createBy + '\'' +
                ", createDate=" + createDate +
                ", updateBy='" + updateBy + '\'' +
                ", updateDate=" + updateDate +
                ", remarks='" + remarks + '\'' +
                ", corpCode='" + corpCode + '\'' +
                ", corpName='" + corpName + '\'' +

                '}';
    }
}
