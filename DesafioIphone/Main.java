public class Main {
    public static void main(String[] args) {
        
        Iphone meuIPhone = new Iphone();

        System.out.println("Testando Reprodutor Musical:");
        meuIPhone.selecionarMusica("Imagine - John Lennon");
        meuIPhone.tocar();
        meuIPhone.pausar();

        System.out.println("\nTestando Aparelho Telefônico:");

        meuIPhone.ligar("123-456-789");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        System.out.println("\nTestando Navegador na Internet:");

        meuIPhone.exibirPagina("www.exemplo.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}

