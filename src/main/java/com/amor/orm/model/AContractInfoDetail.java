package com.amor.orm.model;

public class AContractInfoDetail {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column A_CONTRACT_INFO_DETAIL.id
     *
     * @mbggenerated Fri Sep 16 21:54:57 CST 2016
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column A_CONTRACT_INFO_DETAIL.contract_id
     *
     * @mbggenerated Fri Sep 16 21:54:57 CST 2016
     */
    private Integer contractId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column A_CONTRACT_INFO_DETAIL.item_type
     *
     * @mbggenerated Fri Sep 16 21:54:57 CST 2016
     */
    private Integer itemType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column A_CONTRACT_INFO_DETAIL.item_code
     *
     * @mbggenerated Fri Sep 16 21:54:57 CST 2016
     */
    private String itemCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column A_CONTRACT_INFO_DETAIL.number
     *
     * @mbggenerated Fri Sep 16 21:54:57 CST 2016
     */
    private Integer number;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column A_CONTRACT_INFO_DETAIL.price
     *
     * @mbggenerated Fri Sep 16 21:54:57 CST 2016
     */
    private Double price;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column A_CONTRACT_INFO_DETAIL.id
     *
     * @return the value of A_CONTRACT_INFO_DETAIL.id
     *
     * @mbggenerated Fri Sep 16 21:54:57 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column A_CONTRACT_INFO_DETAIL.id
     *
     * @param id the value for A_CONTRACT_INFO_DETAIL.id
     *
     * @mbggenerated Fri Sep 16 21:54:57 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column A_CONTRACT_INFO_DETAIL.contract_id
     *
     * @return the value of A_CONTRACT_INFO_DETAIL.contract_id
     *
     * @mbggenerated Fri Sep 16 21:54:57 CST 2016
     */
    public Integer getContractId() {
        return contractId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column A_CONTRACT_INFO_DETAIL.contract_id
     *
     * @param contractId the value for A_CONTRACT_INFO_DETAIL.contract_id
     *
     * @mbggenerated Fri Sep 16 21:54:57 CST 2016
     */
    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column A_CONTRACT_INFO_DETAIL.item_type
     *
     * @return the value of A_CONTRACT_INFO_DETAIL.item_type
     *
     * @mbggenerated Fri Sep 16 21:54:57 CST 2016
     */
    public Integer getItemType() {
        return itemType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column A_CONTRACT_INFO_DETAIL.item_type
     *
     * @param itemType the value for A_CONTRACT_INFO_DETAIL.item_type
     *
     * @mbggenerated Fri Sep 16 21:54:57 CST 2016
     */
    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column A_CONTRACT_INFO_DETAIL.item_code
     *
     * @return the value of A_CONTRACT_INFO_DETAIL.item_code
     *
     * @mbggenerated Fri Sep 16 21:54:57 CST 2016
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column A_CONTRACT_INFO_DETAIL.item_code
     *
     * @param itemCode the value for A_CONTRACT_INFO_DETAIL.item_code
     *
     * @mbggenerated Fri Sep 16 21:54:57 CST 2016
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode == null ? null : itemCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column A_CONTRACT_INFO_DETAIL.number
     *
     * @return the value of A_CONTRACT_INFO_DETAIL.number
     *
     * @mbggenerated Fri Sep 16 21:54:57 CST 2016
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column A_CONTRACT_INFO_DETAIL.number
     *
     * @param number the value for A_CONTRACT_INFO_DETAIL.number
     *
     * @mbggenerated Fri Sep 16 21:54:57 CST 2016
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column A_CONTRACT_INFO_DETAIL.price
     *
     * @return the value of A_CONTRACT_INFO_DETAIL.price
     *
     * @mbggenerated Fri Sep 16 21:54:57 CST 2016
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column A_CONTRACT_INFO_DETAIL.price
     *
     * @param price the value for A_CONTRACT_INFO_DETAIL.price
     *
     * @mbggenerated Fri Sep 16 21:54:57 CST 2016
     */
    public void setPrice(Double price) {
        this.price = price;
    }
}