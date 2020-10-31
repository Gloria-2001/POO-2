public class UserRacional{
    public static void main(String [] args){
        Racional A,B; //declarar variables de referencia
        //crear objeto con operador new. Asignamos respectivas referencias (A,B,C)
        A=new Racional(1,2);
        B=new Racional(3,4);
        Racional C=new Racional(2,3);

        A.imprimir();
        B.imprimir();
        C.imprimir();
        
        A.mult(B);
        System.out.print("Multiplicacion:");
        A.imprimir();

        B.mult(A,C);
        System.out.print("Multiplicacion sobrecarga de metodos:");
        B.imprimir();

        A.mult(1,2);
        System.out.print("Multiplicacion entero:");
        A.imprimir();

        A.mult(B.mult(C));
        System.out.println("multiplicacion metodos:");
        A.imprimir();

        A.div(B);
        System.out.print("Division:");
        A.imprimir();

        B.div(A,C);
        System.out.print("Division sobrecarga");
        B.imprimir();

        C.div(3,4);
        System.out.print("Division entero");

        A.div(B.div(C));
        System.out.print("Division metodos");
        A.imprimir();

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
    }
}