package br.com.solid.calculadorarenda.features.renda.cadastramento;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.solid.calculadorarenda.contracts.Form;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
class CadastramentoRendaForm extends Form {

	@JsonProperty("valor")
	private String renda;

	@JsonProperty("nome_pessoa")
	private String nomePessoa;

}
