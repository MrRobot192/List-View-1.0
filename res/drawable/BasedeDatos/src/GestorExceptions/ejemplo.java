/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestorExceptions;

import java.util.Scanner;

/**
 *
 * @author OhmAster
 */
public class ejemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean siguiente;
        do{
            try{
                siguiente = false;
                System.out.println("ingresa un valor de tipo entero: ");
                num = sc.nextInt();
                int cuadrado = num * num;
                System.out.println("el cuadrado de "+num+" es: "+cuadrado);
            }catch(Exception e){
                System.out.println("debe ingresar un valor de tipo entero: ");
                sc.next();
                siguiente = true;
            }
        }while(siguiente);
    }
}
