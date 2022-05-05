public class Ex03CalculadoraCientifica {

    public double raiz(int num1){
        return (Math.sqrt(num1));
    }

    public double raiz(double num){
        return Math.sqrt(num);
    }

    public double raiz(String string1){
        return Math.sqrt(Double.parseDouble(string1));
    }

    public double potência(Byte num1, Byte num2){
        return Math.pow(num1, num2);
    }

    public double potência(String string1, String string2){
        return Math.pow(Double.parseDouble(string1), Double.parseDouble(string1));
    }

    public double potência(int num1, double num2){
        return Math.pow(num1, num2);
    }

    
}
