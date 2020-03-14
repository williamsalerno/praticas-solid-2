package br.com.solid.calculadorarenda.features.renda.cadastramento;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.solid.calculadorarenda.contracts.Form;
import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = false)
class CadastramentoRendaForm extends Form {

	@JsonProperty("nome_pessoa")
	String nomePessoa;

	@JsonProperty("renda")
	BigDecimal renda;

}
