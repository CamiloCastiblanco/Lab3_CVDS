package edu.eci.cvds.tdd.registry;
import java.util.ArrayList;
public class RegistryValidate {
    public RegisterResult registerVoter(Person p){
        ArrayList<Integer> persons = new ArrayList<Integer>();

            int age = p.getAge();
            int id = p.getId();
            boolean state = p.isAlive();
            RegisterResult result;
            if (age < 0 || age > 110){
                result = RegisterResult.INVALID_AGE;
            } else if (age < 18 && age > 0 ) {
                result = RegisterResult.UNDERAGE;
            } else if (state != Boolean.TRUE){
                result = RegisterResult.DEAD;
            }else if (persons.contains(id)){
                result= RegisterResult.DUPLICATED;
            }else {
                result= RegisterResult.VALID;
                persons.add(id);
            }
            return result;
    }
}
