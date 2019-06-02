package com.zzy;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * This is Description
 *
 * @author 周振宇
 * @date 2019/06/03
 */
public class MyBatisTest {

    @Test
    public void testMbg() throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("target/classes/mbg.xml");
//        File configFile = new File("G:\\Idea_Projects\\Idea_Projects\blankprojcet\\MyBatis_07_mbg\\target\\classes");
        System.out.println(configFile.getAbsolutePath());
        System.out.println(configFile.getCanonicalPath());
        System.out.println(System.getProperty("user.dir"));
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback,warnings);
        myBatisGenerator.generate(null);
    }

}
