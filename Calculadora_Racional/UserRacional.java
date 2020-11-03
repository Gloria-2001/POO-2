public class UserRacional{
    public static void main(String [] args){
        Racional A,B; //declarar variables de referencia
        Racional suma,resta;
        int valorEntero = (int)(Math.random()*(99-10+1)+10); 
        int valorEntero1 = (int)(Math.random()*(99-10+1)+10);
        int valorEntero2 = (int)(Math.random()*(99-10+1)+10);
        int valorEntero3 = (int)(Math.random()*(99-10+1)+10);
        //crear objeto con operador new. Asignamos respectivas referencias (A,B)
        A=new Racional(valorEntero,valorEntero1);
        B=new Racional(valorEntero2,valorEntero3);

        System.out.println("Las fracciones son: "); 
        A.imprimir();
        B.imprimir();

        switch(A.menu()){
            case 1:
                A.sum(A,B);
                A.imprimir(); 
                System.out.println("Ahora hagalo usted mismo!");
            break;
            case 2:
                A.rest(A,B);
                A.imprimir();
                System.out.println("Ahora hagalo usted mismo!");
            break;
        }
    }
}
               
      /*  B.mult(A,C);
        System.out.print("Multiplicacion sobrecarga de metodos:");
        B.imprimir();

        B.div(A,C);
        System.out.print("Division sobrecarga");
        B.imprimir();  */

        
/*
        System.out.println("++++++++++++++++++");

        System.out.println("Arreglos racionales");
        Racional [] grupoA = new Racional[3];
        grupoA[0]=new Racional();
        grupoA[1]=new Racional(3,2);
        grupoA[2]=new Racional(2,5);

        //Desplegar valores en pantalla
        for(int i=0; i<grupoA.length;i++)
            grupoA[i].imprimir();

        //Modificar valores 
        grupoA[0].establecer(3,3);
        grupoA[1].establecer(2,2);
        grupoA[2].establecer(1,1);

        System.out.println("Modificamos valores y usamos for-each");
        for(Racional var: grupoA)
            var.imprimir();

        System.out.println("Metodo equals");
        Racional R1 = new Racional(2,3);
        Racional R2 = new Racional(3,2);
        boolean r=R1.equals(R2);
        System.out.println("Primera prueba, el valor de r es: " + r);
        //modificamos R2 para que sea igual que R1
        R2.establecer(2,3);
        R1=R2;
        r=R1.equals(R2);
        System.out.println("Segunda prueba, el valor de r es: " + r);
    }*/
