package geral;

import java.time.*;

public class Pessoa {
	private String nome;
	private int telefone;
	private LocalDate DataNascimento;
	private LocalDate DataDeCadastroDaPessoa;
	private LocalDate DataDaUltimaAlteracao;

	public Pessoa() {
	}

	public Pessoa(String nome, int telefone, LocalDate dataNascimento) {
		this.nome = nome;
		this.telefone = telefone;
		DataNascimento = dataNascimento;
		DataDeCadastroDaPessoa = LocalDate.now();
		DataDaUltimaAlteracao = LocalDate.now();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDataNascimento() {
		return DataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		DataNascimento = dataNascimento;
	}

	public LocalDate getDataDeCadastroDaPessoa() {
		return DataDeCadastroDaPessoa;
	}

	public void setDataDeCadastroDaPessoa(LocalDate dataDeCadastroDaPessoa) {
		DataDeCadastroDaPessoa = dataDeCadastroDaPessoa;
	}

	public LocalDate getDataDaUltimaAlteracao() {
		return DataDaUltimaAlteracao;
	}

	public void setDataDaUltimaAlteracao(LocalDate dataDaUltimaAlteracao) {
		DataDaUltimaAlteracao = dataDaUltimaAlteracao;
	}


	public void alterarNome(String nomeL) {
		this.setNome(nomeL);
		this.DataDaUltimaAlteracao=LocalDate.now();
	}
	
	public void alterarTelefone(int telefoneL) {
		this.setTelefone(telefoneL);
		this.DataDaUltimaAlteracao=LocalDate.now();
		
	}
	
	public void alterarDataNascimento(LocalDate dataL) {
		this.setDataNascimento(dataL);
		this.setDataDaUltimaAlteracao(LocalDate.now());
	}
	

	public String exibe() {
		return "Nome=" + nome + "\n"
				+ "Telefone=" + telefone + "\n" 
				+ "DataNascimento=" + DataNascimento + "\n"
				+ "DataDeCadastroDaPessoa=" + DataDeCadastroDaPessoa + "\n"
				+ ", DataDaUltimaAlteracao="+ DataDaUltimaAlteracao + "]";
	}

	@Override
	public String toString() {
		return "Nome=" + nome;
	}
	
}
