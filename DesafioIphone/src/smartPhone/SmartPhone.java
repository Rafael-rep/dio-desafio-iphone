package smartPhone;

import navegador.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class SmartPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	
	public void tocar() {
		System.out.println("Tocando Musica");
	};
	public void pausar() {
		System.out.println("Musica Pausada");
	};
	public void selecionarMusica(String musica) {
		System.out.println("Musica Selecionada: "+musica);
	};
	
	public void ligar(String numero) {
		System.out.println("Ligando para o numero "+ numero);
	};
	public void atender() {
		System.out.println("Chamada Recebida, Atendendo...");
	};
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de Voz");
	};
	
	public void exibirPagina(String url) {
		System.out.println("Carregando Pagina: "+url);
	};
	public void adicionarNovaAba() {
		System.out.println("Abrindo Nova Aba");
	};
	public void atualizarPagina() {
		System.out.println("Atualizando Pagina");
	};

}
