package entities;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico,NavegadorInternet{

	private String nome;
	private String marca;
	private boolean ligado;
	

	public Iphone(String nome, String marca) {
		this.nome = nome;
		this.marca = marca;
		this.ligado = false;
	}


	public String getNome() {
		return nome;
	}


	public String getMarca() {
		return marca;
	}


	public boolean isLigado() {
		return ligado;
	}


	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}


	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página: " + url);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Abrindo nova página.");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando a página.");
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para: " + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação.");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz.");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando musica.");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando musica.");
		
	}

	@Override
	public String selecionarMusica(String novaMusica) {
		return "Selecionando musica: " + novaMusica;
	}
}
