package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;

public class Registry {
    RegistryValidate voter;
    ;
    ArrayList<Integer> persons = new ArrayList<Integer>();
        // TODO Validate person and return real result.
    RegisterResult result;

    public Registry(RegistryValidate injection) {
        voter = injection;
    }

    RegisterResult invalid() {
        return voter.registerVoter(RegisterResult.INVALID_AGE);
    }
    RegisterResult under() {
        return voter.registerVoter(RegisterResult.UNDERAGE);
    }
    RegisterResult dead() {
        return voter.registerVoter(RegisterResult.DEAD);
    }
    RegisterResult duplicated() {
        return voter.registerVoter(RegisterResult.DUPLICATED);
    }
    RegisterResult valid() {
        return voter.registerVoter(RegisterResult.VALID);
    }


}

