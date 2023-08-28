import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Double radio,area,volumen;

         Scanner lector= new Scanner(System.in);

         System.out.println("ingrese el radio de la esfera");
         radio=lector.nextDouble();

         area=(4*3.14)*(radio*radio);
         volumen=(4/3*3.14)*(radio*radio*radio);

         
         System.out.println("el area es:"+area);
         System.out.println("el volumen es:"+volumen);
         

    }
}
