package com.zut.edu.bi_she.controller;

import java.util.List;

import com.zut.edu.bi_she.entity.QuestionInfo;
import com.zut.edu.bi_she.mapper.QuestionInfoMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionInfoController {
    @Autowired
    private QuestionInfoMapper questMapper;

    @GetMapping("/question/find_all")
    public List<QuestionInfo> find_all() {
        return questMapper.find_all();
    }

    @PostMapping("/question_info/create")
    public void create_question_info(@RequestBody QuestionInfo q) {
        questMapper.insert(q);
    }
}
