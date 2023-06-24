import java.util.Random;
public class jogo{
   private String nome;
   private int creditorequeridos;

   public jogo(String nome, int creditorequeridos) {
    this.nome = nome;
    this.creditorequeridos= creditorequeridos;
   }

   public String getNome() {
       return nome;
   }
   public int getCreditorequeridos() {
       return creditorequeridos;
   }
   public void setNome(String nome) {
       this.nome = nome;
   }
   public void setCreditorequeridos(int creditorequeridos) {
       this.creditorequeridos = creditorequeridos;
   }


private int gerarNumeroTiquetes(){
   Random random = new Random();
   return random.nextInt(100) + 1;
}

public void jogar (cartoes cartoes){
   if (cartoes.getSaldoCartaoCredito() >= creditorequeridos){
      cartoes.debitarCredito(creditorequeridos);
      int gerarTiquetes = gerarNumeroTiquetes();
      cartoes.addTiquetes(gerarTiquetes);
      System.out.println("Cartão " + cartoes.getNumeroCartao() + " jogou " + nome);
      System.out.println("Ganhou tiquets " + gerarTiquetes);
      System.out.println("Saldo atual de Tiquetes no cartão " + cartoes.getNumeroCartao() + " é de " + cartoes.getSaldoTiquetes());
}
else{
   System.out.println("CRÉDITO INSUFICIENTES  PAR A JOGAR.");
}
}
}