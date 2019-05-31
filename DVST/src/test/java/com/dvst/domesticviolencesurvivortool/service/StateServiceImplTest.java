package com.dvst.domesticviolencesurvivortool.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class StateServiceImplTest {

    @Autowired
    private StateService stateService;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findAll() {
        assertEquals(50, stateService.findAll().size());
    }
}