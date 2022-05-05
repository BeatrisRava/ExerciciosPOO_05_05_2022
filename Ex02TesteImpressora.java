public class Ex02TesteImpressora {
     
    public static void main(String[] args) {
        
    
    Ex01Impressora imprimir = new Ex01Impressora();

    imprimir.exibir(7.00f);
    imprimir.exibir(4.00f, 4.00f);
    imprimir.exibir(3.00f, "TRÊS");
    imprimir.exibir("NUMERO:", 47.00f);
    imprimir.exibir("Sou", "Muito", "Linda");
    imprimir.exibir(48, 2, "CINQUENTA");

}

}
