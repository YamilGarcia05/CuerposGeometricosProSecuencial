import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Double altura;
        Double Area,Volumen;

        Scanner lector=new Scanner(System.in);

        System.out.println("Ingrese una altura");
        altura=lector.nextDouble();

        Area=3*(altura*altura)*8.83;
        Volumen=(1/4*49.1)*(altura*altura*altura);

        System.out.println("El Area del cuerpo es :"+Area);
        System.out.println("El Volumen del cuerpo es :"+Volumen);
    }
}
