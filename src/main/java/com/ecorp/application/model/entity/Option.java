package com.ecorp.application.model.entity;

import java.util.Objects;

public class Option {

    private String value;
    private boolean isRight;

    public Option() {}

    public Option(String value, boolean isRight) {
        this.value = value;
        this.isRight = isRight;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isRight() {
        return isRight;
    }

    public void setRight(boolean right) {
        isRight = right;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Option option = (Option) o;
        return isRight == option.isRight && Objects.equals(value, option.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, isRight);
    }

    @Override
    public String toString() {
        return "Option{" +
                "value='" + value + '\'' +
                ", isRight=" + isRight +
                '}';
    }
}
