package br.com.solid.calculadorarenda.features.renda;

import org.springframework.data.repository.CrudRepository;

import br.com.solid.calculadorarenda.entities.RendaEntity;

public interface RendaRepository extends CrudRepository<RendaEntity, Long> {

}
