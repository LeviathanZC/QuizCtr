package com.ecorp.application.model.factory.creator;

import com.ecorp.application.model.entity.testImpl.MultipleChoiceModule;
import com.ecorp.application.model.factory.Factory;

import java.time.LocalTime;

public class MultipleCreator implements Factory<MultipleChoiceModule> {
    @Override
    public MultipleChoiceModule create(String name, String question, int score, LocalTime constraint) {
        return null;
    }
}
