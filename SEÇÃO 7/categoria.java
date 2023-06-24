public class categoria {
    String nome;
    int TiquetesObr;
    int qtdDisponivel;

    public categoria(String nome, int TiquetesObr, int qtdDisponivel){
        this.nome = nome;
        this.TiquetesObr = TiquetesObr;
        this.qtdDisponivel = qtdDisponivel;
    }
public String getNome() {
    return nome;
}
public int getQtdDisponivel() {
    return qtdDisponivel;
}
public int getTiquetesObr() {
    return TiquetesObr;
}
public void setNome(String nome) {
    this.nome = nome;
}
public void setQtdDisponivel(int qtdDisponivel) {
    this.qtdDisponivel = qtdDisponivel;
}
public void setTiquetesObr(int tiquetesObr) {
    TiquetesObr = tiquetesObr;
}
public void TrocarPremio(cartoes cartoes){
    if (cartoes.getSaldoTiquetes() >= TiquetesObr){
        if (qtdDisponivel > 0){
            cartoes.debitarTiquetes(TiquetesObr);
            qtdDisponivel--;
            System.out.println("Cartão " + cartoes.getNumeroCartao()+ TiquetesObr + " Tiquetes por um premio " + nome);
            System.out.println("Resta quantidade de premios " + nome + " : "+ qtdDisponivel);
        }
            else{
            System.out.println("Sem premios disponiveis");
        }
    } 
    else {
        System.out.println("Tiquetes insuficiente para trocar.");
    }
        }
    }