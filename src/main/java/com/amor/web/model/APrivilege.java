package com.amor.web.model;

import java.util.Date;

public class APrivilege {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column A_PRIVILEGE.id
     *
     * @mbggenerated Mon Sep 05 15:00:17 CST 2016
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column A_PRIVILEGE.role_id
     *
     * @mbggenerated Mon Sep 05 15:00:17 CST 2016
     */
    private Integer roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column A_PRIVILEGE.privilege_code
     *
     * @mbggenerated Mon Sep 05 15:00:17 CST 2016
     */
    private String privilegeCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column A_PRIVILEGE.operation_code
     *
     * @mbggenerated Mon Sep 05 15:00:17 CST 2016
     */
    private String operationCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column A_PRIVILEGE.create_time
     *
     * @mbggenerated Mon Sep 05 15:00:17 CST 2016
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column A_PRIVILEGE.update_time
     *
     * @mbggenerated Mon Sep 05 15:00:17 CST 2016
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column A_PRIVILEGE.id
     *
     * @return the value of A_PRIVILEGE.id
     *
     * @mbggenerated Mon Sep 05 15:00:17 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column A_PRIVILEGE.id
     *
     * @param id the value for A_PRIVILEGE.id
     *
     * @mbggenerated Mon Sep 05 15:00:17 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column A_PRIVILEGE.role_id
     *
     * @return the value of A_PRIVILEGE.role_id
     *
     * @mbggenerated Mon Sep 05 15:00:17 CST 2016
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column A_PRIVILEGE.role_id
     *
     * @param roleId the value for A_PRIVILEGE.role_id
     *
     * @mbggenerated Mon Sep 05 15:00:17 CST 2016
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column A_PRIVILEGE.privilege_code
     *
     * @return the value of A_PRIVILEGE.privilege_code
     *
     * @mbggenerated Mon Sep 05 15:00:17 CST 2016
     */
    public String getPrivilegeCode() {
        return privilegeCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column A_PRIVILEGE.privilege_code
     *
     * @param privilegeCode the value for A_PRIVILEGE.privilege_code
     *
     * @mbggenerated Mon Sep 05 15:00:17 CST 2016
     */
    public void setPrivilegeCode(String privilegeCode) {
        this.privilegeCode = privilegeCode == null ? null : privilegeCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column A_PRIVILEGE.operation_code
     *
     * @return the value of A_PRIVILEGE.operation_code
     *
     * @mbggenerated Mon Sep 05 15:00:17 CST 2016
     */
    public String getOperationCode() {
        return operationCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column A_PRIVILEGE.operation_code
     *
     * @param operationCode the value for A_PRIVILEGE.operation_code
     *
     * @mbggenerated Mon Sep 05 15:00:17 CST 2016
     */
    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode == null ? null : operationCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column A_PRIVILEGE.create_time
     *
     * @return the value of A_PRIVILEGE.create_time
     *
     * @mbggenerated Mon Sep 05 15:00:17 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column A_PRIVILEGE.create_time
     *
     * @param createTime the value for A_PRIVILEGE.create_time
     *
     * @mbggenerated Mon Sep 05 15:00:17 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column A_PRIVILEGE.update_time
     *
     * @return the value of A_PRIVILEGE.update_time
     *
     * @mbggenerated Mon Sep 05 15:00:17 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column A_PRIVILEGE.update_time
     *
     * @param updateTime the value for A_PRIVILEGE.update_time
     *
     * @mbggenerated Mon Sep 05 15:00:17 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}