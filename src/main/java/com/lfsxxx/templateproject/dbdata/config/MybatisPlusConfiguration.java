package com.lfsxxx.templateproject.dbdata.config;

import com.baomidou.mybatisplus.enums.DBType;
import com.baomidou.mybatisplus.enums.Optimize;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.lfsxxx.templateproject.dbdata.mapper*")
public class MybatisPlusConfiguration {

    /**
     * mybatis-plus分页插件
     * 文档 ：http://mp-baomidou.com
     */
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        paginationInterceptor.setDialectType(DBType.MYSQL.getDb());
//        paginationInterceptor.setOptimizeType(Optimize.JSQLPARSER.getOptimize());
        return paginationInterceptor;
    }

}
