
package consultadenome;

import java.util.Scanner;

/**
 *
 * @author silva
 */
public class Consultadenome {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Informe a quantidade de nomes: ");
            int x = s.nextInt();
            while (x < 0) {
                System.out.println("Informe um numero maior do que zero:");
                x = s.nextInt();
            }

            String pessoa[] = new String[x];
            for (int i = 0; i < x; i++) {
                System.out.println("Informe o nome da pessoa: ");
                pessoa[i] = s.next();
            }
            System.out.println("Informe a posição do nome que deseja encontrar: ");
            int y = s.nextInt();
            while (y < 0 || y > x) {
                System.out.println("informe um numero entre 1 e " + x);
                y = s.nextInt();
            }
            System.out.println("nome encotrado\nNome: " + pessoa[y - 1]);
        }
    }

