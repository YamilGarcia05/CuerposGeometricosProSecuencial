import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        double altura,Radiodelaesfera,radio;
        double Volumen,Area;

         Scanner lector= new Scanner(System.in);

         System.out.println("Ingrese la altura del cuerpo esferico");
         altura=lector.nextDouble();
         System.out.println("Ingrese el radio de la esfera");
         Radiodelaesfera=lector.nextDouble();
         System.out.println("Ingrese el radio");
         radio=lector.nextDouble();

         Area=(2*3.14)*(Radiodelaesfera*altura);
         Volumen=(3.14*altura)*(3*Radiodelaesfera-altura)/3;

         System.out.println("El area es:"+Area);
         System.out.println("El volumen es:"+Volumen);
    }
}
