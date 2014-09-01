/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gamersrepublic.test.domain;

import com.gamersrepublic.domain.VideoGame;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Wesley
 */
public class VideoGameTest {
    
    public static VideoGame service;
     public static VideoGame newService;
    
    public VideoGameTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   @Test
    public void CustomerCreationTest()
    {
    service = new VideoGame.Builder("0010112342").title("Tomb Raider").build();
    Assert.assertEquals(service.getTitle(),"Tomb Raider");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
