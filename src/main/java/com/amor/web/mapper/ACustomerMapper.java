package com.amor.web.mapper;

import com.amor.web.model.ACustomer;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface ACustomerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table A_CUSTOMER
     *
     * @mbggenerated Mon Sep 05 15:00:17 CST 2016
     */
    @Delete({
        "delete from A_CUSTOMER",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table A_CUSTOMER
     *
     * @mbggenerated Mon Sep 05 15:00:17 CST 2016
     */
    @Insert({
        "insert into A_CUSTOMER (id, person_id, ",
        "status, shape, weight, ",
        "height, height_heel, ",
        "height_waist, length_crotch_d, ",
        "length_skirt, length_arm, ",
        "length_tail, bust, ",
        "bust_d, waist, hipline, ",
        "neck, arm, leg, ",
        "wrist)",
        "values (#{id,jdbcType=INTEGER}, #{personId,jdbcType=INTEGER}, ",
        "#{status,jdbcType=VARCHAR}, #{shape,jdbcType=VARCHAR}, #{weight,jdbcType=DOUBLE}, ",
        "#{height,jdbcType=DOUBLE}, #{heightHeel,jdbcType=DOUBLE}, ",
        "#{heightWaist,jdbcType=DOUBLE}, #{lengthCrotchD,jdbcType=DOUBLE}, ",
        "#{lengthSkirt,jdbcType=DOUBLE}, #{lengthArm,jdbcType=DOUBLE}, ",
        "#{lengthTail,jdbcType=DOUBLE}, #{bust,jdbcType=VARCHAR}, ",
        "#{bustD,jdbcType=VARCHAR}, #{waist,jdbcType=VARCHAR}, #{hipline,jdbcType=VARCHAR}, ",
        "#{neck,jdbcType=VARCHAR}, #{arm,jdbcType=VARCHAR}, #{leg,jdbcType=VARCHAR}, ",
        "#{wrist,jdbcType=VARCHAR})"
    })
    int insert(ACustomer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table A_CUSTOMER
     *
     * @mbggenerated Mon Sep 05 15:00:17 CST 2016
     */
    @Select({
        "select",
        "id, person_id, status, shape, weight, height, height_heel, height_waist, length_crotch_d, ",
        "length_skirt, length_arm, length_tail, bust, bust_d, waist, hipline, neck, arm, ",
        "leg, wrist",
        "from A_CUSTOMER",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="person_id", property="personId", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="shape", property="shape", jdbcType=JdbcType.VARCHAR),
        @Result(column="weight", property="weight", jdbcType=JdbcType.DOUBLE),
        @Result(column="height", property="height", jdbcType=JdbcType.DOUBLE),
        @Result(column="height_heel", property="heightHeel", jdbcType=JdbcType.DOUBLE),
        @Result(column="height_waist", property="heightWaist", jdbcType=JdbcType.DOUBLE),
        @Result(column="length_crotch_d", property="lengthCrotchD", jdbcType=JdbcType.DOUBLE),
        @Result(column="length_skirt", property="lengthSkirt", jdbcType=JdbcType.DOUBLE),
        @Result(column="length_arm", property="lengthArm", jdbcType=JdbcType.DOUBLE),
        @Result(column="length_tail", property="lengthTail", jdbcType=JdbcType.DOUBLE),
        @Result(column="bust", property="bust", jdbcType=JdbcType.VARCHAR),
        @Result(column="bust_d", property="bustD", jdbcType=JdbcType.VARCHAR),
        @Result(column="waist", property="waist", jdbcType=JdbcType.VARCHAR),
        @Result(column="hipline", property="hipline", jdbcType=JdbcType.VARCHAR),
        @Result(column="neck", property="neck", jdbcType=JdbcType.VARCHAR),
        @Result(column="arm", property="arm", jdbcType=JdbcType.VARCHAR),
        @Result(column="leg", property="leg", jdbcType=JdbcType.VARCHAR),
        @Result(column="wrist", property="wrist", jdbcType=JdbcType.VARCHAR)
    })
    ACustomer selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table A_CUSTOMER
     *
     * @mbggenerated Mon Sep 05 15:00:17 CST 2016
     */
    @Select({
        "select",
        "id, person_id, status, shape, weight, height, height_heel, height_waist, length_crotch_d, ",
        "length_skirt, length_arm, length_tail, bust, bust_d, waist, hipline, neck, arm, ",
        "leg, wrist",
        "from A_CUSTOMER"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="person_id", property="personId", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="shape", property="shape", jdbcType=JdbcType.VARCHAR),
        @Result(column="weight", property="weight", jdbcType=JdbcType.DOUBLE),
        @Result(column="height", property="height", jdbcType=JdbcType.DOUBLE),
        @Result(column="height_heel", property="heightHeel", jdbcType=JdbcType.DOUBLE),
        @Result(column="height_waist", property="heightWaist", jdbcType=JdbcType.DOUBLE),
        @Result(column="length_crotch_d", property="lengthCrotchD", jdbcType=JdbcType.DOUBLE),
        @Result(column="length_skirt", property="lengthSkirt", jdbcType=JdbcType.DOUBLE),
        @Result(column="length_arm", property="lengthArm", jdbcType=JdbcType.DOUBLE),
        @Result(column="length_tail", property="lengthTail", jdbcType=JdbcType.DOUBLE),
        @Result(column="bust", property="bust", jdbcType=JdbcType.VARCHAR),
        @Result(column="bust_d", property="bustD", jdbcType=JdbcType.VARCHAR),
        @Result(column="waist", property="waist", jdbcType=JdbcType.VARCHAR),
        @Result(column="hipline", property="hipline", jdbcType=JdbcType.VARCHAR),
        @Result(column="neck", property="neck", jdbcType=JdbcType.VARCHAR),
        @Result(column="arm", property="arm", jdbcType=JdbcType.VARCHAR),
        @Result(column="leg", property="leg", jdbcType=JdbcType.VARCHAR),
        @Result(column="wrist", property="wrist", jdbcType=JdbcType.VARCHAR)
    })
    List<ACustomer> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table A_CUSTOMER
     *
     * @mbggenerated Mon Sep 05 15:00:17 CST 2016
     */
    @Update({
        "update A_CUSTOMER",
        "set person_id = #{personId,jdbcType=INTEGER},",
          "status = #{status,jdbcType=VARCHAR},",
          "shape = #{shape,jdbcType=VARCHAR},",
          "weight = #{weight,jdbcType=DOUBLE},",
          "height = #{height,jdbcType=DOUBLE},",
          "height_heel = #{heightHeel,jdbcType=DOUBLE},",
          "height_waist = #{heightWaist,jdbcType=DOUBLE},",
          "length_crotch_d = #{lengthCrotchD,jdbcType=DOUBLE},",
          "length_skirt = #{lengthSkirt,jdbcType=DOUBLE},",
          "length_arm = #{lengthArm,jdbcType=DOUBLE},",
          "length_tail = #{lengthTail,jdbcType=DOUBLE},",
          "bust = #{bust,jdbcType=VARCHAR},",
          "bust_d = #{bustD,jdbcType=VARCHAR},",
          "waist = #{waist,jdbcType=VARCHAR},",
          "hipline = #{hipline,jdbcType=VARCHAR},",
          "neck = #{neck,jdbcType=VARCHAR},",
          "arm = #{arm,jdbcType=VARCHAR},",
          "leg = #{leg,jdbcType=VARCHAR},",
          "wrist = #{wrist,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ACustomer record);
}