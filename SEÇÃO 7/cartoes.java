public class cartoes {
    private int saldoCartaoCredito;
    private int saldoTiquetes;
    private int numeroCartao;

    public cartoes(int numeroCartao){
        this.numeroCartao = numeroCartao;
        this.saldoCartaoCredito = 0;
        this.saldoTiquetes = 0;

    }


public int getSaldoCartaoCredito() {
    return saldoCartaoCredito;
}
public int getNumeroCartao() {
    return numeroCartao;
}
public int getSaldoTiquetes() {
    return saldoTiquetes;
}
public void setNumeroCartao(int numeroCartao) {
    this.numeroCartao = numeroCartao;
}
public void setSaldoCartaoCredito(int saldoCartaoCredito) {
    this.saldoCartaoCredito = saldoCartaoCredito;
}
public void setSaldoTiquetes(int saldoTiquetes) {
    this.saldoTiquetes = saldoTiquetes;
}


public void adicionarCredito(int valor){
    if(valor>=0){
        saldoCartaoCredito += valor;
        System.out.println("Créditos adicionado no cartão com "+  numeroCartao+ " no valor de " + valor);
        System.out.println("Saldo atual do cartão " + numeroCartao +  " com saldo de crédito " + saldoCartaoCredito);
    }
    else{
        System.out.println("Valor invalido para add créditos");
    }
}


public void debitarCredito(int valor){
    if(valor >= 0 && valor<= saldoCartaoCredito){
        saldoCartaoCredito -= valor;
        System.out.println("Créditos debitados do cartão " +numeroCartao+ " no " + valor);
        System.out.println("Saldo atual de crédito do cartão "+ numeroCartao + " é de " + saldoCartaoCredito);
    }
}

public void addTiquetes(int valor){
    if (valor >=0){
        saldoTiquetes += valor;
        System.out.println("Tiquetes add ao cartão " + numeroCartao + " com " + valor);
        System.out.println("Saldo atual de tiquetes do cartão do " + numeroCartao + " é de " + saldoTiquetes);
    }
}
public void debitarTiquetes(int valor) {
    if (valor >= 0 && valor <= saldoTiquetes) {
        saldoTiquetes -= valor;
        System.out.println("Tíquetes debitados do cartão " + numeroCartao + ": " + valor);
        System.out.println("Saldo atual de tíquetes do cartão " + numeroCartao + ": " + saldoTiquetes);
    } else {
        System.out.println("Saldo de tíquetes insuficiente no cartão " + numeroCartao);
    }
}
public void transferirCredito(cartoes transferido, int quantidade) {
    if (this.saldoCartaoCredito >= quantidade) {
        this.saldoCartaoCredito -= quantidade;
        transferido.adicionarCredito(quantidade);
        System.out.println("Transferencia realizada dos Creditos.");
    } else {
        System.out.println("Saldo de créditos insuficiente no cartão " + numeroCartao);
    }
}
public void transferirTiquetes(cartoes transferido, int quantidade) {
    if (this.saldoTiquetes >= quantidade) {
        this.saldoTiquetes -= quantidade;
        transferido.addTiquetes(quantidade);
        System.out.println("Transferencia realizadas do Tiquetes.");
    } else {
        System.out.println("Saldo de tíquetes insuficiente no cartão " + numeroCartao);
    }
}
}