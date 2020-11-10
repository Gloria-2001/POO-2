import java.util.*;
import java.util.Scanner;
public class UserRacional{
    public static void main(String [] args){
        Racional A,B,RESP; //declarar variables de referencia
        int valorEntero = (int)(Math.random()*(99-10+1)+10); 
        int valorEntero1 = (int)(Math.random()*(99-10+1)+10);
        int valorEntero2 = (int)(Math.random()*(99-10+1)+10);
        int valorEntero3 = (int)(Math.random()*(99-10+1)+10);
        int den;
        int num;        
//crear objeto con operador new. Asignamos respectivas referencias (A,B)
        A=new Racional(valorEntero,valorEntero1);
        B=new Racional(valorEntero2,valorEntero3);
        Scanner sc = new Scanner(System.in); 
       
        System.out.println("Las fracciones son: "); 
        A.imprimir();
        B.imprimir();

        switch(A.menu()){
            case 1:
                do{
                System.out.println("Introduce el valor de la suma de tu numerador");
                num=sc.nextInt();
                System.out.println("Introduce el valor de la suma de tu denominador");
                den=sc.nextInt();
                RESP=new Racional(num,den); 
               
                }
                while( RESP.comparar(A.sum(A,B)));
                A.sum(A,B).imprimir();
                A.sum(A,B).simplificar().imprimir();
            break;
            case 2:
                do{
                System.out.println("Introduce el valor de la resta de tu numerador");
                num=sc.nextInt();
                System.out.println("Introduce el valor de la resta de tu denominador");
                den=sc.nextInt();
                RESP=new Racional(num,den); 
               
                }
                while( RESP.comparar(A.rest(A,B)));
                A.rest(A,B).imprimir();
                A.rest(A,B).simplificar().imprimir();
            break;
            case 3:
                do{
                System.out.println("Introduce el valor de la multiplicacion de tu numerador");
                num=sc.nextInt();
                System.out.println("Introduce el valor de la multiplicacion de tu denominador");
                den=sc.nextInt();
                RESP=new Racional(num,den); 
               
                }
                while( RESP.comparar(A.mult(A,B)));
                A.mult(A,B).imprimir();
                A.mult(A,B).simplificar().imprimir();
            break;
            case 4:
               do{
                System.out.println("Introduce el valor de la division de tu numerador");
                num=sc.nextInt();
                System.out.println("Introduce el valor de la division de tu denominador");
                den=sc.nextInt();
                RESP=new Racional(num,den); 
               
                }
                while( RESP.comparar(A.div(A,B)));
                A.div(A,B).imprimir();
                A.div(A,B).simplificar().imprimir();
            break;
        }
    }
}