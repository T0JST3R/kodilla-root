package com.kodilla.testing.forum;
import com.kodilla.testing.Calculator;
import com.kodilla.testing.user.SimpleUser;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class ForumTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    //UserTest
    @Test
    public void testSimpleUser() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser" , "Waldemar Mlot");
        // When
        String result = simpleUser.getUsername();
        System.out.println("Testing :" + result);
        // Then
        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }








    //calculator test
    @Test
    public void testCalculator(){


        Calculator compute = new Calculator();

        double result11 = compute.addAtoB(5 ,5);
        double result22 = compute.substractAfromB(5 , 5);
        assertEquals(10 , result11 ,0);
        assertEquals(0 , result22 , 0);

    }
    }


