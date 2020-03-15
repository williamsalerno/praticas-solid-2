package br.com.solid.calculadorarenda.features.renda;

import org.springframework.data.repository.CrudRepository;

import br.com.solid.calculadorarenda.entites.RendaEntity;

public interface RendaRepository extends CrudRepository<RendaEntity, Long> {

}
