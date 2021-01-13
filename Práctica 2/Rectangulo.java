import java.util.*;

public class Rectangulo{
    private Punto a; //esquina inf izq
    private Punto b; //esquina sup der 
    private String nombreRect; //nombre que se le dara al rectangulo

    //Constructores 
    public Rectangulo(){
        nombreRect="";
        a=new Punto();
        b=new Punto();
    }

    public Rectangulo(String nR){
        nombreRect=nR;
        a=new Punto();
        b=new Punto();
    }

    public Rectangulo(String nR,Punto a,Punto b){
        nombreRect=nR;
        this.a=a;
        this.b=b;
    }

    public Rectangulo(Rectangulo R){
        a=R.getPoint1();
        b=R.getPoint2();
        nombreRect=R.getName();
    }

    //Getters
    public String getName(){
        return nombreRect;
    }

    public Punto getPoint1(){
        return a;
    }

    public Punto getPoint2(){
        return b;
    }
}