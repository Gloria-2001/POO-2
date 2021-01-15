/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometria;

/**
 *
 * @author JUANLUISAYALA
 */
public class Usuario {
    public static void main(String[] args) {
        Punto Q = new Punto("Q",3,2);
        Punto M = new Punto("M",7,4);
        Punto P = new Punto("P",5,3);
        Punto N = new Punto("N",10,7);
        Punto X = new Punto("X",4,3);
        Punto O = new Punto("O",5,5);
        Rectangulo R1 = new Rectangulo("R1",Q,M);
        Rectangulo R2 = new Rectangulo(P,N);
        
        System.out.println(Q);
        System.out.println(Q.distancia(M));
        System.out.println(Q.distancia());
        System.out.println(Q.cuadrante());
        System.out.println(R1);
        System.out.println(R2);
        System.out.println(R1.union(R2));
       
        if(R1.estaAdentro(X))
            System.out.println("El punto "+ X + " esta denro de " + R1);
        else
            System.out.println("El punto "+ X + " no esta denro de " + R1);
        
        if(R1.estaAdentro(O))
            System.out.println("El punto "+ O + " esta denro de " + R1);
        else
            System.out.println("El punto "+ O + " no esta denro de " + R1);
        System.out.println(R1.calcularArea());
        System.out.println(R2.calcularArea());
        System.out.println(R1.comparar(R2));
        
           
    }
}
