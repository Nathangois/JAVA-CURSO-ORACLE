import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class programacao {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Tempoarada de Jogo");
        System.out.println("");
        Scanner teclado = new Scanner(System.in);

       time[] times = new time[4];
       List<jogoDaSemana> jogosTabela = new ArrayList<>();

       times[0] = new time("Flamengo");
       times[1] = new time("Vasco");
       times[2] = new time("Barcelona");
       times[3] = new time("Santos");

      int semanaIguais = 0;
      int temperaturaAnterior = 0;
        int semanaAtual = 1;

      while(semanaIguais < 3){
        jogoDaSemana jogoSemana = new jogoDaSemana();
        List<time> timesDisponiveis = new ArrayList<>();
        System.out.println("Digite a temperatura da semana " + semanaAtual);
        int temperatura = teclado.nextInt();
        if (temperatura == 0) {
            if (temperaturaAnterior == 0) {
                semanaIguais++;
            } else {
                semanaIguais = 1;
            }
        } else {
            semanaIguais = 0;
        }

        temperaturaAnterior = temperatura;

        semanaAtual++;

        for (time time : times){
            timesDisponiveis.add(time);
        }

        while(timesDisponiveis.size() >=2){
            time time1 = timesDisponiveis.remove(0);
            time time2 = timesDisponiveis.remove(0);

           jogo jogo = new jogo(time1, time2, temperatura);
            jogoSemana.adicionarJogo(jogo);
        }

        jogoSemana.jogarTodos();

        jogosTabela.add(jogoSemana);

        semanaIguais++;
     }




        if(jogosTabela.size() >= 3){
            boolean encerraTemporada = true;

            for(int i = jogosTabela.size() -1; i>= jogosTabela.size()-3; i--){
                jogoDaSemana semana = jogosTabela.get(i);
                for (jogo jogo: semana.getjogos()){
                    if(jogo.getTemperatura() ==0){
                        encerraTemporada = false;
                        break;
                    }
                }
                if(!encerraTemporada){
                    break;
                }
            }

        }

    for(int i = 0; i < jogosTabela.size(); i++){
        jogoDaSemana jogosSemana = jogosTabela.get(i);
        System.out.println("Resultado da semana " + (i + 1));
        

        for (jogo jogo : jogosSemana.getjogos()){
            System.out.println("Jogo " + jogo.getResultado());
        }
        System.out.println();
    }
    
    System.out.println("Estatísticas da temporada:");
    for (time time : times) {
        System.out.println("Time: " + time.getNome());
        System.out.println("Vitórias: " + time.getVitorias());
        System.out.println("Derrotas: " + time.getDerrotas());
        System.out.println("Empates: " + time.getEmpates());
        System.out.println("Gols Marcados: " + time.getGolsMarcados());
        System.out.println("Gols Sofridos: " + time.getGolsSofridos());
        System.out.println();
    }
    int temperaturaMaisQuente = Integer.MIN_VALUE;
    int somaTemperaturas = 0;
    int totalSemanas = jogosTabela.size();

    for (jogoDaSemana jogosSemana : jogosTabela) {
        for (jogo jogo : jogosSemana.getjogos()) {
            int temperaturaa = jogo.getTemperatura();
            temperaturaMaisQuente = Math.max(temperaturaMaisQuente, temperaturaa);
            somaTemperaturas += temperaturaa;
        }
    }

    double temperaturaMedia = (double) somaTemperaturas / (totalSemanas * 2);

    System.out.println("Temperatura mais quente: " + temperaturaMaisQuente);
    System.out.println("Temperatura média: " + temperaturaMedia);

 }
}