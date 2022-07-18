package rhis.software.employees.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rhis.software.employees.entities.*;
import rhis.software.employees.repositories.*;

import java.util.List;

@Service
@Transactional
public class MyServices implements MyIservices {
    @Autowired
    private userRepository ur;

    @Autowired
    private roleRepository rr;

    @Autowired
    private affectationRepository ar;

    @Autowired
    private ecranRepository er;

    @Autowired
    private droitRepository dr;

    @Override
    public List<User> userdisplayAll() {

        return (List<User>) ur.findAll();
    }

    @Override
    public User addUser(User u) {
        return ur.save(u);
    }

    @Override
    public User modifyUser(User u) {
        return ur.save(u);
    }

    @Override
    public void deleteUser(long u) {
            ur.deleteById(u);
    }

    @Override
    public User retrieveUser(long id) {
        return ur.findById(id).get();
    }

    @Override
    public List<Role> roledisplayAll() {
        return (List<Role>) rr.findAll();
    }

    @Override
    public Role addRole(Role r) {
        return rr.save(r);
    }

    @Override
    public Role modifiyRole(Role r) {
        return rr.save(r);
    }

    @Override
    public void deleteRole(long r) {

        rr.deleteById(r);
    }

    @Override
    public List<Affectation> affectationdisplayAll() {
        return (List<Affectation>) ar.findAll();
    }

    @Override
    public Affectation addAffectation(Affectation a, long role_id, long user_id) {
        Role r=rr.findById(role_id).orElse(null);
        User u=ur.findById(user_id).orElse(null);
        a.setUser(u);
        a.setRole_a(r);

        return ar.save(a);
    }

    @Override
    public Affectation modifyAffectation(Affectation a, long role_id, long user_id) {
        Role r=rr.findById(role_id).orElse(null);
        User u=ur.findById(user_id).orElse(null);
        a.setUser(u);
        a.setRole_a(r);

        return ar.save(a);
    }

    @Override
    public void deleteAffectation(long id) {

        ar.deleteById(id);
    }

    @Override
    public List<Ecran> ecrandisplayAll() {
        return (List<Ecran>) er.findAll();
    }

    @Override
    public Ecran addEcran(Ecran e) {
        return er.save(e);
    }

    @Override
    public Ecran modifyEcran(Ecran e) {
        return er.save(e);
    }

    @Override
    public Ecran retrieveEcran(long id) {
        return er.findById(id).orElse(null);
    }

    @Override
    public void deleteEcran(long id) {

        er.deleteById(id);
    }

    @Override
    public List<Droit> droitdisplayAll() {
        return (List<Droit>) dr.findAll();
    }

    @Override
    public Droit addDroit(Droit d, long role_id, long ecran_id) {
        Role r=rr.findById(role_id).orElse(null);
        Ecran e=er.findById(ecran_id).orElse(null);
        d.setEcran_d(e);
        d.setRole_d(r);
        return dr.save(d);
    }

    @Override
    public Droit modifyDroit(Droit d, long role_id, long ecran_id) {
        Role r=rr.findById(role_id).orElse(null);
        Ecran e=er.findById(ecran_id).orElse(null);
        d.setEcran_d(e);
        d.setRole_d(r);
        return dr.save(d);
    }

    @Override
    public Droit retrieveDroit(long id) {
        return dr.findById(id).orElse(null);
    }

    @Override
    public void deleteDroit(long id) {

        dr.deleteById(id);
    }
}
