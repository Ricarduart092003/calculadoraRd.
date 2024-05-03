/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author TOÑO
 */
public class Calculadora {

    private double n1;
    private double n2;
    private String signo;
    private double resultado;
    private double suma;
    private double resta;
    private double multiplicacion;
    private double division;

    
    public Calculadora() {
        n1 = 0;
        n2 = 0;
        signo = "";
        resultado = 0;
        suma = 0;
        resta =0;
        multiplicacion =0;
        division =0;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public void agregar(int num) {
        setSigno(signo + num);
    }

    public double suma(String num) {
        double numero = Double.parseDouble(num);
        this.resultado += numero;
        setSigno("");
        return 0;
        
    }

    public double resta(String num) {
        double numero = Double.parseDouble(num);
        this.resultado -= numero;
        setSigno("");
        return 0;
    }
    public double multiplicacion(String num) {
        double numero = Double.parseDouble(num);
        this.resultado *= numero;
        setSigno("");
        return 0;
    }
    public double division (String num) {
        double numero = Double.parseDouble(num);
        this.resultado /= numero;
        setSigno("");
        return 0;
    }
    public void setResultado(double resultado) {
    this.resultado = resultado;
}
    
public double operaciones(String signo) {
    switch(signo) {
        case "+":
            resultado = n1 + n2;
            break;
        case "-":
            resultado = n1 - n2;
            break;
        case "*":
            resultado = n1 * n2;
            break;
        case "/":
            if (n2 != 0) {
                resultado = n1 / n2;
            }
            break;
        default:
            
            break;
    }
    
    return resultado;
}

    void borrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}





    
