
package consultadetelefone;

import javax.swing.JOptionPane;

/**
 *
 * @author silva
 */
public class Consultadetelefone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        String a;
        String s = JOptionPane.showInputDialog("Informe a quantidade de telefone a serem cadastrados.");
        x = Integer.parseInt(s);
        while (x <= 0) {
            s = JOptionPane.showInputDialog("Por favor,informe um número maior que zero!");
            x = Integer.parseInt(s);
        }
        String NOME[] = new String[x];
        String TEL[] = new String[x];
        for (int i = 0; i < x; i++) {
            NOME[i] = JOptionPane.showInputDialog("Informe o nome da pessoa " + (i + 1) + ":");
            TEL[i] = JOptionPane.showInputDialog("Informe o número da pessoa " + (i + 1) + ":");
        }
        JOptionPane.showMessageDialog(null, "cadastramento feito com sucesso!");
        a = JOptionPane.showInputDialog("Informe o nome da pessoa para encontra o telefone desejado:");
        int y;
        for (y = 0; y < x; y++) {
            if (a.equals(NOME[y])) {
                JOptionPane.showMessageDialog(null, "Numero encontrado\nNome: " + NOME[y] + "\nTelefone: " + TEL[y]);
                break;
            }
        }
        if (y == x) {
            JOptionPane.showMessageDialog(null, "Nome inexistente no banco de dados.");
        }

    }
    
}
