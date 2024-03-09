
package larievini;
import javax.swing.JOptionPane;
public class LarieVini {

    public static void main(String[] args) {
        String resp;
        int idade;
        
        resp = JOptionPane.showInputDialog("digite sua idade");
        idade = Integer.parseInt(resp);
        System.out.println("voce tem " +idade+" anos e ano que vem tera " +(idade+1)+" anos");
              
        
    }
    
}
