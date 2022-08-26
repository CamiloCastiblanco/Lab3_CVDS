package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;
public class RegistryTest {
    private Registry registry = new Registry();
    @Test
    public void validateRegistryResultWhenAPersonHasUnvalidAgeToVote() {
        //Arrange
        Boolean ALIVE = Boolean.FALSE;
        String Camilo = "Camilo";
        Person person = new Person(Camilo, 123, -5, Gender.MALE, ALIVE);
        //Act
        RegisterResult result = registry.registerVoter(person);
        //Assert
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
    @Test
    public void validateRegistryResultWhenAPersonIsUnderageToVote() {
        //Arrange
        Boolean ALIVE = Boolean.FALSE;
        String Camilo = "Camilo";
        Person person = new Person(Camilo, 123, 10, Gender.MALE, ALIVE);
        //Act
        RegisterResult result = registry.registerVoter(person);
        //Assert
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
    @Test
    public void validateRegistryResultWhenAPersonIsDead() {
        //Arrange
        Boolean ALIVE = Boolean.FALSE;
        String Camilo = "Camilo";
        Person person = new Person(Camilo, 123, 20, Gender.MALE, ALIVE);
        //Act
        RegisterResult result = registry.registerVoter(person);
        //Assert
        Assert.assertEquals(RegisterResult.DEAD, result);
    }
    @Test
    public void validateRegistryResultWhenEverythingIsAlright() {
        //Arrange
        Boolean ALIVE = Boolean.TRUE;
        String Camilo = "Camilo";
        Person person = new Person(Camilo, 123, 20, Gender.MALE, ALIVE);
        //Act
        RegisterResult result = registry.registerVoter(person);
        //Assert
        Assert.assertEquals(RegisterResult.VALID, result);
    }
    // TODO Complete with more test cases





}

