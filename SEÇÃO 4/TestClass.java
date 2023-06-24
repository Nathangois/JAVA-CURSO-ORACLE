public class TestClass {
    public static void main(String[] args) {
    ComputeMethods computeMethodos1 = new ComputeMethods();
        
    double Fahrenheit = 100;
        double C = computeMethodos1.fToC(Fahrenheit);
        System.out.println("A temperatura em Celsius é " + C);

        int a = 8;
        int b = 6;

        double hypotenuse = computeMethodos1.hypotenuse(a, b);
        System.out.println("Hipotenusa é " + hypotenuse);

        int face1= 5;
        int face2= 4;
        int soma = computeMethodos1.roll(face1, face2);
        System.out.println("A soma das faces é " + soma);

    }
    
}
