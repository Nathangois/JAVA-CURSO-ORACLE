import java.util.Scanner;
public class ColorRange{
    public static void main(String[] args) {
        double comprimentoOnda;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o comprimento da onda");
        comprimentoOnda = teclado.nextDouble();
        teclado.close();
        
    
    if (comprimentoOnda >= 380 && comprimentoOnda < 450 ){
    System.out.println(" A cor é Violeta");
    }
    else if (comprimentoOnda >= 450 && comprimentoOnda < 495){
    System.out.println(" A cor é Azul");
    }
    else if (comprimentoOnda >= 495 && comprimentoOnda < 570){
    System.out.println(" A cor é Verde");
    }
    else if (comprimentoOnda >= 570 && comprimentoOnda < 590){
    System.out.println(" A cor é Amarelo");
    }
    else if (comprimentoOnda >= 590 && comprimentoOnda < 620 ){
    System.out.println(" A cor é Laranja");
    }
    else if (comprimentoOnda >= 620 && comprimentoOnda < 750 ){
    System.out.println(" A cor é Vermelho");
    }
    else{
    System.out.println(" o comprimento de onda não está dentro do espectro visível.");
    }

    }
}