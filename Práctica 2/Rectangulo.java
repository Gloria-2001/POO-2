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

    public Rectangulo(String nR,int x1,int y1,int x2,int y2){
        nombreRect=nR;
        a=new Punto(x1,y1);
        b=new Punto(x2,y2);
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

    //Devuelve un objeto Rectangulo que representa la intersección entre 2 rectangulos.
    public Rectangulo interseccion(Rectangulo R){
         List<Integer> x = new ArrayList<Integer>(
            Arrays.asList(a.getX(), b.getX(), R.getPoint1().getX(), R.getPoint2().getX())
        );
        List<Integer> y = new ArrayList<Integer>(
            Arrays.asList(a.getY(), b.getY(), R.getPoint1().getY(), R.getPoint2().getY())
        );
        Collections.sort(x);
        Collections.sort(y);
        return new Rectangulo("N",x.get(1),y.get(1),x.get(2),y.get(2));
    }

    //Devuelve una impresion del nombre del rectangulo junto con sus ptos
    public String toString(){
        return nombreRect+": ["+a.toString()+","+b.toString()+"]";
    }

    //Calcula area de rectangulo
    public int area(){
        int b0=b.getX();int b1=a.getX();
        int h0=b.getY();int h1=a.getY();
        int b=b0-b1;
        int h=h0-h1;
        return b*h; 
    }

    //Compara areas de rectangulos
    public void comparar(Rectangulo r){
        double aR=r.area();
        Rectangulo r1 = new Rectangulo();
        double aR1=r1.area();
        if(aR1==aR){
            System.out.println("0");
        }else if(aR1<aR){
            System.out.println("-1");
        }else if(aR1>aR){
            System.out.println("1");
        }
    }
}