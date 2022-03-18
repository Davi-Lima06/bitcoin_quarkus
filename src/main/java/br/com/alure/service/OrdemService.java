package br.com.alure.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.SecurityContext;

import br.com.alure.model.Ordem;
import br.com.alure.model.Usuario;
import br.com.alure.repository.OrdemRepository;

@ApplicationScoped
public class OrdemService {
	
	@Inject
	OrdemRepository repository;

	public void inserir(SecurityContext securityContext, Ordem ordem) {
		Optional<Usuario> usuarioOptional =  Usuario.findByIdOptional(ordem.getUserId());
		Usuario usuario = usuarioOptional.orElseThrow();
		if(!usuario.getUsername().equals(securityContext.getUserPrincipal().getName())) {
			throw new RuntimeException("o usuário logado é diferente do user id");
		}
		ordem.setData(LocalDate.now());
		ordem.setStatus("Enviada");
		repository.persist(ordem);
		
	}
	
	public List<Ordem> listar(){
		return repository.listAll();
	}

}
