package com.isa.controller;

import com.isa.model.Centre;
import com.isa.service.CentreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("api/centres")
@CrossOrigin(origins = "*")
public class CentreController {

    @Autowired
    CentreService centreService;

//    @GetMapping(path="/get-all")
//    public ResponseEntity<?> getAll()
//    {
//        return new ResponseEntity<>(centreService.getAllCenters(), HttpStatus.OK);
//    }


    @GetMapping
    public ResponseEntity<?> findAllCenters(){
        return new ResponseEntity<>(centreService.findAllCentre(),HttpStatus.OK);
    }

    @GetMapping(path="/search")
    public ResponseEntity<?> searchCentre(@RequestParam String centre){
        return new ResponseEntity<>(centreService.searchCentre(centre), HttpStatus.OK);
    }

    @GetMapping(path="/search/centre-filterGrade")
    public ResponseEntity<List<Centre>> filterCentreByGrade(@RequestParam double grade){
        return new ResponseEntity<>(centreService.getAllCenters(grade), HttpStatus.OK);
    }

    @GetMapping(path="/search/centre-filterDistance")
    public ResponseEntity<List<Centre>> filterCentreByDistance(@RequestParam double lat1, @RequestParam double lon1,
                                                                 @RequestParam double distanceLimit){
        return new ResponseEntity<>(centreService.distance(lat1, lon1, distanceLimit), HttpStatus.OK);
    }

    @GetMapping(path="/search/centre-filterWorkTime")
    public ResponseEntity<List<Centre>> filterCentreByWorkTime(@RequestParam Date startWork, @RequestBody Date endWork){
        return new ResponseEntity<>(centreService.workTime(startWork, endWork), HttpStatus.OK);
    }

}
