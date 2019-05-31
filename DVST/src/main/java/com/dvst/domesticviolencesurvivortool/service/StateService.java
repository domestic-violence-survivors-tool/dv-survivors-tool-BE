package com.dvst.domesticviolencesurvivortool.service;

import com.dvst.domesticviolencesurvivortool.model.State;

import java.util.ArrayList;

public interface StateService {

    ArrayList<State> findAll();

    State findStateById(long id);

    void delete(long id);

    State save(State state);

    State update(State state, long id);

}
