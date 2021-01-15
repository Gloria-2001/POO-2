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

    public class Punto {
    
    private String nombre;
    private int x;
    private int y;
/********************************Constructores********************/
    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Punto(Punto p){
        this.nombre = p.nombre;
        this.x = p.x;
        this.y = p.y;
    }
    public Punto(String nombre, int x, int y) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
    }
   /***********************************Metodos*****************/
    public String toString(){
        return this.nombre + "(" + this.getX() + "," + this.getY() + ")";
    }
    
    public double  distancia(Punto p){
        return Math.sqrt(Math.pow(p.getX()-this.getX(), 2.0)+Math.pow(p.getY()-this.y, 2.0));
    }
    
    public double distancia(){
        return Math.sqrt(Math.pow(this.getX(),2.0)+Math.pow(this.getY(), 2.0));
    }
    
    public int cuadrante(){
        if(this.getX()>0 && this.getY()>0){
            return 1;
        }
        else if(this.getX()>0 && this.getY()<0){
            return 4;
        }
        else if(this.getX()<0 && this.getY()>0){
            return 2;
        }
        else if(this.getX()<0 && this.getY()<0){
            return 3;
        }
        return 0;
        
    }
    
/*************************Getters y Setters*****************************************/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
    
    
}


