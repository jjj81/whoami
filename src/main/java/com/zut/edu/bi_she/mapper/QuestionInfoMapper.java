package com.zut.edu.bi_she.mapper;

import java.util.List;
import com.zut.edu.bi_she.entity.*;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface QuestionInfoMapper {

    @Select("select * from question_info")
    public List<QuestionInfo> find_all();

    @Insert("insert into question_info(url,acount,solve_problem_count,solve_start,solve_end) values (#{url} , #{axount}, #{solve_problem_count}, #{solve_start}, #{solve_end})")
    public void insert (QuestionInfo q);


}
