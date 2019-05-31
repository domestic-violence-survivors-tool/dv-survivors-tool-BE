package com.dvst.domesticviolencesurvivortool.controller;


import com.dvst.domesticviolencesurvivortool.exception.ResourseNotFoundException;
import com.dvst.domesticviolencesurvivortool.model.ErrorDetail;
import com.dvst.domesticviolencesurvivortool.model.State;
import com.dvst.domesticviolencesurvivortool.service.StateService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

@RestController
@RequestMapping(value = "/state")
public class StateController {

    private static final Logger logger = LoggerFactory.getLogger(State.class);

    @Autowired
    private StateService stateService;





    @ApiOperation(value = "return a list of states", response = State.class, responseContainer = "List")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "states returned successfully", response = void.class),
            @ApiResponse(code = 500, message = "error returning states", response = ErrorDetail.class)
    })
    @GetMapping(value = "/states", produces = {"application/json"})
    public ResponseEntity<?> listAllStates() {

        ArrayList<State> allStates = stateService.findAll();

        if (allStates == null) {
            throw new ResourseNotFoundException("no states found");
        } else {
            logger.info("/states accessed");
        }

        return new ResponseEntity<>(allStates, HttpStatus.OK);
    }





    @ApiOperation(value = "gets a specific state by id", response = State.class)
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "state returned successfully", response = void.class),
            @ApiResponse(code = 500, message = "error returning state", response = ErrorDetail.class)
    })
    @GetMapping(value = "/find/{stateid}", produces = {"application/json"})
    public ResponseEntity<?> getStateById(@PathVariable Long stateid) {

        State r = stateService.findStateById(stateid);

        return new ResponseEntity<>(r, HttpStatus.OK);
    }




    @ApiOperation(value = "adds a new state", response = State.class)
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "state created successfully", response = void.class),
            @ApiResponse(code = 500, message = "error creating state", response = ErrorDetail.class)
    })
    @PostMapping(value = "/admin/add/newstate", consumes = {"application/json"}, produces = {"application/json"})
    public ResponseEntity<?> addNewState(@Valid @RequestBody State newState) throws URISyntaxException {

        newState = stateService.save(newState);

        HttpHeaders responseHeaders = new HttpHeaders();
        URI newStateURI = ServletUriComponentsBuilder.fromCurrentRequest().path("/{stateid}").buildAndExpand(newState.getStateid()).toUri();
        responseHeaders.setLocation(newStateURI);

        return new ResponseEntity<>(null, responseHeaders, HttpStatus.CREATED);
    }





    @ApiOperation(value = "deletes a specific Average rent type and amount by id", response = State.class)
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "deleted state successfully", response = void.class),
            @ApiResponse(code = 500, message = "error deleting restaurant", response = ErrorDetail.class)
    })
    @DeleteMapping("/admin/delete/{stateid}")
    public ResponseEntity<?> deleteCourseById(@PathVariable long stateid) {
        stateService.delete(stateid);
        return new ResponseEntity<>(HttpStatus.OK);
    }





    @ApiOperation(value = "updates a specific state by id", response = State.class)
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "state updated successfully", response = void.class),
            @ApiResponse(code = 500, message = "error updateing state", response = ErrorDetail.class)
    })
    @PutMapping(value = "/admin/update/{stateid}")
    public ResponseEntity<?> updateState(@RequestBody State updateState, @PathVariable long stateid) {
        stateService.update(updateState, stateid);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
