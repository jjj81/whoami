package com.zut.edu.bi_she.mapper;

import com.zut.edu.bi_she.entity.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {

    @Select("select * from student")
    public List<Student> find_all();

    @Insert("insert into student (name,clazz,student_id) values (#{name},#{clazz},#{student_id})")
    void insert(Student student);

}
