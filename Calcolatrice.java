class Calcolatrice {
    
    public static double calcola(double numero1, double numero2, String operazione) {
        double risultato = 0;
        switch (operazione) {
            case "+":
                risultato = numero1 + numero2;
                break;
            case "-":
                risultato = numero1 - numero2;
                break;
            case "*":
                risultato = numero1 * numero2;
                break;
            case "/":
                // Se il secondo numero non è zero, esegui la divisione
                if (numero2 != 0) {
                    risultato = numero1 / numero2;
                } else {
                    risultato = Double.NaN; // Restituisce un valore speciale per indicare una divisione per zero
                }
                break;
            default:
                System.out.println("Operazione non valida!");
        }
        return risultato;
    }
}