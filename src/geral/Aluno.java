package geral;

import java.time.*;

public class Aluno extends Pessoa{
	
	
	private double NotaFinalDoCurso;
	
	public Aluno(String nome, int telefone, LocalDate dataNascimento,double NotaFinal) {
		super(nome, telefone, dataNascimento);
		setNotaFinalDoCurso(NotaFinal);
		// TODO Auto-generated constructor stub
	}

	public double getNotaFinalDoCurso() {
		return NotaFinalDoCurso;
	}

	public void setNotaFinalDoCurso(double notaFinalDoCurso) {
		NotaFinalDoCurso = notaFinalDoCurso;
	}


	



	
	

}


