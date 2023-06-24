public class teste {
    public static void main(String[] args) {
    System.out.println("Fliperama");
    System.out.println();
    
    cartoes cartoes1 = new cartoes(1);
    cartoes cartoes2 = new cartoes(2);
    
    cartoes1.adicionarCredito(50);
    cartoes2.adicionarCredito(60);

    jogo jogo1 = new jogo("jogo 1", 8);
    jogo jogo2 = new jogo("jogo 2", 2);

    categoria categoriaPremio1 = new categoria("Categoria 1", 5, 3);
    categoria categoriaPremio2 = new categoria("Categoria 2", 10, 2);
    categoria categoriaPremio3 = new categoria("Categoria 3", 8, 4);  
        terminal terminal = new terminal(categoriaPremio1, categoriaPremio2, categoriaPremio3);

    jogo1. jogar(cartoes1);
    jogo2. jogar(cartoes2);


    cartoes1.transferirCredito(cartoes2,cartoes1.getSaldoCartaoCredito());
    cartoes1.transferirTiquetes(cartoes2,cartoes1.getSaldoTiquetes());


    categoriaPremio1.TrocarPremio(cartoes2);
    categoriaPremio2.TrocarPremio(cartoes2);

    jogo1.jogar(cartoes1);
    categoriaPremio3.TrocarPremio(cartoes1);

    System.out.println("Saldo Atual do Cartão 1 é de créditos: " +cartoes1.getSaldoCartaoCredito() + "e de Tiquetes é "+ cartoes1.getSaldoTiquetes());
    System.out.println("Saldo Atual do Cartão 2 é de créditos: " +cartoes2.getSaldoCartaoCredito() + "e de Tiquetes é "+ cartoes2.getSaldoTiquetes());
    }
        
}