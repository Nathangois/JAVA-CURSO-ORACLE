import java.util.Scanner;
public class ValidatePin{
public static void main(String[] args) {
int PIN;
Scanner teclado = new Scanner(System.in);

System.out.println("Insira o PIN");
PIN = teclado.nextInt();
teclado.close();
int validoPIN = 1234;

while (PIN != validoPIN){
    System.out.println("Digite novamente, PIN incorreto.");
    PIN = teclado.nextInt(); 
    teclado.close();
}
    System.out.println("O PIN correto foi inserido e agora tem acesso à conta.");
}
}