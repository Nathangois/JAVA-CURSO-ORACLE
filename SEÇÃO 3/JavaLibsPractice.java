import javax.swing.JOptionPane;

public class JavaLibsPractice {

public static void main(String[] args) {
    String CPF = (String) JOptionPane.showInputDialog(null, "Vamos calcular seu imposto, me informe o CPF para iniciamos","JavaLibsPractice",2,null,null,"Digite seu CPF aqui");
    String nome = (String) JOptionPane.showInputDialog(null, "Qual é o seu nome?","JavaLibsPractice",2,null,null,"Digite seu nome aqui");
    String sobrenome = (String) JOptionPane.showInputDialog(null, "Qual é o seu sobrenome?","JavaLibsPractice",2,null,null,"Digite seu nome sobrenome aqui.");
    String cidade = (String) JOptionPane.showInputDialog(null, "Qual é o seu cidade?","JavaLibsPractice",2,null,null,"Digite o nome da sua cidade aqui");
    String estado = (String) JOptionPane.showInputDialog(null, "Qual é o seu estado?","JavaLibsPractice",2,null,null,"Digite o nome do estado aqui");
    String cep = (String) JOptionPane.showInputDialog(null, "Qual é o seu cep?","JavaLibsPractice",2,null,null,"Digite o cep aqui");
    String idade = (String) JOptionPane.showInputDialog(null, "Qual é a sua idade","JavaLibsPractice",2,null,null,"Digite a sua idade aqui");
    JOptionPane.showMessageDialog(null, "O imposto do cliente " + nome + " " + sobrenome + "com o CPF " +CPF+"com idade de " +idade+ " que reside " + cidade + "-" + estado +","+ cep + " clique ok para seguimos", "Resumo do Cliente", 0);

    String telefone = (String) JOptionPane.showInputDialog(null, "Qual é o seu telefone","JavaLibsPractice",2,null,null,"Digite o telefone aqui");
    JOptionPane.showMessageDialog(null, "O seu telefone é " + telefone + " Clique ok para prosseguimos.");
   
    String qtdMesesRecebido = (String) JOptionPane.showInputDialog(null, "Qual é a quantidade Meses que trabalhou?","JavaLibsPractice",2,null,null,"Digite aqui");
    int mesesqRecebeu = Integer.parseInt(qtdMesesRecebido);
    int diferenAno = ((13 - mesesqRecebeu));
    JOptionPane.showMessageDialog(null, "Voce trabalhou em " + mesesqRecebeu + " e não trabalhou " + diferenAno + " Clique ok para prosseguimos.");
   
    String salario = (String) JOptionPane.showInputDialog(null, "Qual é o valor do salário mensal que voce recebe?","JavaLibsPractice",2,null,null,"Digite o valor aqui");
    double salariomensal = Double.parseDouble(salario);
    JOptionPane.showMessageDialog(null, "Voce recebe mensal o salario de " +salariomensal+ "Clique ok para prosseguimos.");
    
    double imposto = (0.02*(salariomensal * mesesqRecebeu));
    JOptionPane.showMessageDialog(null, "Voce pagará 2% de imposto este ano que é o valor resutante de R$"+ imposto + ".Deverá pagar no prazo de 30 dias corridos.");
} 
}