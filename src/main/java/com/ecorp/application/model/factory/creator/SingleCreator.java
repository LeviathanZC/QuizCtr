package com.ecorp.application.model.factory.creator;

import com.ecorp.application.model.entity.testImpl.SingleSelectionModule;
import com.ecorp.application.model.factory.Factory;

import java.time.LocalTime;

public class SingleCreator implements Factory<SingleSelectionModule> {
    @Override
    public SingleSelectionModule create(String name, String question, int score, LocalTime constraint) {
        return null;
    }
}
