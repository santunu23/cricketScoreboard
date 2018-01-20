/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricketscore;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Santunu23
 */
public class CricketScore {
   public static void deleteFile(){
         File folder=new File("C:\\Users\\Santunu23\\Documents\\NetBeansProjects\\CricketScore\\TxtFileFolder");
        File[] listofFiles=folder.listFiles();
        for(int i=0;i<listofFiles.length;i++){
            if(!listofFiles[i].isFile()){
                System.out.println("The folder is empty");
                break;
            }else{
        if(listofFiles[i].isFile()){
            System.out.println("File "+listofFiles[i].getName());
        }
        }
        }
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter name the file which you want to delete");
        String a=sc.next();
        File file=new File("C:\\Users\\Santunu23\\Documents\\NetBeansProjects\\CricketScore\\TxtFileFolder\\"+a);
        if(file.delete()){
            System.out.println(file+" deleted successfully");
        }
   }
   public static void displayFile() throws IOException{
      FileInputStream finput=new FileInputStream("C:\\Users\\Santunu23\\Documents\\NetBeansProjects\\CricketScore\\TxtFileFolder\\CricketScoreboard.txt");
      BufferedInputStream bin=new BufferedInputStream(finput);
      int i=0;
      while((i=bin.read())!=-1){
          System.out.print((char)i);
          
      }
       bin.close();
       finput.close();
   
   }
   public static void createFile() throws IOException{
       String dateFileFormat=new SimpleDateFormat("yyyyMMdd_HHmm").format(
        Calendar.getInstance().getTime());
        File newFile=new File("C:\\Users\\Santunu23\\Documents\\NetBeansProjects\\CricketScore\\TxtFileFolder\\"+dateFileFormat);
        newFile.createNewFile();
        System.out.println(newFile.getCanonicalPath());
        
   }
    public static void main(String[] args) throws IOException {
        
        System.out.println("press 1.Create a new score board,and insert data into it");
        System.out.println("press 2.Delete a score board");
        System.out.println("press 3.Display a score board");
        System.out.println("press 0.Exit from the program");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice");
        int a=sc.nextInt();
        while(true){
          if(a==0){
          break;}
          else if(a==1){
              
          }else if(a==2){
              deleteFile();
          }else if(a==3){
          displayFile();
          break;}
            
        }
    }
    
}
