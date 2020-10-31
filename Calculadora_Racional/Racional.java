public class Racional{
    //campos
    private int num;
    private int den;
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
    public Racional mult(Racional X){
        num=num*X.num;
        den=den*X.den;
        return new Racional(num,den);
    }

    public void mult(Racional X, Racional Y){
        num=X.num*Y.num;
        den=X.den*Y.den;
    }

    public void mult(int a,int b){
        num=num*a;
        den=den*b;
    }

    public Racional div(Racional X){
        num=num*X.den;
        den=den*X.num;
        return this;
    }

    public void div(Racional X,Racional Y){
        num=X.num*Y.den;
        den=X.den*Y.num;
    }

    public void div(int a,int b){
        num=num*b;
        den=den*a;
    }
}