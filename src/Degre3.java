import java.util.Scanner;

 class Degre3 {
     public static Scanner scanner = new Scanner(System.in);
     public static void main (String [] args){
         double a0 = 0.0;
         double a1 = 0.0;
         double a2 = 0.0;
         System.out.println("Entrez la valeur a0 : ");
         a0 = scanner.nextDouble();
         System.out.println("Entrez la valeur a1 : ");
         a1 = scanner.nextDouble();
         System.out.println("Entrez la valeur a2 : ");
         a2 = scanner.nextDouble();
         double aa2 = a2 * a2;
         double Q = (3 * a1 - a2 * a2) / 9;
         double R = (9 * a1 * a2 - 27 * a0 - 2 * aa2 * a2) / 54;
         double D = Q * Q * Q + R * R;
         System.out.println("D:" + D);
         double z1 = 0.0;
         double z2 = 0.0;
         double z3 = 0.0;
         if (D < 0){
             double theta = Math.acos( R / Math.sqrt(-Q * Q * Q));
             z1 = 2 * Math.sqrt(-Q) * Math.cos(theta / 3) - a2 / 3;
             z2 = 2 * Math.sqrt(-Q) * Math.cos((theta + 2 * Math.PI ) / 3) - a2 / 3;
             z3 = 2 * Math.sqrt(-Q) * Math.cos((theta + 4 * Math.PI ) / 3) - a2 / 3;
             System.out.println("theta : " + theta + "\n" + "z1 : " + z1 + "\n" + "z2 : " + z2 + "\n" + "z3 : " + z3);
         }else {
             double S = R + Math.sqrt(D);
             if ( S < 0.0 ) { S = -Math.pow(-S, 1.0 / 3.0); }
             else if (S > 0.0){ S = Math.pow(S, 1.0 / 3.0); }
             double T = R - Math.sqrt(D);
             if ( T < 0.0 ) { T = -Math.pow(-T, 1.0 / 3.0); }
             else if (T > 0.0){ S = Math.pow(T, 1.0 / 3.0); }
            // System.out.println("T : " + T + " S : " + S);
             //System.out.println("S : " + S + "\n" + "T : " + T);
             z1 = S + T - a2 / 3;
             if ( D == 0 && (S + T) != 0){
                 z2 = - (S + T) / 2 -a2 / 3;
                 System.out.println("z1 : " + z1 + "\n" + "z2 : " + z2);
             }else {
                 System.out.println("z1 : " + z1);
             }
         }

     }
 }
