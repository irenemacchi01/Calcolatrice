import java.util.Scanner;

public class CalcolatriceTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.print("Inserisci il primo numero: ");
            double numero1 = input.nextDouble();
            
            System.out.print("Inserisci il secondo numero: ");
            double numero2 = input.nextDouble();
            
            System.out.print("Scegli l'operazione (+, -, *, /) o inserisci 'q' per uscire: ");
            String operazione = input.next();
            
            if (operazione.equals("q")) {
                System.out.println("Grazie per aver utilizzato la calcolatrice!");
                break;
            }
            
            double risultato = Calcolatrice.calcola(numero1, numero2, operazione);
            if(Double.isNaN(risultato)){
                System.out.println("Errore: divisione per zero!");
            }else{
                System.out.println("Risultato: " + risultato);
            }
            System.out.println();
        }
        input.close();
    }
}