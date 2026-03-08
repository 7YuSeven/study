package com.javawebpro.mapper;

import com.javawebpro.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper {

    /**
     * 查询所有部门
     */
    @Select("select id, name, create_time, update_time from dept")
    List<Dept> selectAll();

    /**
     * 删除部门信息
     */
    @Delete("delete from dept where id = #{id}")
    void delete(Integer id);

    /**
     * 新增部门信息
     * @param dept
     */
    @Insert("insert into dept(name, create_time, update_time) values (#{name}, #{createTime}, #{updateTime})")
    void insert(Dept dept);

    /**
     * 修改部门信息
     * @param dept
     */
    @Update("update dept set name = #{name}, update_time = #{updateTime} where id = #{id}")
    void update(Dept dept);

    /**
     * 根据id查询部门信息
     * @param id
     * @return
     */
    @Select("select id, name, create_time, update_time from dept where id = #{id}")
    Dept selectById(Integer id);
}
