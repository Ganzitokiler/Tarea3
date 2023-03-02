import java.util.Scanner;
public class TareaGato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena de 9 caracteres que contenga solo X, O y _ : ");
        String BOT = scanner.nextLine();

        if (BOT.length() != 9) {
            System.out.println("La cadena debe contener exactamente 9 caracteres.");
            return;
        }

        System.out.println("Cadena ingresada: " + BOT);


        System.out.println("Marco: ");
        System.out.println(" " + BOT.charAt(0) + " | " + BOT.charAt(1) + " | " + BOT.charAt(2) + " ");
        System.out.println("---|---|---");
        System.out.println(" " + BOT.charAt(3) + " | " + BOT.charAt(4) + " | " + BOT.charAt(5) + " ");
        System.out.println("---|---|---");
        System.out.println(" " + BOT.charAt(6) + " | " + BOT.charAt(7) + " | " + BOT.charAt(8) + " ");
    }

