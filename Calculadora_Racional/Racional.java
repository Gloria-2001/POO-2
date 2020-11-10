import java.util.Scanner;

public class Racional {
 //Campos   
   private int num;       // private significa que el usuario de la clase no tiene acceso
   private int den;
 //Constructores
  public Racional( ) {
         num = 1;
         den = 1;
   }
  public Racional(int n, int d) {
          num = n;
           if(d==0)
                den = 1;  //Encapsulamiento: nos aseguramos que el denominador no sea 0
         else 
                den = d;
  }  
 // Métodos
   public void establecer(int num, int den) {
         this.num = num;  //Palabra reservada this se usa para referirnos al objeto
         if(den==0)
                den = 1;  //Encapsulamiento: nos aseguramos que el denominador no sea 0
         else 
                this.den = den;  
    } 
 public void imprimir(){
        System.out.println("["+ num +","+ den +"]");
    }

    public int menu(){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Por favor elija la operacion del siguiente menu:");
        System.out.println(" 1. Suma \n 2. Resta \n 3. Multiplicacion \n 4. Division");
        int opc=sc.nextInt();
        return opc;
    }

    public Racional sum(Racional X, Racional Y){
        Racional suma= new Racional();
        if(X.den==Y.den){
            suma.num=X.num+Y.num;
            suma.den=X.den;
        }else{
            suma.num=((X.num*Y.den)+(X.den*Y.num));
            suma.den=(X.den*Y.den);
        }
    return suma;
    }

    public Racional rest(Racional X, Racional Y){
        Racional resta= new Racional();
        if(X.den==Y.den){
            resta.num=X.num-Y.num;
            resta.den=X.den;
        }else{
            resta.num=((X.num*Y.den)-(X.den*Y.num));
            resta.den=(X.den*Y.den);
        }
    return resta;
    }
   

 public Racional mult(Racional X, Racional Y){
     Racional suma= new Racional();   
        suma.num=X.num*Y.num;
        suma.den=X.den*Y.den;
 return suma;   
 }
public Racional div(Racional X, Racional Y){
    Racional division= new Racional();    
        division.num=X.num*Y.den;
        division.den=X.den*Y.num;
 return division;   
}
 int mcd(){
     int x=Math.abs(num);
     int y=Math.abs(den);
     int i;
     while(y!=0){
          i=x%y;
          x=y;
          y=i;
     }
     return x;
  }
 public Racional simplificar(){
     int minimocomundivisor=mcd();
     Racional simpli= new Racional();
     simpli.num=this.num;//se toma el valor que se tiene y se reemplaza
     simpli.num/=minimocomundivisor;
     simpli.den=this.den;//se toma el valor que se tiene y se reemplaza
     simpli.den/=minimocomundivisor;
     return simpli;
  }
public boolean comparar1(Racional comparacion){ //compara directamente numerador y denominador de la operacion con el que mete el usuario
 if((this.num==comparacion.num) && (this.den==comparacion.den)){ 
     return true;
 }
 else{
 return false;
 }
}
public boolean comparar2(Racional comparacion){ // compara pero revisa que sea multiplo de la operacion para saber si se puede simplificar
 if(((comparacion.num%this.num)==0) && ((comparacion.den%this.den)==0)){ 
     return true;
 }
 else{
 return false;
 }
}

public boolean comparar(Racional operacion){
if(this.comparar2(operacion)){    //saber si es correcta la respuesta
      if(this.comparar1(operacion.simplificar())){
      System.out.println("La respuesta es correcta");
      }
      else{
       System.out.println("La respuesta es correcta pero falta simplificar");
      }
      return false; //retorna false por que en while si es falso ya no se continua con el programa
       }
else{      //saber si es incorrecta
    System.out.println("La respuesta no es correcta intentalo de nuevo");       
return true; //retorna true para que en el while continue con la operacion    
}
}
}