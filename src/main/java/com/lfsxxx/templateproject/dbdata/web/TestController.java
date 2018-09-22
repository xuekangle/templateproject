package com.lfsxxx.templateproject.dbdata.web;

import com.baomidou.mybatisplus.plugins.Page;
import com.lfsxxx.templateproject.dbdata.entity.Test;
import com.lfsxxx.templateproject.dbdata.service.ITestService;
import com.lfsxxx.templateproject.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xxx
 * @since 2018-09-22
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ITestService iTestService;

    @RequestMapping("/list")
    @ResponseBody
    public Result listTest(@RequestBody Test test){
        List<Test> tests = iTestService.selectPage(new Page<>(0, 10)).getRecords();
        return new Result("200","list success",tests);
    }
}
