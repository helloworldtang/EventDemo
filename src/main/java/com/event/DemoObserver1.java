package com.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by MyWorld on 2016/7/31.
 */
@Component
public class DemoObserver1 implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        System.out.println(this.getClass().getCanonicalName() + " receive: " + demoEvent.getSource());
    }
}
