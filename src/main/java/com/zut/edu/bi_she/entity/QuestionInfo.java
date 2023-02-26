package com.zut.edu.bi_she.entity;

import java.sql.Date;

import lombok.Data;
@Data
class QuestionInfo
{
    private String url;
    private String acount;
    int solve_problem_count;
    Date start;
    Date end;
    //solve problem photo
}
