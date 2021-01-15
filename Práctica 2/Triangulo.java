/*
    Instituto Politécnico Nacional 
    Escuela Superior de Cómputo 

    Autores: 
    Ayala Martínez Juan Luis 
    Olivares Ménez Gloria Oliva 

    Programación Orientada a Objetos

    Grupo: 2CM4
*/
public class Triangulo {
    private String nombre;
    private Punto A;
    private Punto B;
    private Punto C;
/********************************Constructores************************/
    public Triangulo(){
        this.nombre = nombre;
        this.A = new Punto(3,4);
        this.B = new Punto(7,2);
        this.C = new Punto(1,1);
    }

    public Triangulo(String nombre) {
        this.nombre = nombre;
        this.A = new Punto(3,4);
        this.B = new Punto(7,2);
        this.C = new Punto(1,1);
    }
    
    public Triangulo(String nombre, Punto A, Punto B, Punto C) {
        this.nombre = nombre;
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public Triangulo(Punto A, Punto B, Punto C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    
    public Triangulo(Triangulo t){
        this.nombre = t.nombre;
        this.A = t.A;
        this.B = t.B;
        this.C = t.C;
    }
    /*****************************Metodos**********************************/
    public String toString(){
        return this.getNombre() + ":[" + this.getA() + "," + this.getB() + this.getC()+"]";
    }
    public double calcularArea(){
        //Area calculada por Determinantes
        return Math.abs(((this.getA().getX()*this.getB().getY()+this.getB().getX()*this.getC().getY()+this.getC().getX()*this.getA().getY())-(this.getA().getX()*this.getC().getY()+this.getC().getX()*this.getB().getY()+this.getB().getX()*this.A.getY()))/2);
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
    public void moverRect(Punto a,Punto b){
        this.setA(a);
        this.setB(b);
    }
    public void moverRect(Punto a,Punto b, Punto c){
        this.setA(a);
        this.setB(b);
        this.setC(c);
    }
    
    public boolean estaAdentro(Punto p){
        if(p.getX()>=this.getA().getX() && p.getX()<=this.getB().getX() || p.getX()>=this.getB().getX() && p.getX()<=this.getC().getX() || p.getX()>=this.getA().getX() && p.getX()<=this.getC().getX() ){
            if(p.getY()>=this.getA().getY() && p.getY()<=this.getB().getY() || p.getY()>=this.getB().getY() && p.getY()<=this.getC().getY() || p.getY()>=this.getA().getY() && p.getY()<=this.getC().getY()){
                return true;
            }
        }
        return false;
    }
    public int cuadRect(){
        return this.getC().cuadrante();
    }
    
    
    
    /*******************************Setters y Getters****************/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Punto getA() {
        return A;
    }

    public void setA(Punto A) {
        this.A = A;
    }

    public Punto getB() {
        return B;
    }

    public void setB(Punto B) {
        this.B = B;
    }

    public Punto getC() {
        return C;
    }

    public void setC(Punto C) {
        this.C = C;
    }
    
    
}
