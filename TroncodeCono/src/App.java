import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Double generatris,Radiomayor,Areabase,Areamayor,radio,altura;
        Double Arealateral,Volumen,Areatotal;

        Scanner lector=new Scanner(System.in);

        System.out.println("Ingrese una generatris");   
        generatris=lector.nextDouble();
        System.out.println("Ingrese un Radiomayor");
        Radiomayor=lector.nextDouble();
        System.out.println("Ingrese un Areabase");
        Areabase=lector.nextDouble();
        System.out.println("Ingrese un Areamayor");
        Areamayor=lector.nextDouble();
        System.out.println("Ingrese el radio");
        radio=lector.nextDouble();
        System.out.println("Ingrese una altura");
        altura=lector.nextDouble();

        Arealateral=3.14*generatris*(Radiomayor+radio);
        Areatotal=Arealateral+Areabase+Areamayor;
        Volumen=1/3*3.14*altura*(Radiomayor*Radiomayor)+(radio*radio+Radiomayor*radio);

        System.out.println("El Area lateral es:"+Arealateral);
        System.out.println("El Area total es:"+Areatotal);
        System.out.println("El Volumen es:"+Volumen);


        
    }
}
