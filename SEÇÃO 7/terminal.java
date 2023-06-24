public class terminal{
        private cartoes leitorcartoes;
        private categoria categoriaPremio1;
        private categoria categoriaPremio2;
        private categoria categoriaPremio3;
    
        public terminal(categoria categoriaPremio1, categoria categoriaPremio2, categoria categoriaPremio3){
            this.categoriaPremio1 = categoriaPremio1;
            this.categoriaPremio2 = categoriaPremio2;
            this.categoriaPremio3 = categoriaPremio3;
        }
    public void incluirCartao(cartoes cartoes){
        this.leitorcartoes = cartoes;
        System.out.println("Cartão " + cartoes.getNumeroCartao() + "inserido");
    }
    public void carregarCredito(int valor){
        if(leitorcartoes != null){
            leitorcartoes.adicionarCredito(valor);
        }
        else{
            System.out.println(" Nenhum cartão inserido.");
        }
    }
    
    }