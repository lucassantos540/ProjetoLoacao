import javax.swing.JOptionPane;

public class Locacao {
    public String cliente;
    public String veiculo;
    public int numDeDias;
    public double valorDiaria;
    public double qtdKm;
    public int idade;
    
    public void cadastrar()
    {
        this.cliente = JOptionPane.showInputDialog("Nome do cliente: ");
        this.veiculo = JOptionPane.showInputDialog("Nome do veículo: ");
        this.idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
        this.numDeDias = Integer.parseInt(JOptionPane.showInputDialog("Número de dias: "));
        this.valorDiaria = Double.parseDouble(JOptionPane.showInputDialog("Valor da diária: "));
        this.qtdKm = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de kilômetros rodados: "));
    }
    
    public void exibir()
    {
        JOptionPane.showMessageDialog(null, "Cliente: " + cliente + 
                                                        "\nVeículo: " + veiculo + 
                                                        "\nNúmero de dias: " + numDeDias + 
                                                        "\nValor da diária: " + valorDiaria +
                                                        "\nQuantidade de kilômetros rodados: " + qtdKm);
    }
    
    public double calcularAluguel(double vlKm)
    {
        double vt = (this.numDeDias * this.valorDiaria) + (this.qtdKm * vlKm);
        JOptionPane.showMessageDialog(null, "O valor total é de: " + vt);
        return vt;
    }
    
    public void calcularDesconto(double valorTotal)
    {
        if(this.idade >= 70)
        {
            double desconto = valorTotal * 0.2;
            valorTotal = valorTotal - desconto;
            JOptionPane.showMessageDialog(null, "Com o desconto de 20%, o valor total é: " + valorTotal);
        }else{
            JOptionPane.showMessageDialog(null, "Não há desconto, pois não tem 70 anos!");
            JOptionPane.showMessageDialog(null, "O valor total é: " + valorTotal);
        }
    }
}
