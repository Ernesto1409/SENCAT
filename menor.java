import java.util.Scanner;
public class menor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int numero = sc.nextInt();
        if (numero>=100 && numero<=999) {
            int centena = numero/100;
            int variable1 = centena*100;
            int variable2 = numero-variable1;
            int decena = variable2/10;
            int unidad = variable2%10;
            System.out.println("Centena es: "+ centena);
            System.out.println("Decena es: "+ decena);
            System.out.println("Unidad es: "+ unidad);



        }
        int i = sc.nextInt();
       
        for(i = 0;numero>100; i++){
            if (numero<100){    
            int centena1 = numero-100;
                i = i+1;
                System.out.println("Centena es: "+ centena1);
            
            

            }
            sc.close();

        }
        

    }
}