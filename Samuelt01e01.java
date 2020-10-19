import java.util.Scanner;

public class Samuelt01e01 {

    public static void main(String[] args) {
        double euro, dolar;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Dame un valor en euros: ");
        euro = teclado.nextDouble();
        
        dolar = euro * 1.14;
        
        System.out.println("La cantidad en dolares es de: " + dolar);
    }
    
}
