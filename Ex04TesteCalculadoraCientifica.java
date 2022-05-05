public class Ex04TesteCalculadoraCientifica {
     public static void main(String[] args) {
          
    
           Ex03CalculadoraCientifica Calcular = new Ex03CalculadoraCientifica();
    
           System.out.println(Calcular.raiz(20));
           System.out.println(Calcular.raiz(169f));
           System.out.println(Calcular.raiz("40"));
           System.out.println(Calcular.potencia(2, 8));
           System.out.println(Calcular.potencia(8,4));
           System.out.println(Calcular.potencia(7,14f));
        }
    }
}
