/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daniel.web.ttscaching;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author danie
 */
public class TTSCaching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //TEst from mac
        HttpDownloadUtility HttpDown = new HttpDownloadUtility();
        try {
            HttpDown.downloadFile("https://jdbc.postgresql.org/download/postgresql-42.2.2.jar","C:\\temp\\");
        } catch (IOException ex) {
            Logger.getLogger(TTSCaching.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
