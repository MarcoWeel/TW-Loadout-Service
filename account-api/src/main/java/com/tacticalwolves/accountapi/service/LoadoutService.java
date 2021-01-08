package com.tacticalwolves.accountapi.service;

import com.tacticalwolves.accountapi.entity.Loadout;
import com.tacticalwolves.accountapi.repository.LoadoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoadoutService {
    @Autowired
    private LoadoutRepository repository;

    public Loadout SaveLoadout(Loadout loadout){
    return repository.save(loadout);
    }

    public List<Loadout> GetLoadouts(){
        return repository.findAll();
    }

    public List<Loadout> GetLoadoutById(String Id){
        return repository.findByUserId(Id);
    }

    public String DeleteLoadoutById(int Id){
        repository.deleteById(Id);
        return "Loadout Deleted";
    }

//    public User UpdateUser(User user){
//        User ExistingUser = GetUserById(user.getId());
//        ExistingUser.setEmail(user.getEmail());
//        ExistingUser.setName(user.getName());
//        ExistingUser.setRole(user.getRole());
//        ExistingUser.setPasswordHash(user.getPasswordHash());
//        return repository.save(ExistingUser);
//    }

}
