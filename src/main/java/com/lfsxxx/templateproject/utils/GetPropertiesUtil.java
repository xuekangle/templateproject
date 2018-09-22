package com.lfsxxx.templateproject.utils;

import java.io.FileReader;
import java.net.URL;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Properties;

public class GetPropertiesUtil {

    //数据库url
    public static String DBURL;

    //数据库用户名
    public static String DBUSERNAME;

    //数据库密码
    public static String DBPASSWORD;

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

    static{
        try{
            Properties p = new Properties();
            URL url = GetPropertiesUtil.class.getProtectionDomain().getCodeSource().getLocation();
            String filePath = URLDecoder.decode(url.getPath(),"utf-8");
            //本地测试路径
            String path = filePath.substring(filePath.indexOf(":") + 1, filePath.indexOf("/target"));
            //load配置文件
            p.load(new FileReader(path + "/conf/config.properties"));

            DBURL = p.getProperty("DBURL");
            DBUSERNAME = p.getProperty("DBUSERNAME");
            DBPASSWORD = p.getProperty("DBPASSWORD");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
