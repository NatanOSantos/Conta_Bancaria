package tiposdeIngresso.model;

public class Ingresso {

	private int id;
	private int tipo;
	private String nome;
	private float valor;
	public Ingresso(int id, int tipo, String nome, float valor) {
		this.id = id;
		this.tipo = tipo;
		this.nome = nome;
		this.valor = valor;}
		


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
	public void visualizar( ) {
		
	
		String tipo = "";
		
		switch (this.tipo) {
		case 1 -> tipo = "Futebol";
		case 2 -> tipo = "Basquete";
		
		}
		System.out.println("\n\n***************************************");
		System.out.println("Dados da Conta");
		System.out.println ("***************************************");
		System.out.println("id Jogo: " + this.id);
		System.out.println ("Esporte: " + tipo);
		System.out.println ("Time com ingresso a venda:  " + this.nome);
		System.out.println ("valor " + this.valor);
		
		
		
	}
	
}