package com.dvst.domesticviolencesurvivortool.controller;

import com.dvst.domesticviolencesurvivortool.model.AverageRent;
import com.dvst.domesticviolencesurvivortool.model.ErrorDetail;
import com.dvst.domesticviolencesurvivortool.model.State;
import com.dvst.domesticviolencesurvivortool.service.AverageRentService;
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


@RestController
@RequestMapping(value = "/AverageRent")
public class AverageRentController {

    private static final Logger logger = LoggerFactory.getLogger(State.class);

    @Autowired
    private AverageRentService averageRentService;




    @ApiOperation(value = "returns a specific Average rent type and amount by id", response = State.class)
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Average Rents returned successfully", response = void.class),
            @ApiResponse(code = 500, message = "error returning Average Rents", response = ErrorDetail.class)
    })
    @GetMapping(value = "/find/{rentid}", produces = {"application/json"})
    public ResponseEntity<?> getAverageRentById(@PathVariable Long rentid) {

        AverageRent r = averageRentService.findAverageRentById(rentid);

        return new ResponseEntity<>(r, HttpStatus.OK);
    }




    @ApiOperation(value = "adds a new rent type and amount", response = State.class)
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "new rent type and amount added successfully", response = void.class),
            @ApiResponse(code = 500, message = "error adding new rent type and amount", response = ErrorDetail.class)
    })
    @PostMapping(value = "/admin/add/newaveragerent", consumes = {"application/json"}, produces = {"application/json"})
    public ResponseEntity<?> addNewAverageRent(@Valid @RequestBody AverageRent newAverageRent) throws URISyntaxException {

        newAverageRent = averageRentService.save(newAverageRent);

        HttpHeaders responseHeaders = new HttpHeaders();
        URI newAverageRentURI = ServletUriComponentsBuilder.fromCurrentRequest().path("/{stateid}").buildAndExpand(newAverageRent.getRentid()).toUri();
        responseHeaders.setLocation(newAverageRentURI);

        return new ResponseEntity<>(null, responseHeaders, HttpStatus.CREATED);
    }




    @ApiOperation(value = "deletes a specific Average rent type and amount by id", response = State.class)
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Average rent deleted successfully", response = void.class),
            @ApiResponse(code = 500, message = "error deleting Average rent type and amount by id", response = ErrorDetail.class)
    })
    @DeleteMapping("/admin/delete/{rentid}")
    public ResponseEntity<?> deleteCourseById(@PathVariable long rentid) {
        averageRentService.delete(rentid);
        return new ResponseEntity<>(HttpStatus.OK);
    }




    @ApiOperation(value = "updates a specific Average rent type and amount by id", response = State.class)
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Average rent type and amount updated successfully", response = void.class),
            @ApiResponse(code = 500, message = "error updateing Average rent type and amount", response = ErrorDetail.class)
    })
    @PutMapping(value = "/admin/update/{rentid}")
    public ResponseEntity<?> updateState(@RequestBody AverageRent updateAverageRent, @PathVariable long rentid) {
        averageRentService.update(updateAverageRent, rentid);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
