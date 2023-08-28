import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

     Double radio,numerodegrados;
     Double Area,Volumen;

     Scanner lector=new Scanner(System.in);

     System.out.println("Ingrese el radio ");
     radio=lector.nextDouble();
     System.out.println("Ingrese numero de grados");
     numerodegrados=lector.nextDouble();

     Area=(4*3.14)*(radio*radio)*numerodegrados/360;
     Volumen=4/3*(radio*radio*radio)*numerodegrados/360;

     System.out.println("El Area es:"+Area);
     System.out.println("El Volumen es:"+Volumen);
     
     
        
    }
}
