package com.ecorp.application.model.entity;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.time.LocalTime;
import java.util.List;

public abstract class TestModule {

    private String name;
    private String question;
    private ModuleType type;
    private int score;
    private LocalTime timeConstraint;

    public TestModule() {}

    public TestModule(String name, String question, ModuleType type, int score, LocalTime timeConstraint) {
        this.name = name;
        this.question = question;
        this.type = type;
        this.score = score;
        this.timeConstraint = timeConstraint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TestModule that = (TestModule) o;

        if (score != that.score) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (question != null ? !question.equals(that.question) : that.question != null) return false;
        if (type != that.type) return false;
        return timeConstraint != null ? timeConstraint.equals(that.timeConstraint) : that.timeConstraint == null;
    }

    @Override
    public int hashCode() {
        final int prime = 113;
        int result = name != null ? name.hashCode() : 0;
        result = prime * result + (question != null ? question.hashCode() : 0);
        result = prime * result + (type != null ? type.hashCode() : 0);
        result = prime * result + score;
        result = prime * result + (timeConstraint != null ? timeConstraint.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TestModule{");
        sb.append("name='").append(name).append('\'');
        sb.append(", question='").append(question).append('\'');
        sb.append(", type=").append(type);
        sb.append(", score=").append(score);
        sb.append(", timeConstraint=").append(timeConstraint);
        sb.append('}');
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ModuleType getType() {
        return type;
    }

    public void setType(ModuleType type) {
        this.type = type;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public LocalTime getTimeConstraint() {
        return timeConstraint;
    }

    public void setTimeConstraint(LocalTime timeConstraint) {
        this.timeConstraint = timeConstraint;
    }
}
