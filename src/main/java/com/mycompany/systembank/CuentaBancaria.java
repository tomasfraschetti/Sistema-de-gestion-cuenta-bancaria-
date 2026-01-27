/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systembank;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class CuentaBancaria {
    
    private final String numeroCuenta ; 
    private  final String nombreTitular ; 
    protected double saldo ;
    protected ArrayList<Transaccion> HistorialTransacciones ;
    
    public CuentaBancaria(String numeroCuenta,String nombreTitular){
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular; 
        this.saldo = 0.0 ; 
        this.HistorialTransacciones = new ArrayList();
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
    
    public java.util.List<Transaccion> getListaTransacciones() {
    return this.HistorialTransacciones;
     }
    
    public  void depositar(double cantidad){
        if (cantidad > 0) {
         this.saldo +=  cantidad;
         this.HistorialTransacciones.add(new Transaccion("deposito",cantidad,LocalDateTime.now()));
         System.out.println("su deposito se realizo con exito!!!");
         System.out.println("su nuevo saldo es: " + this.saldo);
        }
        else{
             System.out.println("debes poner un numero positivo");
        }
        
    }
    
   public void retirar(double cantidad){
   if (cantidad <= saldo){
       this.saldo-= cantidad ;
       this.HistorialTransacciones.add(new Transaccion("retiro",cantidad,LocalDateTime.now()));
       System.out.println("su retiro fue con exito!!!");
       System.out.println("su saldo actual es: "+this.saldo);
   }else{
       System.out.println("Error: saldo insuficiente");
   }
   }
   
public double ObtenerSaldo(){
    return this.saldo;
}  

public void MostarHistorial (){
System.out.println("HISTORIAL DE TRANSACCIONES ");

// creo una condicion donde si la  lista esta vacia devuelve un true
//y el return dentro de un metodo void corta el bucle

if(this.HistorialTransacciones.isEmpty()){
    System.out.println("ERROR: No hay transacciones en esta cuenta");
    return;
    
}
  // hago un for-each para recorrer la lista 
  for (Transaccion t : this.HistorialTransacciones){
      System.out.println(": "+t);
  }
}
  
public void Transferir(double Cantidad ,CuentaBancaria cuentaDestino){
   // Validar si la cuenta de origen (this) tiene saldo
    if (Cantidad > 0 && this.saldo >= Cantidad) {
        
        this.saldo -= Cantidad;
        cuentaDestino.saldo += Cantidad;
        
        
        cuentaDestino.depositar(Cantidad);
        
        System.out.println("Transferencia realizada con exito a " + cuentaDestino.getNombreTitular());
        
        String detalleEnvio = "Transferencia enviada a: " + cuentaDestino.getNombreTitular() + " (Cta: " + cuentaDestino.getNumeroCuenta() + ")";
        this.HistorialTransacciones.add(new Transaccion("Transferencia enviada", Cantidad, LocalDateTime.now()));
        
    } else {
        System.out.println("Error: Saldo insuficiente o cantidad inválida para transferir.");
    }
 
}
   
}


