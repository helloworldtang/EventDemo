package com.event;

import com.event.DemoConfig;
import com.event.DemoSubject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by MyWorld on 2016/7/31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DemoConfig.class})
public class DemoSubjectTest {

    @Autowired
    private DemoSubject demoSubject;

    @Test

    public void testPublish() throws Exception {
        demoSubject.publish();
    }
}