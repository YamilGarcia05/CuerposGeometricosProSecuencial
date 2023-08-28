import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Double apotema,Areabase,Areamayor,altura,perimetrobase,perimetromayor;
        Double Arealateral,Volumen,Areatotal;

        Scanner lector=new Scanner(System.in);

        System.out.println("Ingrese un perimetrobase");   
        perimetrobase=lector.nextDouble();
        System.out.println("Ingrese un perimetromayor");
        perimetromayor=lector.nextDouble();
        System.out.println("Ingrese un Areabase");
        Areabase=lector.nextDouble();
        System.out.println("Ingrese un Areamayor");
        Areamayor=lector.nextDouble();
        System.out.println("Ingrese el apotema");
        apotema=lector.nextDouble();
        System.out.println("Ingrese una altura");
        altura=lector.nextDouble();

        Arealateral=perimetrobase+perimetromayor/2*apotema;
        Areatotal=Arealateral+Areabase+Areamayor;
        Volumen=1/3*altura*(Areabase+Areamayor)+ (Areabase+Areamayor)*(Areabase+Areamayor);

        System.out.println("El Area lateral es:"+Arealateral);
        System.out.println("El Area total es:"+Areatotal);
        System.out.println("El Volumen es:"+Volumen);

    }
}
