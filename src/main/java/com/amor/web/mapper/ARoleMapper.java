package com.amor.web.mapper;

import com.amor.web.model.ARole;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface ARoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table A_ROLE
     *
     * @mbggenerated Mon Sep 05 15:00:17 CST 2016
     */
    @Delete({
        "delete from A_ROLE",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table A_ROLE
     *
     * @mbggenerated Mon Sep 05 15:00:17 CST 2016
     */
    @Insert({
        "insert into A_ROLE (id, name, ",
        "type, memo, create_time, ",
        "update_time)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{type,jdbcType=VARCHAR}, #{memo,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(ARole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table A_ROLE
     *
     * @mbggenerated Mon Sep 05 15:00:17 CST 2016
     */
    @Select({
        "select",
        "id, name, type, memo, create_time, update_time",
        "from A_ROLE",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="memo", property="memo", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    ARole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table A_ROLE
     *
     * @mbggenerated Mon Sep 05 15:00:17 CST 2016
     */
    @Select({
        "select",
        "id, name, type, memo, create_time, update_time",
        "from A_ROLE"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="memo", property="memo", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ARole> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table A_ROLE
     *
     * @mbggenerated Mon Sep 05 15:00:17 CST 2016
     */
    @Update({
        "update A_ROLE",
        "set name = #{name,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=VARCHAR},",
          "memo = #{memo,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ARole record);
}