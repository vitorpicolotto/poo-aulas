package ads.poo.aula7;

public class App {
    
    public static void main(String[] args) {
        Caneta bic = new Caneta();
        System.out.println(bic.isAberta());

        bic.abrirFechar(true);
        System.out.println(bic.isAberta());

        bic.definirCor("azul");
        System.out.println(bic.getCor());

        bic.definirNivelTinta(0.75);
        System.out.println(bic.getNivelTinta());


        Caneta novaCaneta = new Caneta();

        novaCaneta.abrirFechar(false);
        System.out.println(novaCaneta.isAberta());

        novaCaneta.definirCor("preta");
        System.out.println(novaCaneta.getCor());

        novaCaneta.definirNivelTinta(0.5);
        System.out.println(novaCaneta.getNivelTinta());

        novaCaneta.desenhar(5);
        System.out.println(novaCaneta.desenhar(6));

    }

}
