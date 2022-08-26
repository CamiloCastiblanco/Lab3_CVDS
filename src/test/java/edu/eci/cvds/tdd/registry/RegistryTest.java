package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;
public class RegistryTest {
    private Registry registry = new Registry();
    @Test
    public void validateRegistryResult() {
        Boolean ALIVE = Boolean.TRUE;
        String Camilo = "Camilo";
        Person person = new Person(Camilo, 123, 20, Gender.MALE, ALIVE);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }
    // TODO Complete with more test cases
}

