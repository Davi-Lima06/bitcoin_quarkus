package br.com.alure.repository;

import javax.enterprise.context.ApplicationScoped;

import br.com.alure.model.Ordem;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class OrdemRepository implements PanacheRepository<Ordem>{

}
