package com.dvst.domesticviolencesurvivortool.service;


import com.dvst.domesticviolencesurvivortool.model.State;
import com.dvst.domesticviolencesurvivortool.repository.StateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service(value = "stateService")
public class StateServiceImpl implements StateService {

    @Autowired
    private StateRepo stateRepo;


    @Override
    public ArrayList<State> findAll() {
        ArrayList<State> list = new ArrayList<>();
        stateRepo.findAll().iterator().forEachRemaining(list::add);
        return list;
    }
}
