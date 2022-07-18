package rhis.software.employees.services;

import rhis.software.employees.entities.*;

import java.util.List;

public interface MyIservices {

    public List<User> userdisplayAll();
    public User addUser(User u);
    public User modifyUser(User u);
    public void deleteUser(long id);
    public User retrieveUser(long id);

    public List<Role> roledisplayAll();
    public Role addRole(Role r);
    public Role modifiyRole(Role r);
    public void deleteRole(long r);



    public List<Affectation> affectationdisplayAll();
    public Affectation addAffectation(Affectation a, long role_id,long user_id);
    public Affectation modifyAffectation(Affectation a,long role_id,long user_id);
    public void deleteAffectation(long id);


    public List<Ecran> ecrandisplayAll();
    public Ecran addEcran(Ecran e);
    public Ecran modifyEcran(Ecran e);
    public Ecran retrieveEcran(long id);
    public void deleteEcran(long id);

    public List<Droit> droitdisplayAll();
    public Droit addDroit(Droit d, long role_id,long ecran_id);
    public Droit modifyDroit(Droit d, long role_id,long ecran_id);
    public Droit retrieveDroit(long id);
    public void deleteDroit(long id);
}
