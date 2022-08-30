import java.util.Scanner;

class identificateur {
    private static Scanner scanner = new Scanner(System.in);
    public static void main (String [] args){
        int a = 0;
        System.out.println("Entrez un nombre entier : ");
        a = scanner.nextInt();
        if ( a == 0){
            System.out.println("Le nombre est zéro (et il est pair)");
        } else if ( a % 2 == 0) {
            if (a < 0){
                System.out.println("Le nombre est négatif et pair");
            }
            else System.out.println("Le nombre est positif et pair");
        }
        else{
            if (a < 0){
                System.out.println("Le nombre est négatif et impair");
            }
            else System.out.println("Le nombre est positif et impair");
        }
    }
}
