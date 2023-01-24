package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.*;

public class CarTest {

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
//    @Test
//    public void emptyTest(){
//        assertEquals(10,10,.001);
//
//    }
    Car test_car;
    @Before
    public void createCarObject(){

        test_car = new Car("Toyota","Prius",10,50);

    }
    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank(){
        assertEquals(10,test_car.getGasTankLevel(),.001);
    }
    @Test
    public void testInitialGasTank2(){
        assertFalse("The gas tank level is greater than 0",test_car.getGasTankLevel()==0);

    }

    //TODO: gasTankLevel is accurate after driving within tank range
@Test
    public void testGasTankAfterDriven(){
        test_car.drive(50);
        assertEquals(9,test_car.getGasTankLevel(),.001);
}

    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testGasTankAfterExceedingTankRange(){
       test_car.drive(800);
       assertEquals(0,test_car.getGasTankLevel(), .001);
    }
    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException(){
        test_car.addGas(50);
        fail("Tank can.t have more gas in tank that the size of the tank");
    }

}
