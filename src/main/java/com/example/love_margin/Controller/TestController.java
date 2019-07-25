package com.example.love_margin.Controller;


import com.example.love_margin.Entity.Test;
import com.example.love_margin.Service.TestService;
import com.example.love_margin.Untils.ResultCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "测试接口")
@RestController
@RequestMapping(value = "/Test",name = "测试返回")

public class TestController {

    @Autowired
    TestService testService;


//增加信息
    @ApiOperation(value = "增加信息",notes = "增加信息")
//    @PostMapping(value = "/addTest",produces = "application/json")
    @PostMapping(value = "/addTest")
    public Object addTest(@RequestBody Test t){
        return ResultCode.SUCCESS.result(testService.addTest(t));
    }

//全表查询



}