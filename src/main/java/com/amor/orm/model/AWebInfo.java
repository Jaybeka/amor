package com.amor.orm.model;

public class AWebInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column A_WEB_INFO.id
     *
     * @mbggenerated Fri Sep 16 21:54:58 CST 2016
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column A_WEB_INFO.parent_id
     *
     * @mbggenerated Fri Sep 16 21:54:58 CST 2016
     */
    private Integer parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column A_WEB_INFO.type
     *
     * @mbggenerated Fri Sep 16 21:54:58 CST 2016
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column A_WEB_INFO.name
     *
     * @mbggenerated Fri Sep 16 21:54:58 CST 2016
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column A_WEB_INFO.path
     *
     * @mbggenerated Fri Sep 16 21:54:58 CST 2016
     */
    private String path;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column A_WEB_INFO.file_name
     *
     * @mbggenerated Fri Sep 16 21:54:58 CST 2016
     */
    private String fileName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column A_WEB_INFO.status
     *
     * @mbggenerated Fri Sep 16 21:54:58 CST 2016
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column A_WEB_INFO.id
     *
     * @return the value of A_WEB_INFO.id
     *
     * @mbggenerated Fri Sep 16 21:54:58 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column A_WEB_INFO.id
     *
     * @param id the value for A_WEB_INFO.id
     *
     * @mbggenerated Fri Sep 16 21:54:58 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column A_WEB_INFO.parent_id
     *
     * @return the value of A_WEB_INFO.parent_id
     *
     * @mbggenerated Fri Sep 16 21:54:58 CST 2016
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column A_WEB_INFO.parent_id
     *
     * @param parentId the value for A_WEB_INFO.parent_id
     *
     * @mbggenerated Fri Sep 16 21:54:58 CST 2016
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column A_WEB_INFO.type
     *
     * @return the value of A_WEB_INFO.type
     *
     * @mbggenerated Fri Sep 16 21:54:58 CST 2016
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column A_WEB_INFO.type
     *
     * @param type the value for A_WEB_INFO.type
     *
     * @mbggenerated Fri Sep 16 21:54:58 CST 2016
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column A_WEB_INFO.name
     *
     * @return the value of A_WEB_INFO.name
     *
     * @mbggenerated Fri Sep 16 21:54:58 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column A_WEB_INFO.name
     *
     * @param name the value for A_WEB_INFO.name
     *
     * @mbggenerated Fri Sep 16 21:54:58 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column A_WEB_INFO.path
     *
     * @return the value of A_WEB_INFO.path
     *
     * @mbggenerated Fri Sep 16 21:54:58 CST 2016
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column A_WEB_INFO.path
     *
     * @param path the value for A_WEB_INFO.path
     *
     * @mbggenerated Fri Sep 16 21:54:58 CST 2016
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column A_WEB_INFO.file_name
     *
     * @return the value of A_WEB_INFO.file_name
     *
     * @mbggenerated Fri Sep 16 21:54:58 CST 2016
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column A_WEB_INFO.file_name
     *
     * @param fileName the value for A_WEB_INFO.file_name
     *
     * @mbggenerated Fri Sep 16 21:54:58 CST 2016
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column A_WEB_INFO.status
     *
     * @return the value of A_WEB_INFO.status
     *
     * @mbggenerated Fri Sep 16 21:54:58 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column A_WEB_INFO.status
     *
     * @param status the value for A_WEB_INFO.status
     *
     * @mbggenerated Fri Sep 16 21:54:58 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}