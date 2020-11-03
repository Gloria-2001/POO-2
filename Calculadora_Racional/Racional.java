import java.util.Scanner;

public class Racional{
    //campos
    private int num;
    private int den;
    public int opc;
    //constructores
    public Racional(){
        num=1;
        den=1;
    }
    public Racional(int n,int d){
        num=n;
        if(d==0)
            den=1; //encapsulamiento denominado dif. 0
        else
            den=d;
    }
    //metodos
    public void establecer(int num,int den){
        this.num=num;
        if(den==0)
            this.den=1;
        else 
            this.den=den;
    }
    public void imprimir(){
        System.out.println("["+ num +","+ den +"]");
    }

    public int menu(){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Por favor elija la operacion del siguiente menu:");
        System.out.println("1. Suma \n 2. Resta \n 3. Multiplicacion \n 4. Division");
        int opc=sc.nextInt();
        return opc;
    }

    public void sum(Racional X, Racional Y){
        if(X.den==Y.den){
            num=X.num+Y.num;
            den=X.den;
        }else{
            num=((X.num*Y.den)+(X.den*Y.num));
            den=(X.den*Y.den);
        }
    }

    public void rest(Racional X, Racional Y){
        if(X.den==Y.den){
            num=X.num-Y.num;
            den=X.den;
        }else{
            num=((X.num*Y.den)-(X.den*Y.num));
            den=(X.den*Y.den);
        }
    }

    public void mult(Racional X, Racional Y){
        num=X.num*Y.num;
        den=X.den*Y.den;
    }

    public void div(Racional X,Racional Y){
        num=X.num*Y.den;
        den=X.den*Y.num;
    }
}