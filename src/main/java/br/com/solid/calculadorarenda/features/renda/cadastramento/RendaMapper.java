package br.com.solid.calculadorarenda.features.renda.cadastramento;

import org.mapstruct.Mapper;

import br.com.solid.calculadorarenda.entites.RendaEntity;

@Mapper(componentModel = "spring")
public interface RendaMapper {

	RendaEntity toRendaEntity(CadastramentoRendaForm cadastramentoRendaForm);

	CadastramentoRendaView toCadastramentoRendaView(RendaEntity rendaEntity);

}
