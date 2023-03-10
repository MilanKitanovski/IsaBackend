package com.isa.service;

import com.isa.repository.UserRepository;
import com.isa.config.SecurityUtils;
import com.isa.model.User;
import com.isa.dto.PasswordChangeDTO;
import com.isa.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;
    public List<User> findAll(){
        return  userRepository.findAll();
    }

    public User saveUser(User user){return userRepository.save (user);}

//    public List<User> getUsersByName(String name) {
//        return userRepository.findUserByName(name);
//    }

    public User findById(int id){
        return userRepository.findById(id);
    }


    public User update (UserDTO dto) {

        User user = userRepository.findById(dto.getId());
        user.setCountry(dto.getCountry());
        user.setName(dto.getName());
        user.setSurname(dto.getSurname());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        user.setAddress(dto.getAddress());
        user.setCity(dto.getCity());
        user.setMobile(dto.getMobile());
        user.setUniquePersonalId(dto.getUniquePersonalId());
        user.setGender(dto.getGender());
        //user.setCentre(dto.getCentreId()));
        user.setUserType(dto.getUserType());
        user.setInformation(dto.getInformation());
        user.setProfession(dto.getProfession());

        return userRepository.save(user);
    }

//    public List<User> getUsersByName(String name){
//        return userRepository.findByName(name);
//    }

        // public List<User>findByName(String name){return userRepository.findByName(name);}

//    public List<User>findAllUsersByRole(){return  userRepository.findByRole();}

   // public List<User> findAllAdmin(){return userRepository.findAllAdmin();}




    public Optional<User> deleteById(int id){
         return userRepository.deleteById(id);
    }

      public User findOneByEmail(String email){
        return userRepository.findUserByEmail(email);
    }

//    public User searchCentre(User user){
//        return userRepository.searchCentre(user);
//    }


    public User getCurrentUser() {

        String email = SecurityUtils.getCurrentUserLogin().get();

        return userRepository.getByEmail(email);
    }

    public boolean updateUserPassword(PasswordChangeDTO passwordChangeDTO){
        User user = getCurrentUser();

        if (passwordChangeDTO.getOldPassword() == null || passwordChangeDTO.getNewPassword() == null) {
            return false;
        }

        BCryptPasswordEncoder bcpe = new BCryptPasswordEncoder();
        if (!bcpe.matches(passwordChangeDTO.getOldPassword(), user.getPassword())) {
            return false;
        }

        user.setPassword(passwordEncoder.encode(passwordChangeDTO.getNewPassword()));
        userRepository.save(user);

        return true;
    }

}
