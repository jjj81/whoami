package com.zut.edu.bi_she.entity;

import java.sql.Date;

public class QuestionInfo
{
    private String url;
    private String acount;
    int solve_problem_count;
    Date solve_start;
    Date solve_end;
    //solve problem photo
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getAcount() {
        return acount;
    }
    public void setAcount(String acount) {
        this.acount = acount;
    }
    public int getSolve_problem_count() {
        return solve_problem_count;
    }
    public void setSolve_problem_count(int solve_problem_count) {
        this.solve_problem_count = solve_problem_count;
    }
    public Date getSolve_start() {
        return solve_start;
    }
    public void setSolve_start(Date solve_start) {
        this.solve_start = solve_start;
    }
    public Date getSolve_end() {
        return solve_end;
    }
    public void setSolve_end(Date solve_end) {
        this.solve_end = solve_end;
    }
}
