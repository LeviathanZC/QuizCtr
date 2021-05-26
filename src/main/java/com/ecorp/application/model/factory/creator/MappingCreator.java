package com.ecorp.application.model.factory.creator;

import com.ecorp.application.model.entity.testImpl.MappingModule;
import com.ecorp.application.model.factory.Factory;

import java.time.LocalTime;

public class MappingCreator implements Factory<MappingModule> {
    @Override
    public MappingModule create(String name, String question, int score, LocalTime constraint) {
        return null;
    }
}
