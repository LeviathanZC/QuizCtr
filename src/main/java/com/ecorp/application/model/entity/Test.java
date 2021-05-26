package com.ecorp.application.model.entity;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.LinkedList;

public class Test {

    private String generalTopic;
    private ObservableList<TestModule> modules;

    public Test() {this("");}

    public Test(String topic) {
        this.generalTopic = topic;
        modules = FXCollections.observableArrayList();
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

    public ObservableList<TestModule> getModules() {
        return modules;
    }

    public void setModules(ObservableList<TestModule> modules) {
        this.modules = modules;
    }
}
