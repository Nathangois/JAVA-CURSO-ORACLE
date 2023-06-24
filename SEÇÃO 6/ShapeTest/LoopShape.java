package ShapeTest;

public class LoopShape {
    
public static void createRectangle(int altura, int largura){
if(altura < 1 || largura < 1){
    System.out.println("Os valores deve ser maior ou igual a 1.");
    return;
}
for(int a = 0; a < altura; a++){
    for(int b = 0; b < largura; b++){
    System.out.print("#");
    }
System.out.println();
}
}  


public static void createTriangle(int lado){
if(lado < 1 ){
    System.out.print("Valor do tamanhao do triangulo tem que ser maior ou igual 1.");
    return;
}
for(int c = 0; c < lado; c++){
    for(int d = 0; d <= c; d++){
        System.out.print("#");
    }
    System.out.println();
}
}
}