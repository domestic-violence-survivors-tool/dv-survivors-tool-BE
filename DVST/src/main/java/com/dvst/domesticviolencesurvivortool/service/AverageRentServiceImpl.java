package com.dvst.domesticviolencesurvivortool.service;


import com.dvst.domesticviolencesurvivortool.model.AverageRent;
import com.dvst.domesticviolencesurvivortool.model.State;
import com.dvst.domesticviolencesurvivortool.repository.AverageRentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Service(value = "averageRentService")
public class AverageRentServiceImpl implements AverageRentService {


    @Autowired
    private AverageRentRepo averageRentRepo;


    @Override
    public AverageRent findAverageRentById(long id) throws EntityNotFoundException {
        return averageRentRepo.findById(id).orElseThrow(() -> new EntityNotFoundException(Long.toString(id)));
    }

    @Override
    public void delete(long id) throws EntityNotFoundException {
        if (averageRentRepo.findById(id).isPresent()) {

            averageRentRepo.deleteById(id);

        } else {

            throw new EntityNotFoundException(Long.toString(id));

        }
    }

    @Transactional
    @Override
    public AverageRent save(AverageRent averageRent)  {
        AverageRent newAverageRent = new AverageRent();

        newAverageRent.setRenttype(averageRent.getRenttype());
        newAverageRent.setRent(averageRent.getRent());

        return averageRentRepo.save(newAverageRent);
    }

    @Transactional
    @Override
    public AverageRent update(AverageRent averageRent, long id) {
        AverageRent currentAverageRent = averageRentRepo.findById(id).orElseThrow(() -> new EntityNotFoundException(Long.toString(id)));

        if (averageRent.getRenttype() != null){
            currentAverageRent.setRenttype(averageRent.getRenttype());
        }

        if (averageRent.getRent() != 0) {
            currentAverageRent.setRent(averageRent.getRent());
        }

        return averageRentRepo.save(currentAverageRent);
    }
}
