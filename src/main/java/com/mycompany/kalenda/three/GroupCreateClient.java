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

//    public void clientAction(int actionNumber, long groupID, int groupSize, User user) {
//        /**
//         * 1 create group
//         * 2 join group
//         * 3 send user
//         */
////        Integer wrappedAction = Integer.valueOf(actionNumber);
//        try {
//            Boolean actionRec = true;
//            while (actionRec) {
//
//            outCommand.writeInt(actionNumber);
//            System.out.println("Action Number sent");
//
////            outCommand.writeInt(wrappedAction);
//            try {
//            actionRec = inCommand.readBoolean();
//            }
//            catch (Exception e) {
//            }
//        }
//        }
//        
//        catch(IOException ioe) {
//            System.out.println(ioe);
//        }
//        
//        switch (actionNumber) {
//            
//            case 1:
//                //create group
////                try {
////                outCommand.flush();}
////                catch (Exception r){}
//                createGroupAction(groupID, groupSize);
//                
//                break;
//            case 2:
//                // join group
//                joinGroupAction(user);
//                break;
//            default:
//                System.out.println("Invalid Action Number");
//                break;
//        }
//    
//    }
//    
//    private void createGroupAction(long groupID, int goupSize) {
//        try {
////            ObjectOutputStream createGroupOut = new ObjectOutputStream(socket.getOutputStream());
////            createGroupOut.flush();
////            createGroupOut.writeLong(groupID);
////            createGroupOut.writeInt(goupSize);
////            createGroupOut.close();
//            System.out.println("witing groupID");
//
//            outCommand.writeLong(groupID);
//
//            System.out.println("witing groupSize");
//            outCommand.writeInt(goupSize);
//        }
//        catch (IOException ioe) {
//            System.out.println(ioe);
//        }
//    }
//    
//    private void joinGroupAction (User user) {
//        
//        try {
////        ObjectOutputStream joinGroupOut = new ObjectOutputStream(socket.getOutputStream());
//        
//        outCommand.writeObject(user);
//        }
//        catch (IOException ioe) {
//            System.out.println(ioe);
//        }
//    }
