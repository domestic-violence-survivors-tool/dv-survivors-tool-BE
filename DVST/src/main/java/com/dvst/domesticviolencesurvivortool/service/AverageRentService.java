package com.dvst.domesticviolencesurvivortool.service;

import com.dvst.domesticviolencesurvivortool.model.AverageRent;

public interface AverageRentService {

    AverageRent findAverageRentById(long id);

    void delete(long id);

    AverageRent save(AverageRent averageRent);

    AverageRent update(AverageRent averageRent, long id);
}
