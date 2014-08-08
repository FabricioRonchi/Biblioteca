package org.catolicasc.acervo.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.catolicasc.acervo.model.Livro;

public class LivroDao {

	public List<Livro> obterLivros() {
		List<Livro> livros = new ArrayList<Livro>();
		
		Livro livro1 = new Livro();
		livro1.setEditora("Laranjeiras");
		livro1.setAno(2015);
		livro1.setNome("Fluminense - A conquista");
		livro1.setResumo("A hist�ria da conquista da libertadores da am�rica");
		livro1.setAutores(Arrays.asList("Fred", "Conca", "C�cero"));
		livros.add(livro1);
		
		Livro livro2 = new Livro();
		livro2.setEditora("Maracan�");
		livro2.setAno(2014);
		livro2.setNome("Fluminense - Brasileir�o");
		livro2.setResumo("Fluminense: Penta campe�o brasileiro");
		livro2.setAutores(Arrays.asList("Cavalieri", "Jean", "W�gner"));		
		livros.add(livro2);
		
		return livros;
	}

}
