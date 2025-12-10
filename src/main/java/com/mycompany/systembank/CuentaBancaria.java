/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systembank;


public class CuentaBancaria {
    
    private String numeroCuenta ; 
    private String nombreTitular ; 
    private double saldo ; 
    
    public CuentaBancaria(String numeroCuenta,String nombreTitular){
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular; 
        this.saldo = 0.0 ; 
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double cantidad){
        if (cantidad > 0) {
         this.saldo +=  cantidad;
         System.out.println("su deposito se realizo con exito!!!");
         System.out.println("su nuevo saldo es: " + this.saldo);
        }
        else{
             System.out.println("debes poner un numero positivo");
        }
        
    }
    
   public void retirar(double cantidad){
   if (cantidad<saldo){
       this.saldo-= cantidad ; 
       System.out.println("su retiro fue con exito!!!");
       System.out.println("su saldo actual es: "+this.saldo);
   }else{
       System.out.println("Error: saldo insuficiente");
   }
   }
   
public double ObtenerSaldo(){
    return this.saldo;
}   
   
}


