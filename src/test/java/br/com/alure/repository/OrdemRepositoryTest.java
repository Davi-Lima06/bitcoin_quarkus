package br.com.alure.repository;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import br.com.alure.model.Ordem;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;

@QuarkusTest
public class OrdemRepositoryTest {

	@InjectMock
	OrdemRepository repo;
	
	@Test
	public void testRetornoList() {
		
		Ordem primeira = new Ordem();
		Ordem segunda = new Ordem();
		
		List<Ordem> lista = new ArrayList<Ordem>();
		
		lista.add(primeira);
		lista.add(segunda);
		
		Mockito.when(repo.listAll()).thenReturn(lista);
		Assertions.assertSame(segunda, repo.listAll().get(1));
	}
	
}
