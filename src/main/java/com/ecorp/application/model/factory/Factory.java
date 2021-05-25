package com.ecorp.application.model.factory;

import com.ecorp.application.model.entity.TestModule;

import java.time.LocalTime;

public interface Factory<T extends TestModule> {

    T create(String name, String question, int score, LocalTime constraint);

}
