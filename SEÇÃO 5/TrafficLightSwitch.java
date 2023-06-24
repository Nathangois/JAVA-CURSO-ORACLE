import java.util.Scanner;
public class TrafficLightSwitch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("COR VERMELHO = 1\nCOR VERDE = 2\nCOR AMARELO = 3");
        System.out.println("Insira o valor da cor");
        int cor = teclado.nextInt();
        teclado.close();
    
switch (cor){
case 1: System.out.println("Próxima cor é Verde");
break;
case 2: System.out.println("Próxima cor é Amarelo");
break;
case 3: System.out.println("Próxima cor é Vermelho");
break;
default: System.out.println("Cor invalida.");
}
}
}