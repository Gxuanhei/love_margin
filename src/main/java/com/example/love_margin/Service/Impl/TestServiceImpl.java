package com.example.love_margin.Service.Impl;

import com.example.love_margin.Entity.Test;
import com.example.love_margin.Mapper.TestMapper;
import com.example.love_margin.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    TestMapper testMapper;


    @Override
    public Object addTest(Test t) {
        if(testMapper.addTest(t)==1){
            return "添加成功";
        }else {
            return "添加失败";
        }
    }

}
