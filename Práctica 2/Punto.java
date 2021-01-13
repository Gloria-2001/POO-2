public class Punto{
    private int x; //coordenada x
    private int y; //coordenada y
    private String nombrePunto; //nombre que se le dara al punto

    //Constructores 
    public Punto(){
        nombrePunto="";
        x=y=0;
    }

    public Punto(String np,int x){
        nombrePunto=np;
        this.x=x;
    }

    public Punto(String np,int x,int y){
        nombrePunto=np;
        this.x=x;
        this.y=y;
    }

    public Punto(int x,int y){
        this.x=x;
        this.y=y;
    }

    //Getters
    public String getName(){
        return nombrePunto;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y; 
    }

    //Devuelve una impresion del nombre del pto junto con las coordenadas
    public String toString(){
        return nombrePunto+"("+x+","+y+")";
    }

    //Distancia de un pto al origen
    public double distancia(){
        double dis=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return dis; 
    }

    //Distancia entre 2 ptos
    public double distancia(Punto P){
        int xP=P.getX();
        int yP=P.getY();
        double dis=Math.sqrt(Math.pow(xP-x,2)+Math.pow(yP-y,2));
        return dis;
    }

    //Indica el No. de cuadrante
    public void cuadrante(){
        if(x>0 && y>0){
            System.out.println("El punto está en el primer cuadrante");
        }else if(x<0 && y>0){
            System.out.println("El punto está en el segundo cuadrante");
        }else if(x<0 && y<0){
            System.out.println("El punto está en el tercer cuadrante");
        }else if(x>0 && y<0){
            System.out.println("El punto está en el cuarto cuadrante");
        }
    }
}