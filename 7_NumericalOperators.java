// Definisci un metodo per la divisione di 2 numeri interi che restituisca il 
// quoziente che dovrà essere stampato.

public class Main {
    public static void main(String args[]) {
    int first = 1;
    int second = 3;
    
    System.out.println("Risultato divisione = " + div (first, second) );
    
    }
    
    
    public static double div (int a, int b) {
    double quoz = (double)a / (double)b;
    return quoz;
  }
    
}

