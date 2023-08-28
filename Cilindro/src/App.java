import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        double Areabase,altura,perimetro;
        double Arealateral,Areatotal,volumen;

        Scanner lector= new Scanner(System.in);

        System.out.println("ingrese el altura del cuerpo");
        altura=lector.nextDouble();
        System.out.println("ingrese el perimetro del cuerpo");
        perimetro=lector.nextDouble();

        Arealateral=altura*perimetro;

        System.out.println("ingrese el area del cuerpo");
        Areabase=lector.nextDouble();

        Areatotal=Arealateral+(Areabase*2);

        volumen=Areabase*altura;

        System.out.println("El Area lateral es:"+Arealateral);
        System.out.println("El Area Total es:"+Areatotal);
        System.out.println("El volumen es:"+volumen);
    }
}
