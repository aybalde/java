import java.util.Scanner;
    class formule {
        public static Scanner scanner = new Scanner(System.in);
        // variable test : -1, 0, 1, 2, 3, 8
        public static void main (String [] args){
            double x = 0.0;
            System.out.println("Entrez un nombre réel : ");
            x  = scanner.nextDouble();
            if (x != 0){
                double expo = 0.0;
                expo = x / (1- Math.exp(x));
                System.out.print("Calcul de l'exponentiel x / (1- Math.exp(x)) : ");
                System.out.println(expo);
            } else {
                System.out.println("Expression 1 : indefinie");
            }
            if (x > 0.0 && x != 1.0){
                    double log = 0.0;
                    log = x * Math.log(x) * Math.exp(2 / (x - 1));
                    System.out.print("Calcul du logarithme x * Math.log(x) * Math.exp(2 / (x - 1)) : ");
                    System.out.println(log);
            } else {
                System.out.println("Expression 2 : indefinie");
            }
            if (x <= 0.0 || x >= 8.0){
                    double fraction = 0.0;
                    fraction = (-x - Math.sqrt(x * x - 8 * x)) / (2 - x);
                    System.out.print("Calcul du fraction (-x - Math.sqrt(x * x - 8 * x)) / (2 - x) : ");
                    System.out.println(fraction);
                } else {
                    System.out.println("Expression 3 : indefinie");
            }

            if (x > 1 || x < 0.0){
                    double result= 0.0, square;
                    result = (Math.sin(x) - x / 20) * Math.log(Math.sqrt(x * x - 1 / x));
                    square = Math.sqrt(result);
                    if (result < 0.0) System.out.println("Expression 4 : indefinie");
                    else {
                        System.out.print("Calcul de la racine carrée Math.sqrt((Math.sin(x) - x / 20) * Math.log(Math.sqrt(x * x - 1 / x))) : ");
                        System.out.println(square);
                    }
            }
            else  {
                System.out.println("Expression 4 : indefinie");
            }

        }
}
