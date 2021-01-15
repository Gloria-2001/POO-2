/*
    Instituto Politécnico Nacional 
    Escuela Superior de Cómputo 

    Autores: 
    Ayala Martínez Juan Luis 
    Olivares Ménez Gloria Oliva 

    Programación Orientada a Objetos

    Grupo: 2CM4
*/

public class Rectangulo {
    private String nombre;
    private Punto a;
    private Punto b;

    /***********************Constructores*******************/
    public Rectangulo() {
        this.nombre = "Incognito";
        this.a = new Punto(1,1);
        this.b = new Punto(2,2);
    }

    public Rectangulo(Punto a, Punto b) {
        this.nombre = "Rn";
        this.a = a;
        this.b = b;
    }

    public Rectangulo(String nombre, Punto a, Punto b) {
        this.nombre = nombre;
        this.a = a;
        this.b = b;
    }
    
    public Rectangulo(Rectangulo r) {
        this.nombre = r.getNombre();
        this.a = r.getA();
        this.b = r.getB();
    }

    public Rectangulo(String nombre) {
        this.nombre = nombre;
        this.a = new Punto(1,1);
        this.b = new Punto(2,2);
    }
    
     /***********************************Metodos*****************/
    
    public Rectangulo union(Rectangulo r){
        int x = this.getA().getX();
        int y = this.getA().getY();
        if(x<this.getB().getX()){
            if(x<r.getA().getX()){
                if(x>r.getB().getX()){
                    x=r.getB().getX();
                }
            }
            else{
                x=r.getA().getX();
                if(x>r.getB().getX()){
                    x=r.getB().getX();
                }
            }
        }
        else{
            x=this.getB().getX();
            if(x<r.getA().getX()){
                if(x>r.getB().getX()){
                    x=r.getB().getX();
                }
            }
            else{
                x=r.getA().getX();
                if(x>r.getB().getX()){
                    x=r.getB().getX();
                }
            }
        }
        if(y<this.getB().getY()){
            if(y<r.getA().getY()){
                if(y>r.getB().getY()){
                    y=r.getB().getY();
                }
            }
            else{
                y=r.getA().getY();
                if(y>r.getB().getY()){
                    y=r.getB().getY();
                }
            }
        }
        else{
            y=this.getB().getY();
            if(y<r.getA().getY()){
                if(y>r.getB().getY()){
                    y=r.getB().getY();
                }
            }
            else{
                y=r.getA().getY();
                if(y>r.getB().getY()){
                    y=r.getB().getY();
                }
            }
        }
        
        Punto p1 = new Punto("A",x,y);
        
        x = this.getA().getX();
        y = this.getA().getY();
        if(x>this.getB().getX()){
            if(x>r.getA().getX()){
                if(x<r.getB().getX()){
                    x=r.getB().getX();
                }
            }
            else{
                x=r.getA().getX();
                if(x<r.getB().getX()){
                    x=r.getB().getX();
                }
            }
        }
        else{
            x=this.getB().getX();
            if(x>r.getA().getX()){
                if(x<r.getB().getX()){
                    x=r.getB().getX();
                }
            }
            else{
                x=r.getA().getX();
                if(x<r.getB().getX()){
                    x=r.getB().getX();
                }
            }
        }
        if(y>this.getB().getY()){
            if(y>r.getA().getY()){
                if(y<r.getB().getY()){
                    y=r.getB().getY();
                }
            }
            else{
                y=r.getA().getY();
                if(y<r.getB().getY()){
                    y=r.getB().getY();
                }
            }
        }
        else{
            y=this.getB().getY();
            if(y>r.getA().getY()){
                if(y<r.getB().getY()){
                    y=r.getB().getY();
                }
            }
            else{
                y=r.getA().getY();
                if(y<r.getB().getY()){
                    y=r.getB().getY();
                }
            }
        }
        Punto p2 = new Punto("B",x,y);
        Rectangulo rUnion = new Rectangulo("Union",p1,p2);
        return rUnion;
    }
    
    public String toString(){
        return this.getNombre() + ":[" + this.getA() + "," + this.getB() + "]";
        
    }
    
    public boolean estaAdentro(Punto p){
        if(p.getX()>=this.getA().getX() && p.getX()<=this.getB().getX() ){
            if(p.getY()>=this.getA().getY() && p.getY()<=this.getB().getY()){
                return true;
            }
        }
        return false;
    }
    
    public double calcularArea(){
        //Area calculada por Determinantes
        return Math.abs(((this.getA().getX()*this.getA().getY()+this.getB().getX()*this.getB().getY())-(this.getA().getX()*this.getB().getY()+this.getB().getX()*this.getA().getY())));
    }

    public int comparar(Rectangulo r){
        if(r.calcularArea() == this.calcularArea()){
            return 0;
        }
        else if (r.calcularArea() >= this.calcularArea()){
            return -1;
        }
        else{
            return 1;
        }
    }
    
    public int comparar(Triangulo t){
        if(t.calcularArea() == this.calcularArea()){
            return 0;
        }
        else if (t.calcularArea() >= this.calcularArea()){
            return -1;
        }
        else{
            return 1;
        }
    }
    
    public void moverRect(Punto a,Punto b){
        this.setA(a);
        this.setB(b);
    }

    public int cuadRect(){
        Punto supIzquierdo = new Punto(this.getA().getX(),this.getB().getY());
        return supIzquierdo.cuadrante();
    }
    
    public Rectangulo interseccion(Rectangulo r){
       Punto C = new Punto(r.getB().getX(),r.getA().getY());
       Punto D = new Punto(r.getA().getX(),r.getB().getY());
       if(this.estaAdentro(r.getA())){
           return new Rectangulo(r.getA(),this.getB());
       }
       else if(this.estaAdentro(r.getB())){
            return new Rectangulo(this.getA(),r.getB());
       }
       else if(this.estaAdentro(C)){
           Punto aux1= new Punto(this.getA().getX(),r.getA().getY());
           Punto aux2= new Punto(r.getA().getX(),this.getA().getY());
           return new Rectangulo(aux1,aux2);
       }
       else if(this.estaAdentro(D)){
           Punto aux1= new Punto(r.getA().getX(),this.getA().getY());
           Punto aux2= new Punto(this.getA().getX(),r.getA().getY());
           return new Rectangulo(aux1,aux2);
       }
       
       return null;
    }
    /**********************Setters y Getterrs***************/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Punto getA() {
        return a;
    }

    public void setA(Punto a) {
        this.a = a;
    }

    public Punto getB() {
        return b;
    }

    public void setB(Punto b) {
        this.b = b;
    }
    
}
