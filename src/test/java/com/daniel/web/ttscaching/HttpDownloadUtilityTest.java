/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daniel.web.ttscaching;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
//import com.daniel.web.ttscaching.HttpDownloadUtility;

/**
 *
 * @author danie
 */
public class HttpDownloadUtilityTest {
    
    
    public HttpDownloadUtilityTest() {
    }
    
    
    
    @BeforeClass
    public static void setUpClass() {
        try
        {
            HttpDownloadUtility tester = new HttpDownloadUtility();
        }
         catch (IOException ex) {
            Logger.getLogger(TTSCaching.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void DwlFile()
    {
        
        assert.equals(this)
    }
}
