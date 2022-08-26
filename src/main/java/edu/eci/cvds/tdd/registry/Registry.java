package edu.eci.cvds.tdd.registry;
import edu.eci.cvds.tdd.registry.Person;
public class Registry {
    public RegisterResult registerVoter(Person p) {
        // TODO Validate person and return real result.
        int age = p.getAge();
        int id = p.getId();
        boolean state = p.isAlive();
        RegisterResult result = null;
        if (age < 0 || age > 110){
            result = RegisterResult.INVALID_AGE;
        } else if (age < 18 && age > 0 ) {
            result = RegisterResult.UNDERAGE;
        } else if (state != Boolean.TRUE){
            result = RegisterResult.DEAD;
        }else{
            result= RegisterResult.VALID;
    }
        return result;
}}