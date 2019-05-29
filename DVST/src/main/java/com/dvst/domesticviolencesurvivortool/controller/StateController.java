package com.dvst.domesticviolencesurvivortool.controller;


import com.dvst.domesticviolencesurvivortool.exception.ResourseNotFoundException;
import com.dvst.domesticviolencesurvivortool.model.State;
import com.dvst.domesticviolencesurvivortool.service.StateService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/state")
public class StateController {

    private static final Logger logger = LoggerFactory.getLogger(State.class);

    @Autowired
    private StateService stateService;

    @ApiOperation(value = "return a list of states", response = State.class, responseContainer = "List")
    @GetMapping(value = "/states", produces = {"application/json"})
    public ResponseEntity<?> listAllStates() {

        ArrayList<State> allStates = stateService.findAll();

        if (allStates == null) {
            throw new ResourseNotFoundException("no states found");
        } else{
            logger.info("/states accessed");
        }

        return new ResponseEntity<>(allStates, HttpStatus.OK);

    }
}
