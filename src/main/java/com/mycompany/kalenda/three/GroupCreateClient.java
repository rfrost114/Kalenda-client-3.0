/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kalenda.three;

/**
 *
 * @author Richie Frost
 */

import packages.User;
import java.net.*;
import java.io.*;

public class GroupCreateClient {
    private Socket socket = null;
    private ObjectOutputStream outCommand = null;
    private ObjectInputStream inCommand = null;
    
    public GroupCreateClient(String address, int port, User user){
        
        try {
        
            socket = new Socket(address, port);
            System.out.println("Connection created");
            
            outCommand = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inCommand = new ObjectInputStream(socket.getInputStream());
            outCommand.writeObject(user);
            outCommand.flush();
            
            socket.close();
            outCommand.close();
            inCommand.close();
            
        
        }
        catch (UnknownHostException e) {
            System.out.println(e);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    
    }
    

}


