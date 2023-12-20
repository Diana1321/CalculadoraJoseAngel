
package Angel.mandujano;


import java.util.Scanner;
public class operaciones {
    public static void main(String[] args){
        Scanner pet = new Scanner(System.in);
        int opcion;
        int num1;
        int num2;
        int result;
        System.out.println("selecciona la operacion que deseas realizar");
        System.out.println("1:Suma");
        System.out.println("2:Resta");
        System.out.println("3:Multiplicacion");
        System.out.println("4:Division");
        opcion = pet.nextInt();
        System.out.println("ecribe el primer numero");
        num1 = pet.nextInt();
        System.out.println("ecribe el segundo numero");
        num2 =pet.nextInt();

        switch (opcion){
            case 1:
                result = num1 + num2;
                System.out.println("El resultado es" + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("El resultado es" + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("El resultado es" + result);
                break;
            case 4:
                result = num1 / num2;
                System.out.println("El resultado es" + result);
                break;

        }



    }
}