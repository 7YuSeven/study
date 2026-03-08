package com.javawebpro.springbootmybatis.mapper;

import com.javawebpro.springbootmybatis.pojo.Emp;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {
    //根据ID删除数据
    @Delete("delete from emp where id = #{id}")
    public void delete(Integer id);

    //新增数据
    //主键返回
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into emp (username, name, gender, image, job, entrydate, dept_id, create_time, update_time)" +
            " values (#{username}, #{name}, #{gender}, #{image}, #{job}, #{entrydate}, #{deptId}, #{createTime}, #{updateTime})")
    public void insert(Emp emp);

    //修改数据
    @Update("update emp set username = #{username}, name = #{name}, gender = #{gender}, image = #{image}, job = #{job}," +
            "entrydate = #{entrydate}, dept_id = #{deptId}, update_time = #{updateTime} where id = #{id}")
    public void update(Emp emp);

    //查询数据
    //方案三：开启mybatis的驼峰命名自动映射开关，  a_column -> aColum
    @Select("select * from emp where id = #{id}")
    public Emp selectById(Integer id);

    //方案一：给字段起别名
//    @Select("select id, username, password, name, gender, image, job, entrydate, " +
//            "dept_id deptId, create_time createTime, update_time updateTime from emp where id = #{id}")
//    public Emp selectById1(Integer id);

    //方案二：通过@Results注解， 手动映射封装
//    @Results({
//            @Result (column = "dept_id", property = "deptId"),
//            @Result (column = "create_time", property = "createTime"),
//            @Result (column = "update_time", property = "updateTime")
//    })
//    @Select("select * from emp where id = #{id}")
//    public Emp selectById1(Integer id);

    //条件查询
//    @Select("select * from emp where name like '%${name}%' and gender = #{gender} and" +
//            " entrydate between #{begin} and #{end} order by update_time desc")
//    public List<Emp> selectAll(String name, Short gender, LocalDate begin, LocalDate end);

    //使用concat解决sql注入问题
//    @Select("select * from emp where name like concat('%', #{name}, '%') and gender = #{gender} and" +
//            " entrydate between #{begin} and #{end} order by update_time desc")
//    public List<Emp> selectAll(String name, Short gender, LocalDate begin, LocalDate end);

    public List<Emp> selectAll(String name, Short gender, LocalDate begin, LocalDate end);

    //动态修改数据
    public void update2(Emp emp);

    //批量删除员工
    public void deletes(List<Integer> ids);
}