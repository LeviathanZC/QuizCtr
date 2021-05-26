package com.ecorp.application.model.service;

import com.ecorp.application.model.entity.Test;
import com.ecorp.application.model.entity.TestModule;


public class TestHandler {

    private static class TestHandlerHolder {
        private static final TestHandler INSTANCE = new TestHandler();
    }

    public TestHandler() {}

    public static TestHandler getInstance() {
        return TestHandlerHolder.INSTANCE;
    }

    private Test current;


    public void setCurrent(Test current) {
        this.current = current;
    }

    public Test getCurrent() {
        return current;
    }

    public void addModule(TestModule module) {
        if(current.getModules().size() < max) {
            current.getModules().add(module);
        }
    }

    public boolean isCurrentEmpty() {
        return current == null;
    }



    private int max;

    public void setMax(int max) {
        this.max = max;
    }

    public int getMax() {
        return this.max;
    }
}
