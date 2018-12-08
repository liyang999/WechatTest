package com.test.wechatwork;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WechatWorkTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void load(){
        String path ="/tmp/1.yaml";
      assertEquals(WechatWork.config,null);
//      WechatWork.config=new Config();
//      WechatWork.config.setCorpID("demo");
//      WechatWork.write(path);
//      WechatWork.config.setCorpID("demo2");
//      WechatWork.load(new File(path));
//      assertEquals(WechatWork.config.getCorpID(),"demo");
    }
}