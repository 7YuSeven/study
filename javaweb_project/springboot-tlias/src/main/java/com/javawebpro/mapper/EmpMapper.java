package com.javawebpro.mapper;

import com.javawebpro.pojo.Emp;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {

    /**
     * 查询总数
     */
//    @Select("select count(*) from emp")
//    Integer selectCount();

    /**
     * 分页查询所有员工
     */
//    @Select("select * from emp limit #{start}, #{pagesize}")
//    List<Emp> selectAll(Integer start,Integer pagesize);

    /**
     * 员工信息分页查询
     * @return
     */
//    @Select("select id, username, password, name, gender, image, job, " +
//            "entrydate, dept_id, create_time, update_time from emp")
    public List<Emp> selectAll(String name, Short gender, LocalDate begin, LocalDate end);

    /**
     * 删除员工信息
     * @param ids
     */
    void delete(List<Integer> ids);

    /**
     * 新增员工信息
     * @param emp
     */
    @Insert("insert into emp (username, name, gender, image, job, entrydate, dept_id, create_time, update_time) " +
            "values (#{username}, #{name}, #{gender}, #{image}, #{job}, #{entrydate}, #{deptId}, #{createTime}, #{updateTime})")
    void insert(Emp emp);

    /**
     * 根据id查询员工信息
     * @param id
     * @return
     */
    @Select("select id, username, password, name, gender, image, job, entrydate, dept_id, create_time, update_time " +
            "from emp where id = #{id}")
    Emp selectById(Integer id);

    /**
     * 修改员工信息
     * @param emp
     */
    void update(Emp emp);

    /**
     * 查询用户名和密码是否正确
     * @param emp
     */
    @Select("select id, username, password, name, gender, image, job, entrydate, dept_id, create_time, update_time " +
            "from emp where username = #{username} and password = #{password}")
    Emp selectByUsernameAndPassword(Emp emp);
}
