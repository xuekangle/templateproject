package com.lfsxxx.templateproject.dbdata.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.lfsxxx.templateproject.dbdata.entity.Test;
import com.lfsxxx.templateproject.dbdata.mapper.TestMapper;
import com.lfsxxx.templateproject.dbdata.service.ITestService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xxx
 * @since 2018-09-22
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {
	
}
