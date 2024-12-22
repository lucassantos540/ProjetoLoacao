import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Locacao loc = new Locacao();
        
        double vt = 0;
        
        int op = 0;
        String info = "1-Cadastrar\n2-Exibir\n3-Calcular Aluguel\n4-Calcular Desconto\n0-Sair";
        do {            
            op = Integer.parseInt(JOptionPane.showInputDialog(info));
            switch(op){
                case 1:
                    loc.cadastrar();
                    break;
                case 2:
                    loc.exibir();
                    break;
                case 3:
                    double vlKm = Double.parseDouble(JOptionPane.showInputDialog("Valor do kilômetro: "));
                    vt = loc.calcularAluguel(vlKm);
                    break;
                case 4:
                    loc.calcularDesconto(vt);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Encerrando...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida...");
                    break;
            }
            
        } while (op != 0);
    }
        
}

