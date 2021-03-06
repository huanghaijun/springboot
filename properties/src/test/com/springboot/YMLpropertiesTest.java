package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by wl on 2017/6/18.
 */
@SpringBootApplication
public class YMLpropertiesTest implements CommandLineRunner {

    @Autowired
    private HomePropertiesYML homePropertiesYML;
    @Override
    public void run(String... strings) throws Exception {
        System.out.println(">>>>>>>>>>>> "+homePropertiesYML.toString());
    }
    /**
     * 使用application.yml运行输出以下结果：
     *  HomePropertiesYML{province='山东省', city='潍坊市', desc='我来自山东省潍坊市.'}
     *
     *  使用application.properties根据spring.profiles.active的value运行加载其对应的application-*.properties输出以下结果：
     *  HomePropertiesYML{province='shang dong sheng', city='wei fang shi', desc='[application-pro] i come from shang dong sheng wei fang shi.'}
     */
    public static void main(String[] args) {
        SpringApplication.run(YMLpropertiesTest.class,args);
//        System.exit(-1);
    }

}
