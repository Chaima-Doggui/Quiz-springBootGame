package com.guess.it.services.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guess.it.persistance.entities.Acteur;
import com.guess.it.persistance.entities.Role;
import com.guess.it.persistance.entities.RoleKey;
import com.guess.it.services.interfaces.ActeurServiceInterface;
import com.guess.it.services.interfaces.RoleServiceInterface;

@CrossOrigin(origins = "", maxAge = 3600)
@RestController
@RequestMapping("/api/roles")
public class RoleController {

    @Autowired
    RoleServiceInterface RoleService ;

    @RequestMapping(value="/ajouterRole", method = RequestMethod.POST, consumes="application/json", produces = "application/json")
    Role save(@RequestBody Role role) {
          Role r=RoleService.saveRole(role);
        return r ;
    }

    @GetMapping("/getActeurById/{id}")
    Role getRoleById(@PathVariable RoleKey id) {
        return RoleService.getRole(id);
    }

    
    @GetMapping("/listeRole")
   public List<Role> Role() {
        return RoleService.getAllRoles();}

    @DeleteMapping("/deleteById/{id}")
    boolean deleteById(@PathVariable RoleKey id) {
        RoleService.deleteRoleById(id);
        return true;
    }
}