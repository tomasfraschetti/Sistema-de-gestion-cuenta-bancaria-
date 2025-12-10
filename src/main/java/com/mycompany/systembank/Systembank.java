/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.systembank;

public class Systembank {

    public static void main(String[] args) {
        
    CuentaBancaria c1 = new CuentaBancaria ("001","MARIA LOPEZ");
    
    System.out.println("su numero de cuenta es: "+ c1.getNumeroCuenta());
    System.out.println("su nombre de cuenta es: "+c1.getNombreTitular());
    System.out.println("su saldo es: "+c1.getSaldo());
    
    System.out.println("-------------------------------------");
    
    
    double CantidadDeposito = 500.00;
    
    c1.depositar(CantidadDeposito);
    
    
   System.out.println("---------------------------------------");
   
   double CantidadRetirar = 250.00;
   
   c1.retirar(CantidadRetirar);
   
   System.out.println("---------------------------------------");
 
   System.out.println("su saldo actual "+c1.ObtenerSaldo());
   
   
   System.out.println("---------------------------------------");
   
   c1.MostarHistorial();
   
    
    
    
    }
}
