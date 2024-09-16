package smartPhone;

public class Iphone {

	public static void main(String[] args) {
		
		SmartPhone iphone = new SmartPhone();
		
		System.out.println("Iniciando App de Musica");
		iphone.selecionarMusica("Olá, Mundo!");
		iphone.tocar();
		iphone.pausar();
		iphone.atender();
		System.out.println("\nIniciando App de Chamadas");
		iphone.ligar("(48) 98765-4321");
		iphone.iniciarCorreioVoz();
		System.out.println("\nAbrindo Navegador");
		iphone.adicionarNovaAba();
		iphone.exibirPagina("www.google.com.br");
		iphone.atualizarPagina();
		
	}

}
