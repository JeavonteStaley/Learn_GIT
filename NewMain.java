/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author Jeavonte Staley
 */
public class NewMain{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(ageCal(2018,1994));
    }
    
    public static int ageCal(int yearOne, int yearTwo){
        int age = yearOne - yearTwo;
        return age;
    }
    
}
