package com.isa.controller;

import com.isa.model.Centre;
import com.isa.model.dto.CentreDTO;
import com.isa.service.CentreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/centres")
@CrossOrigin(origins = "http://localhost:4200")
public class CentreController {

    @Autowired
    CentreService centreService;

    @GetMapping(path="/get-all")
    public ResponseEntity<?> getAll()
    {
        return new ResponseEntity<>(centreService.getAllCenters(), HttpStatus.OK);
    }
}
