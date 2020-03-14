package br.com.solid.calculadorarenda.features.renda.cadastramento;

import org.mapstruct.Mapper;

import br.com.solid.calculadorarenda.entities.RendaEntity;

@Mapper(componentModel = "spring")
public interface RendaMapper {

	RendaEntity toRendaEntity(CadastramentoRendaForm cadastramentoRendaForm);

	CadastramentoRendaView toCadastramentoRendaView(RendaEntity rendaEntity);

}
