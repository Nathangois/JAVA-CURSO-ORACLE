import java.util.Scanner;
public class TrafficLightChecker {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("COR VERMELHO = 1\nCOR VERDE = 2\nCOR AMARELO = 3");
        System.out.println("Insira o valor da cor");
        int cor = teclado.nextInt();
        teclado.close();
        
        if(cor == 1){
           System.out.println("Próxima cor é Verde");
        }
        else if(cor == 2){
            System.out.println("Próxima cor é Amarelo");
        }
        else if(cor == 3){
            System.out.println("Próxima cor é Vermelho");
        }
        else{
        System.out.println("Cor invalida.");
        }
        }
    }