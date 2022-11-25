package com.isa.service;

import com.isa.Repository.CentreRepository;
import com.isa.model.Centre;
import com.isa.model.dto.CentreDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * u servisu kada imamo dto i model uvek pozivamo modele, zato sto backend radi sa modelima
 * a tek u kontroleru koji komiunicira sa front delom tu koristimo dto
 * ovde nisam u repo save fju impl zato sto je crud funkcionalnost automatski impl
 */

@Service
public class CentreService {

<<<<<<< HEAD
    private final CentreRepository centreRepository;

    public CentreService(CentreRepository centreRepository) {
        this.centreRepository = centreRepository;
    }
=======
    @Autowired
    private CentreRepository centreRepository;
>>>>>>> 6f0180b8138934803b3a11a2fa1bc9d50fe263e8

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

//    public List<Centre> searchCentre(CentreDTO dto) {
//        return centreRepository.searchCentre(dto.getName().toLowerCase(), dto.getCity().toLowerCase());
//    }

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
    public List<Centre> getAllCenters(){
        return centreRepository.findAll();
    }
}
