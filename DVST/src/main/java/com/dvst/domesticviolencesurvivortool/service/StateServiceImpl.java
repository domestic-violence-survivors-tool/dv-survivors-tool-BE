package com.dvst.domesticviolencesurvivortool.service;


import com.dvst.domesticviolencesurvivortool.model.AverageRent;
import com.dvst.domesticviolencesurvivortool.model.State;
import com.dvst.domesticviolencesurvivortool.repository.StateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
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



    @Override
    public State findStateById(long id) throws EntityNotFoundException {
        return stateRepo.findById(id).orElseThrow(() -> new EntityNotFoundException(Long.toString(id)));
    }



    @Override
    public void delete(long id) throws EntityNotFoundException {
        if (stateRepo.findById(id).isPresent()) {

            stateRepo.deleteById(id);

        } else {

            throw new EntityNotFoundException(Long.toString(id));

        }
    }



    @Transactional
    @Override
    public State save(State state) {
        State newState = new State();

        newState.setState(state.getState());
        newState.setCrimeRating(state.getCrimeRating());

        for (AverageRent m : state.getRent())
        {
            newState.getRent().add(new AverageRent(m.getRenttype(), m.getRent()));
        }

        return stateRepo.save(newState);
    }



    @Transactional
    @Override
    public State update(State state, long id) {

        State currentState = stateRepo.findById(id).orElseThrow(() -> new EntityNotFoundException(Long.toString(id)));

        if (state.getState() != null){
            currentState.setState(state.getState());
        }

        if (state.getCrimeRating() != null) {
            currentState.setCrimeRating(state.getCrimeRating());
        }

        if (state.getRent().size() > 0) {
            for (AverageRent m : state.getRent()) {
                currentState.getRent().add(new AverageRent(m.getRenttype(), m.getRent()));
            }
        }

        return stateRepo.save(currentState);
    }
}
