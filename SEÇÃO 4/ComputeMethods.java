public class ComputeMethods{
    public double fToC(double degreesF){
        double C = 5.0 / 9.0 * (degreesF - 32);
        return C;
    }
    public double hypotenuse(int a, int b){
    double hypotenuse = Math.sqrt(a*a+b*b);
    return hypotenuse;
    }
    public int roll(int face1,int face2){
        int soma = face1 + face2;
        return soma;
    }
}

