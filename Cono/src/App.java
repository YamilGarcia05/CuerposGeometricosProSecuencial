import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       double Areabase,Gerenatris,perimetro,altura;
       double Arealateral,Areatotal,volumen;

       Scanner lector= new Scanner(System.in);

       System.out.println("Ingrese el Area base del cuerpo");
       Areabase= lector.nextDouble();
       System.out.println("Ingrese el Gerenatris del cuerpo ");
       Gerenatris=lector.nextDouble();
       System.out.println("Ingrese el perimetro del cuerpo");
       perimetro=lector.nextDouble();
       System.out.println("Ingrese la altura del cuerpo");
       altura=lector.nextDouble();

       Arealateral=perimetro*(Gerenatris/2);
       Areatotal=Arealateral+Areabase;
       volumen=Areabase*altura;

       System.out.println("El Area lateral es:"+Arealateral);
       System.out.println("El Area total es :"+Areatotal);
       System.out.println("Ël volumen es :"+volumen);


    }
}


