package com.bridgelabs.userregistration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for validating first name
 */
public class UserRegistrationTest {
	 UserRegistration userRegistration;
	    @Before
	    public void before() {
	        userRegistration = new UserRegistration();
	    }

	    @Test
	    public void givenFirstName_WhenProper_ShouldReturnTrue() {
	        boolean result = userRegistration.firstName("sreekanth");
	        Assert.assertEquals(true, result);
	    }

	    @Test
	    public void givenFirstName_WhenNotProper_ShouldReturnFlase() {
	        boolean result = userRegistration.firstName("sreekanth");
	        Assert.assertEquals(false, result);
	    }
	    /**
	     * Unit test for validating last name
	     */
	    @Test
	    public void givenLastName_WhenProper_ShouldReturnTrue() {
	        boolean result = userRegistration.lastName("sree");
	        Assert.assertEquals(true, result);
	    }

	    @Test
	    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
	        boolean result = userRegistration.lastName("sree");
	        Assert.assertEquals(false, result);

	    }
}
