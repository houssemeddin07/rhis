package rhis.software.employees.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rhis.software.employees.entities.*;
import rhis.software.employees.services.MyIservices;

import java.util.List;

@RestController
public class myController {
    @Autowired
    MyIservices service;

    @GetMapping("/getusers")
    public List<User> getAllUsers(){
        return service.userdisplayAll();
    }
    @PutMapping("/modifyuser")
    public User modifyUser(@RequestBody User u){
        return service.modifyUser(u);
    }
    @PostMapping("/adduser")
    public User adduser(@RequestBody User u){
        return service.addUser(u);
    }
    @DeleteMapping("/deleteuser/{id}")
    public void deleteuser(@PathVariable("id") long id){
        service.deleteUser(id);

    }
    @GetMapping("/retriveuser/{id}")
    public User retrieveuser(@PathVariable("id")long id){
       return service.retrieveUser(id);
    }

    @GetMapping("/retrieve-all-roles")
    public List<Role> retriveroles(){
        return service.roledisplayAll();
    }
    @PostMapping("/add-role")
    public Role addrole(@RequestBody Role role){
        return service.addRole(role);
    }
    @PutMapping("/modify-role")
    public Role modifyRole(@RequestBody Role role){
        return service.modifiyRole(role);
    }
    @DeleteMapping("/delete-role/{id}")
    public void deleterole(@PathVariable("id") long id){
        service.deleteRole(id);
    }
    @GetMapping("/retireve-all-affectation")
    public List<Affectation> getAllAffectation(){
        return service.affectationdisplayAll();
    }
    @PutMapping("/modify-affectation/{role_id}/{user_id}")
    public Affectation modifyAffectation(@PathVariable("role_id") long role_id,@RequestBody Affectation a,@PathVariable("user_id") long user_id){
        return service.modifyAffectation(a,role_id,user_id);

    }

    @PostMapping("/add-affectation/{role_id}/{user_id}")
    public Affectation addAffectation(@PathVariable("role_id") long role_id,@RequestBody Affectation a,@PathVariable("user_id") long user_id){
        return service.addAffectation(a,role_id,user_id);

    }

    @DeleteMapping("/delete-affectation/{id}")
    public void deleteAffectation(@PathVariable("id") long id){
        service.deleteAffectation(id);
    }
    @GetMapping("/get-all-ecran")
    public List<Ecran> getAllEcran(){
        return service.ecrandisplayAll();
    }

    @PutMapping("/modify-ecran")
    public Ecran modifyEcran(@RequestBody Ecran e){
        return  service.modifyEcran(e);
    }

    @PostMapping("/add-ecran")
    public Ecran addEcran(@RequestBody Ecran e){
        return service.addEcran(e);
    }
    @GetMapping("/retrieve-ecran/{id}")
    public Ecran retiriveEcranById(@PathVariable("id") long id){

        return service.retrieveEcran(id);
    }

    @DeleteMapping("/delete-ecran/{id}")
    public void deleteEcran(@PathVariable("id")long id){
        service.deleteEcran(id);
    }

    @GetMapping("/retrieve-all-droits")
    public List<Droit> getAllDroits(){
        return service.droitdisplayAll();
    }

    @PostMapping("/add-droit/{role_id}/{ecran_id}")
    public Droit addDroit(@PathVariable("role_id") long role_id,@PathVariable("ecran_id") long ecran_id,@RequestBody Droit droit)
    {
        return service.addDroit(droit,role_id,ecran_id);
    }
    @PutMapping("/modify-droit/{role_id}/{ecran_id}")
    public Droit modifyDroit(@PathVariable("role_id") long role_id,@PathVariable("ecran_id") long ecran_id,@RequestBody Droit droit)
    {
        return service.modifyDroit(droit,role_id,ecran_id);
    }

    @GetMapping("/retrieve-droit/{id}")
    public Droit retrieveDroit(@PathVariable("id") long id){
        return service.retrieveDroit(id);
    }
    @DeleteMapping("/delete-droit/{id}")
    public void deleteDroit(@PathVariable("id")long id){
        service.deleteDroit(id);
    }
}
