package com.ecorp.application.model.entity.testImpl;

import com.ecorp.application.model.entity.ModuleType;
import com.ecorp.application.model.entity.TestModule;

import java.time.LocalTime;
import java.util.Map;

public class MappingModule extends TestModule {

    private Map<Integer, String> first;
    private Map<Integer, String> second;
    private Map<Integer, Integer> answer;

    public MappingModule() {}

    public MappingModule(Map<Integer, String> first, Map<Integer, String> second, Map<Integer, Integer> answer) {
        this.first = first;
        this.second = second;
        this.answer = answer;
    }

    public MappingModule(String name, String question, int score, LocalTime timeConstraint, Map<Integer, String> first, Map<Integer, String> second, Map<Integer, Integer> answer) {
        super(name, question, ModuleType.MAPPING, score, timeConstraint);
        this.first = first;
        this.second = second;
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }

        MappingModule that = (MappingModule) o;

        if (first != null ? !first.equals(that.first) : that.first != null) return false;
        if (second != null ? !second.equals(that.second) : that.second != null) return false;
        return answer != null ? answer.equals(that.answer) : that.answer == null;
    }

    @Override
    public int hashCode() {
        final int prime = 113;
        int result = super.hashCode();
        result = prime * result + (first != null ? first.hashCode() : 0);
        result = prime * result + (second != null ? second.hashCode() : 0);
        result = prime * result + (answer != null ? answer.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MappingModule{");
        sb.append("first=").append(first);
        sb.append(", second=").append(second);
        sb.append(", answer=").append(answer);
        sb.append('}');
        return sb.toString();
    }
}
