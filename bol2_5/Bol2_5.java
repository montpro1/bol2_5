/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2_5;

import java.util.Scanner;

/**
 *
 * @author vmontestovar
 */
public class Bol2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("teclee el sueldo fijo");
        float sueldofijo=teclado.nextFloat();
        System.out.println("teclee el importe de las ventas totales");
        float ventas=teclado.nextFloat();
        System.out.println("teclee el numero de kilometros hechos");
        float km=teclado.nextFloat();
        System.out.println("teclee el numero de los dias de dieta");
        float dietas=teclado.nextFloat();
        float soldobruto=sueldofijo+(ventas*5/100)+km*2+dietas*30;
        System.out.println(soldobruto+" euros es el sueldo bruto");
     
        float soldoliquido= (soldobruto)-(soldobruto*18/100)+36;
        System.out.println(soldoliquido+" euros es el sueldo liquido");
        
        
        
               
        // TODO code application logic here
    }
    
}
