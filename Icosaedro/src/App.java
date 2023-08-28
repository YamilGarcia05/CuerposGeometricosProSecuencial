import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Double altura;
        Double Area,Volumen;

        Scanner lector=new Scanner(System.in);

        System.out.println("Ingrese una altura");
        altura=lector.nextDouble();

        Area=5*(altura*altura)*1.17;
        Volumen=5/12*5.23*altura*altura*altura;

        System.out.println("El Area del cuerpo es :"+Area);
        System.out.println("El Volumen del cuerpo es :"+Volumen);
    }
}    
