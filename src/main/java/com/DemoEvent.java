package com;

import org.springframework.context.ApplicationEvent;

/**
 * Created by MyWorld on 2016/7/31.
 */
public class DemoEvent extends ApplicationEvent{
    public DemoEvent(Object source) {
        super(source);
    }
}
