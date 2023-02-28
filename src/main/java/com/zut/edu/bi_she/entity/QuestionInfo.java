package com.zut.edu.bi_she.entity;

import java.sql.Date;

import lombok.Data;
@Data
public class QuestionInfo
{
    private String url;
    private String acount;
    int solve_problem_count;
    Date solve_start;
    Date solve_end;
    //solve problem photo
}
