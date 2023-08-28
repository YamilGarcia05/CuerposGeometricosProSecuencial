import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Double profundidad,altura,longitud;
        Double Area,Volumen;

       Scanner lector=new Scanner(System.in);

       System.out.println("Ingrese una longitud");
       longitud=lector.nextDouble();
       System.out.println("Ingrese una altura");
       altura=lector.nextDouble();
       System.out.println("ingrese una profundidad");
       profundidad=lector.nextDouble();

       Volumen=altura*profundidad*longitud;
       Area=2*(altura*longitud+altura*profundidad+longitud*profundidad);

       System.out.println("El volumen es :"+Volumen);
       System.out.println("El Area es :"+Area);


        
    }
}
