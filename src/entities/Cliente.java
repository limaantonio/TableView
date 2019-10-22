package entities;

public class Cliente {
	
	private Boolean selected;
	private String nome;
	private Integer idade;
	private String endereco;
	
	public Cliente() {}

	public Cliente(String nome, Integer idade, String endereco) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.selected = false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setSelected(Boolean selected) {
		this.selected = selected;
	}
	
	public Boolean getSelected() {
		return selected;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + "]";
	}
	
	
	
	
}
