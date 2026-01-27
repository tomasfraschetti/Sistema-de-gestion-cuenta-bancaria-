/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.systembank;

import GUI.Pantalla1;

public class Systembank {

    public static void main(String[] args) {
        
    CuentaBancaria c1 = new CuentaBancaria ("001","MARIA LOPEZ");
    
    
    Pantalla1 p1 = new Pantalla1();
    p1.setVisible(true);
    p1.setLocationRelativeTo(null);
    
    
   double CantidadDep = 1000.00;
    
    c1.depositar(CantidadDep);
    
    double retirar1 = 100.00;
   
    
    c1.retirar(retirar1);
    
    
    c1.ObtenerSaldo();
    
    c1.MostarHistorial();
    
    System.out.println("---------------------------------------");
    
    
   // c2.retirar(retirar1);
   // c2.retirar(retirar1);
   // c2.retirar(retirar1);
  //  c2.retirar(retirar1);
    
    
    
    //System.out.println("su numero de cuenta es: "+ c1.getNumeroCuenta());
   // System.out.println("su nombre de cuenta es: "+c1.getNombreTitular());
   // System.out.println("su saldo es: "+c1.getSaldo());
    
    System.out.println("-------------------------------------");
    
    
    
    //double CantidadDeposito = 500.00;
    
    //c1.depositar(CantidadDeposito);
    
    
   System.out.println("---------------------------------------");
   
   //double CantidadRetirar = 250.00;
   
  // c1.retirar(CantidadRetirar);
   
   System.out.println("---------------------------------------");
 
  // System.out.println("su saldo actual "+c1.ObtenerSaldo());
   
   
   System.out.println("---------------------------------------");
 
   
   
   
    
    
    
    }
}
