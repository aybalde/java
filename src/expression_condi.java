import java.util.Scanner;
class expression_condi {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args){
        double a = 0;
        System.out.println("Entrez un nombre décimal : ");
        a = scanner.nextDouble();
        if ((a >= 2 && a <3) || (a > 0 && a <= 1) || (a >= -10 && a <= -2)){
            System.out.println("a appartient à I");
        }
        else System.out.println("a n'appartient pas à I");
    }
}
