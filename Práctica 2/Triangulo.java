public class Triangulo{
    private Punto a;
    private Punto b;
    private Punto c;
    private String nombreTri;

    //Constructores
    public Triangulo(){
        nombreTri="";
        a=new Punto();
        b=new Punto();
        c=new Punto();
    }

    public Triangulo(String nT,Punto a,Punto b,Punto c){
        nombreTri=nT;
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public Triangulo(String nT,int x1,int y1,int x2,int y2,int x3,int y3){
        nombreTri=nT;
        a=new Punto(x1,y1);
        b=new Punto(x2,y2);
        c=new Punto(x3,y3);
    }

    //Getters
    public String getName(){
        return nombreTri;
    }

    public Punto getPoint1(){
        return a;
    }

    public Punto getPoint2(){
        return b;
    }

    public Punto getPoint3(){
        return c;
    }

    //Devuelve una impresion del nombre del triangulo junto con sus ptos
    public String toString(){
        return nombreTri+": ["+a.toString()+","+b.toString()+","+c.toString()+"]";
    }

    //Compara areas de triangulos
    public void comparar(Triangulo t){
        double aT=t.area();
        Triangulo t1 = new Triangulo();
        double aT1=t1.area();
        if(aT1==aT){
            System.out.println("0");
        }else if(aT1<aT){
            System.out.println("-1");
        }else if(aT1>aT){
            System.out.println("1");
        }
    }


}