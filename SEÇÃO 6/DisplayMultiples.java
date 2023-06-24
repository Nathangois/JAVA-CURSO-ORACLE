import java.util.Scanner;
public class DisplayMultiples {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Insira um número");
    int numero = teclado.nextInt();
    System.out.println("O número inserido é " + numero);
    int resultadoFinal;
    int valorfinal = 12;
    int i;
    teclado.close();

    for(i = 1 ; i <= valorfinal; i++){
    resultadoFinal = (numero * i);
    System.out.println(numero + "x"+ i +" = "+ resultadoFinal);
    
    }
    }   
    }