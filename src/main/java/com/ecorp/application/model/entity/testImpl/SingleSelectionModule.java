package com.ecorp.application.model.entity.testImpl;

import com.ecorp.application.model.entity.ModuleType;
import com.ecorp.application.model.entity.Option;
import com.ecorp.application.model.entity.TestModule;

import java.time.LocalTime;
import java.util.List;

public class SingleSelectionModule extends TestModule {

    private List<Option> options;

    public SingleSelectionModule() { super(); }

    public SingleSelectionModule(List<Option> options) {
        this.options = options;
    }

    public SingleSelectionModule(String name, String question, int score, LocalTime timeConstraint, List<Option> options) {
        super(name, question, ModuleType.SINGLE, score, timeConstraint);
        this.options = options;
    }

    public void addOption(Option option) {
        options.add(option);
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

        SingleSelectionModule that = (SingleSelectionModule) o;

        return options != null ? options.equals(that.options) : that.options == null;
    }

    @Override
    public int hashCode() {
        final int prime = 113;
        int result = super.hashCode();
        result = prime * result + (options != null ? options.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SingleSelectionModule{");
        sb.append("options=").append(options);
        sb.append('}');
        return sb.toString();
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }
}
