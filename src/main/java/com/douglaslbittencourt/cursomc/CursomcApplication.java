package com.douglaslbittencourt.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.douglaslbittencourt.cursomc.domain.Categoria;
import com.douglaslbittencourt.cursomc.domain.Produto;
import com.douglaslbittencourt.cursomc.repositories.CategoriaRepository;
import com.douglaslbittencourt.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{

	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {	
	}
}
