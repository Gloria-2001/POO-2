public class Main{
   public static void main( String[] args ){
       Punto Q=new Punto("Q",3,2);
       Punto Q1=new Punto("Q1",7,4);
       Punto P=new Punto("P",5,3);
       Punto P1=new Punto("P1",10,7);
       Rectangulo R1=new Rectangulo("R1",Q,Q1);
       Rectangulo R2=new Rectangulo("R2",P,P1);
       //Rectangulo I = R1.interseccion(R2);
       //System.out.println(I.toString());
       R1.comparar(R2);
   }
}