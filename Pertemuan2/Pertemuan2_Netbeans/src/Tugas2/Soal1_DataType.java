/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;
import java.util.Scanner;

/**
 *
 * @author MiftahFaiz
 * Nama : Miftah Faiz Hartanto
 * Kelas : D3 2B Teknik Informatika
 */
public class Soal1_DataType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner keluar = new Scanner(System.in);
        
        int i=1;
        String angkaInputan;
        while(i<5){
        try{
        System.out.print("Input" + i +": ");
        angkaInputan = input.nextLine();
        long longIn = Long.parseLong(angkaInputan);
        System.out.println("can be fitted in : ");
        
        if (longIn >= Short.MIN_VALUE && longIn <= Short.MAX_VALUE){
        System.out.println("* Short");  
        }
        if (longIn >= Integer.MIN_VALUE && longIn <= Integer.MAX_VALUE){
        System.out.println("* Integer");  
        }
        if (longIn >= Long.MIN_VALUE && longIn <= Long.MAX_VALUE){
        System.out.println("* Long");  
        }
        if (longIn >= Byte.MIN_VALUE && longIn <= Byte.MAX_VALUE){
        System.out.println("* Byte");  
        }
        }
        catch(NumberFormatException e){
        System.out.println("can't be fitted in : Long");
        }
        
        
        i++;
      
        }
    }
}
