package com.isa.service;

import com.isa.repository.CentreRepository;
import com.isa.model.Centre;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * u servisu kada imamo dto i model uvek pozivamo modele, zato sto backend radi sa modelima
 * a tek u kontroleru koji komiunicira sa front delom tu koristimo dto
 * ovde nisam u repo save fju impl zato sto je crud funkcionalnost automatski impl
 */

@Service
public class CentreService {

    private final CentreRepository centreRepository;

    public CentreService(CentreRepository centreRepository) {
        this.centreRepository = centreRepository;
    }

    public Centre addCentre(Centre centre){
        return centreRepository.save(centre);
    }

    public List<Centre> findAllCentre(){
       return  centreRepository.findAll();
    }

    public  Centre updateCentre(Centre centre){
        return  centreRepository.save(centre);
    }

//    public Centre findCentreById(int id){
//        return  centreRepository.findCentreById(id).orElseThrow(() -> new UserNotFoundException("User is not found !"));
//    }

//    public void deleteCentre(int id){
//        centreRepository.deleteCentreById(id);
//    }

    public Optional<Centre> findCentreByName(String name){
        return centreRepository.findCentreByName(name);
    }

//    public Optional<Centre> findCentreByAddress(String addres){
//        return centreRepository.findCentreByAddress(addres);
//    }

    public List<Centre> searchCentre(String centre) {
        return centreRepository.searchCentreByNameOrAddress(centre);
    }

/*
    public Centre createCentre(Centre centre){
        return centreRepostirory.save(centre);
    }

   public void deleteCentre(int id){

        ArrayList<Centre> centers = new ArrayList<Centre>();
          if(!centers.isEmpty()){
           for(Centre centre :
           centers){
               if(centre.getId() == id){
                   Centre centre1 = centre;
                   centreRepostirory.delete(centre);
               }
           }
    }

    }
*/
    public List<Centre> getAllCenters(double grade){
        List<Centre> centers = centreRepository.findAll();
        List<Centre> centersResult = new ArrayList<>();
        double left = 0;
        double right = 0;

        if(grade == 5) {
            left = 4.5;
            right = 5;
        } else if (grade == 4) {
            left = 3.5;
            right = 4.49;
        } else if (grade == 3) {
            left = 2.5;
            right = 3.49;
        }else if (grade == 2) {
            left = 1.5;
            right = 2.49;
        }else if (grade == 1) {
            left = 1.49;
            right = 0;
        }

        for(Centre center : centers){
            if(center.getAvgGrade() >= left && center.getAvgGrade() <= right){
                centersResult.add(center);
            }
        }

        return centersResult;
    }

    public List<Centre> findCentreByAvgGrade(int grade){
        return centreRepository.findCentreByAvgGrade(grade);
    }

    public List<Centre> distance(double lat1, double lon1, double distanceLimit) {

        List<Centre> centers = centreRepository.findAll();
        List<Centre> centersResult = new ArrayList<>();

        for(Centre center : centers){

            double lat2 = center.getLatitude();
            double lon2 = center.getLongitude();

            int R = 6371; // Radius of the earth

            double latDistance = Math.toRadians(lat2 - lat1);
            double lonDistance = Math.toRadians(lon2 - lon1);
            double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                    + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                    * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
            double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
            double distance = R * c * 1000; // convert to meters
            if(distance <= distanceLimit){
                centersResult.add(center);
            }
        }
        return centersResult;
    }

    public List<Centre> workTime(Date startWork, Date endWork){
        List<Centre> centers = centreRepository.findAll();
        List<Centre> centersResult = new ArrayList<>();

        for(Centre center : centers) {
            if(center.getStartWork().after(startWork) && center.getEndWork().before(endWork)){
                centersResult.add(center);
            }
        }

        return centersResult;
    }
}


