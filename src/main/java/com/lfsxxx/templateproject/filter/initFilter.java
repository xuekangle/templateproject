package com.lfsxxx.templateproject.filter;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.lfsxxx.templateproject.dbdata.entity.Test;
import com.lfsxxx.templateproject.dbdata.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.awt.event.ComponentListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class initFilter implements CommandLineRunner{

    private Map<String,Object> map = new HashMap<>();

    @Autowired
    private ITestService iTestService;


    @Override
    public void run(String... args) throws Exception {
        Wrapper<Test> wrapper = new EntityWrapper<>();
        List<Test> tests = iTestService.selectList(wrapper);
        for (int i = 0; i < tests.size(); i++) {
            map.put(tests.get(i).getId().toString(),tests.get(i));
        }

    }
}
