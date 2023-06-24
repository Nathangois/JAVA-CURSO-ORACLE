import java.util.List;
import java.util.ArrayList;

public class jogoDaSemana {
    private List<jogo> jogos;

    public jogoDaSemana(){
        this.jogos = new ArrayList<>();
    }

    public void adicionarJogo(jogo jogo){
        jogos.add(jogo);
    }

    public void jogarTodos(){
        for(jogo jogo: jogos){
            jogo.jogar();
        }
    }
    public List<jogo> getjogos(){
        return jogos;
    }
}