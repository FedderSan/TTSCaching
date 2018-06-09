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
 

    /**
     * Test of downloadFile method, of class HttpDownloadUtility.
     */
    @Test
    public void testDownloadFile() throws Exception {
        System.out.println("downloadFile");
        String fileURL = "https://jdbc.postgresql.org/download/postgresql-42.2.2.jar";
        String saveDir = "C:\\temp\\";
        HttpDownloadUtility.downloadFile(fileURL, saveDir);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
