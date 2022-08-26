package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;
public class RegistryTest {
    private Registry registry = new Registry();
    @Test
    public void validateRegistryResultWhenEverythingIsAlright() {
        Boolean ALIVE = Boolean.TRUE;
        String Camilo = "Camilo";
        Person person = new Person(Camilo, 123, 20, Gender.MALE, ALIVE);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }
    // TODO Complete with more test cases
    @Test
    public void validateRegistryResultWhenAPersonIsDead() {
        Boolean ALIVE = Boolean.FALSE;
        String Camilo = "Camilo";
        Person person = new Person(Camilo, 123, 20, Gender.MALE, ALIVE);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }
    @Test
    public void validateRegistryResultWhenAPersonIsUnderageToVote() {
        Boolean ALIVE = Boolean.FALSE;
        String Camilo = "Camilo";
        Person person = new Person(Camilo, 123, 10, Gender.MALE, ALIVE);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
    @Test
    public void validateRegistryResultWhenAPersonHasUnvalidAgeToVote() {
        Boolean ALIVE = Boolean.FALSE;
        String Camilo = "Camilo";
        Person person = new Person(Camilo, 123, -5, Gender.MALE, ALIVE);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }


}

