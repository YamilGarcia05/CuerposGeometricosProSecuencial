import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Double Altura;
        Double Area,Volumen;

        Scanner lector=new Scanner(System.in);

        System.out.println("Ingrese la altura del cuerpo");
        Altura=lector.nextDouble();

        Area=2*(Altura*Altura)*1.17;
        Volumen=1.41/12*(Altura*Altura*Altura);

        System.out.println("El Area del cuerpo es :"+Area);
        System.out.println("El Volumen del cuerpo es :"+Volumen);


        
    }
}
