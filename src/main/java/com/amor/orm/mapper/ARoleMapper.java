package com.amor.orm.mapper;

import com.amor.orm.model.ARole;
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
     * @mbggenerated Fri Sep 16 21:54:58 CST 2016
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
     * @mbggenerated Fri Sep 16 21:54:58 CST 2016
     */
    @Insert({
        "insert into A_ROLE (id, role_name, ",
        "role_type, description, ",
        "status, create_time, ",
        "update_time)",
        "values (#{id,jdbcType=INTEGER}, #{roleName,jdbcType=VARCHAR}, ",
        "#{roleType,jdbcType=INTEGER}, #{description,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(ARole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table A_ROLE
     *
     * @mbggenerated Fri Sep 16 21:54:58 CST 2016
     */
    @Select({
        "select",
        "id, role_name, role_type, description, status, create_time, update_time",
        "from A_ROLE",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="role_name", property="roleName", jdbcType=JdbcType.VARCHAR),
        @Result(column="role_type", property="roleType", jdbcType=JdbcType.INTEGER),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    ARole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table A_ROLE
     *
     * @mbggenerated Fri Sep 16 21:54:58 CST 2016
     */
    @Select({
        "select",
        "id, role_name, role_type, description, status, create_time, update_time",
        "from A_ROLE"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="role_name", property="roleName", jdbcType=JdbcType.VARCHAR),
        @Result(column="role_type", property="roleType", jdbcType=JdbcType.INTEGER),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ARole> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table A_ROLE
     *
     * @mbggenerated Fri Sep 16 21:54:58 CST 2016
     */
    @Update({
        "update A_ROLE",
        "set role_name = #{roleName,jdbcType=VARCHAR},",
          "role_type = #{roleType,jdbcType=INTEGER},",
          "description = #{description,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ARole record);
}