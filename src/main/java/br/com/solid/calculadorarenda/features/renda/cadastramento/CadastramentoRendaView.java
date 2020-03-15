package br.com.solid.calculadorarenda.features.renda.cadastramento;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.solid.calculadorarenda.contracts.View;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
class CadastramentoRendaView extends View {

	@JsonProperty("valor")
	private String renda;

	@JsonProperty("nome_pessoa")
	private String nomePessoa;

}
