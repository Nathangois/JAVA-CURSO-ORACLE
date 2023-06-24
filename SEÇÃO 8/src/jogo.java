import java.util.Random;
public class jogo {
    private time time1;
    private time time2;
    private int placarTime1;
    private int placarTime2;
    private int temperatura;

    public jogo(time time1, time time2, int temperatura){
        this.time1 = time1;
        this.time2= time2;
        this.temperatura = temperatura;
    }

    public void jogar(){
        Random random = new Random();
        int MaxGols = calcularMaxGols(temperatura);

        placarTime1 = random.nextInt(MaxGols + 1);
        placarTime2 = random.nextInt(MaxGols + 1);

        if(placarTime1 > placarTime2){
            time1.registrarVitoria();
            time2.registrarDerrota();
        } else if (placarTime1 < placarTime2) {
            time1.registrarDerrota();
            time2.registrarVitoria();
        } else {
            time1.registrarEmpate();
            time2.registrarEmpate();
        }

        time2.registrarGolsMarcados(placarTime1);
        time1.registrarGolsSofridos(placarTime2);
        time2.registrarGolsMarcados(placarTime2);
        time2.registrarGolsSofridos(placarTime1);

    }


    private int calcularMaxGols(int temperatura){
        if (temperatura > 20){
            return 5;
        }else{
            return temperatura / 4;
        }
    }

    public int getTemperatura(){
        return temperatura;
    }

    public String getResultado(){
        return time1.getNome()+ " "+ placarTime1 + "x"+ placarTime2 + " "+ time2.getNome(); 
    }
}