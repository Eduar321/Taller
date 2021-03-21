/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.taller;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class Taller {
    public static void main(String[] args) {
        octavo();
    }
    
    
    public static void primero() {
        Scanner entrada= new Scanner(System.in);
        float num1, num2,suma, resta;
        System.out.println("Digite el primer numero: ");
        num1=entrada.nextFloat();
        System.out.println("Digite el segundo numero:  ");
        num2=entrada.nextFloat();
        suma=num1+num2;
        resta=num1-num2;
        System.out.println("Este es su suma: "+suma);
        System.out.println("Esta es su resta:"+resta );
        
        
    }
    
    public static void segundo()  {
      Scanner entrada= new Scanner(System.in);
      //variable entrada
      String palabra;
      //datos de cada reino
        System.out.println("Escriba el nombre del animal");
        palabra=entrada.next();
        
        if("gato".equalsIgnoreCase(palabra)||"ballena".equalsIgnoreCase(palabra)||
            "perro".equalsIgnoreCase(palabra)||"mariposa".equalsIgnoreCase(palabra)||
              "tigre".equalsIgnoreCase(palabra)||"elefante".equalsIgnoreCase(palabra)||
                "Cocodrilo".equalsIgnoreCase(palabra)||"Rana".equalsIgnoreCase(palabra)){    
            System.out.println("Pertenece al reino animal");
            
         }else if("aguacate".equalsIgnoreCase(palabra)||"coliflor".equalsIgnoreCase(palabra)||
                 "cactus".equalsIgnoreCase(palabra)||"tulipan".equalsIgnoreCase(palabra)||
                 "rosa".equalsIgnoreCase(palabra)){
             System.out.println("Pertenece al reino vegetal");
             
         }else if("moho".equalsIgnoreCase(palabra)||"hongo".equalsIgnoreCase(palabra)||
                 "seta calabaza".equalsIgnoreCase(palabra)){
            System.out.println("Pertenece al reino fungi");
            
         }else if("bacteria".equalsIgnoreCase(palabra)){
            System.out.println("Pertenece al reino monera");
            
         }else if("esporozoos".equalsIgnoreCase(palabra)||"algas ".equalsIgnoreCase(palabra)){
            System.out.println("Pertenece al reino protista");
         }
    }
    
    
    
    public static void tercero() {
        int num;
                //hacemos la conversion ya que sin el integer solo aplica para datos tipo string
        num=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 1-7"));
        
        switch(num){
            case 1:JOptionPane.showMessageDialog(null,"La nota musical es: do ");
            //el break es para cuando digite un numero no siga con los demas
             break;
            case 2:JOptionPane.showMessageDialog(null,"La nota musical es: re ");
             break;
            case 3:JOptionPane.showMessageDialog(null,"La nota musical es: mi ");
             break;
            case 4:JOptionPane.showMessageDialog(null,"La nota musical es: fa ");
             break;
            case 5:JOptionPane.showMessageDialog(null,"La nota musical es: sol ");
             break;
            case 6:JOptionPane.showMessageDialog(null,"La nota musical es: la");
             break;
            case 7:JOptionPane.showMessageDialog(null,"La nota musical es: si ");
             break;
            default:JOptionPane.showMessageDialog(null,"El numero que digito no se"
                    + " encuentra en el rango");
                
        }             
        
    }
    
    
    
    public static void cuarto(){
        int i,a;
        a=Integer.parseInt(JOptionPane.showInputDialog("Digite hasta que numero quiere la secuencia:" ));
        for(i=0; i<=a; i++){
             JOptionPane.showMessageDialog(null,i);
        }
        
    }
    
    
    public static void quinto() {
        int i, b;
        b=Integer.parseInt(JOptionPane.showInputDialog("Digite hasta que numero quiere la secuencia: "));
        for(i=0; i<=b; i=i+3){
              JOptionPane.showMessageDialog(null,"El numero que digito es impar");
        }
    }
    
    
    public static void sexto() {
        int a;
        a=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para saber si es par o impar"));
        if(a%2==0){
            JOptionPane.showMessageDialog(null,"El numero que digito es par");
        }else{
            JOptionPane.showMessageDialog(null,"El numero que digito es impar");
        }
    }
   
    
    
    public static void septimo() {
        int i=1,n, a=0, b=1, c=0;
        n=Integer.parseInt(JOptionPane.showInputDialog("Digite hasta que numero"
                + " quiere la serie Fibonacci"));
       /** JOptionPane.showMessageDialog(null,0);
        JOptionPane.showMessageDialog(null,1);**/
        while(i<=n){
        c=a+b; //1,2,3,5,8
        JOptionPane.showMessageDialog(null,c); //1,2,3,5,8
        a=b; //1,1,2,3,3
        b=c; //1,2,3,5,8
        i++; //2,3,4,5,6
        
        }  
        JOptionPane.showMessageDialog(null,"Fin del programa");
  }
    
    
    public static void octavo() {
        
        int entrada, contador=0, b=6;
        do{
          entrada=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 1-9"));
           if(entrada==b){
            JOptionPane.showMessageDialog(null,"Acceso Permitido");
             contador= contador+4;
          }else{
            JOptionPane.showMessageDialog(null,"Acceso Denegado");
            contador= contador+1;
        }
           if(contador==3){
              JOptionPane.showMessageDialog(null,"Clave bloqueada"); 
           }
    }while(contador<3);
        
 }
    
    
    
   
    
   
    
    
    
    
    
    
    
    
}
    
       
  
