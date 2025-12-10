/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systembank;

import java.time.LocalDateTime;


public class Transaccion {
    private String tipo ;
    private double monto ; 
    private LocalDateTime fecha;
    
public Transaccion(String tipo ,double monto ,LocalDateTime fecha){
    this.tipo = tipo ;
    this.monto = monto;
    this.fecha = fecha;
    
}

    @Override
    public String toString() {
        return "Transaccion{" + "tipo=" + tipo + ", monto=" + monto + ", fecha=" + fecha + '}';
    }
    
    
}
