package com.ecorp.application.model.entity;

import java.util.LinkedList;
import java.util.List;

public class Test {

    private String generalTopic;
    private List<TestModule> modules;

    public Test() {}

    public Test(String topic) {
        this.generalTopic = topic;
        modules = new LinkedList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Test test = (Test) o;

        if (generalTopic != null ? !generalTopic.equals(test.generalTopic) : test.generalTopic != null) return false;
        return modules != null ? modules.equals(test.modules) : test.modules == null;
    }

    @Override
    public int hashCode() {
        int result = generalTopic != null ? generalTopic.hashCode() : 0;
        result = 31 * result + (modules != null ? modules.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Test{");
        sb.append("generalTopic='").append(generalTopic).append('\'');
        sb.append(", modules=").append(modules);
        sb.append('}');
        return sb.toString();
    }

    public String getGeneralTopic() {
        return generalTopic;
    }

    public void setGeneralTopic(String generalTopic) {
        this.generalTopic = generalTopic;
    }

    public List<TestModule> getModules() {
        return modules;
    }

    public void setModules(List<TestModule> modules) {
        this.modules = modules;
    }
}
