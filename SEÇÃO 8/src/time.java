public class time {
    private String nome;
    private int vitorias;
    private int derrotas;
    private int empates;
    private int golsMarcados;
    private int golsSofridos;

public time(String nome){
    this.nome = nome;
    this.vitorias = 0;
    this.derrotas = 0;
    this.empates = 0;
    this.golsMarcados = 0;
    this.golsSofridos = 0;
}

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    
    public void registrarVitoria() {
        vitorias++;
    }

    public void registrarDerrota() {
        derrotas++;
    }

    public void registrarEmpate() {
        empates++;
    }

    public void registrarGolsMarcados(int gols) {
        golsMarcados += gols;
    }

    public void registrarGolsSofridos(int gols) {
        golsSofridos += gols;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }
    
    public int getGolsMarcados() {
        return golsMarcados;
    }

    public int getGolsSofridos() {
        return golsSofridos;
    }
}