package com.tacticalwolves.accountapi.controller;

import com.tacticalwolves.accountapi.entity.Loadout;
import com.tacticalwolves.accountapi.service.LoadoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequestMapping("/loadout")
@CrossOrigin
public class LoadoutController {

    @Autowired
    private LoadoutService service;

    @RolesAllowed({"ADMIN", "MEMBER"})
    @PostMapping("")
    public Loadout addLoadout(@RequestBody Loadout loadout){return service.SaveLoadout(loadout);}

    @GetMapping("/{Id}")
    public Loadout findLoadoutById(@PathVariable int Id){return service.GetLoadoutById(Id);}
    
    @GetMapping("")
    public List<Loadout> findAllLoadouts(){return service.GetLoadouts();}

//    @PutMapping("")
//    public Loadout updateLoadout(@RequestBody Loadout loadout){return service.UpdateLoadout(loadout);}

    @RolesAllowed({"ADMIN", "MEMBER"})
    @DeleteMapping("/{Id}")
    public String deleteLoadout(@PathVariable int Id){return service.DeleteLoadoutById(Id);}

}
