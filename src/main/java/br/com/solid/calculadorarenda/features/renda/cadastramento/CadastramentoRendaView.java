package br.com.solid.calculadorarenda.features.renda.cadastramento;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.solid.calculadorarenda.contracts.View;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = false)
class CadastramentoRendaView extends View {

	@NonNull
	@JsonProperty("nome_pessoa")
	private final String nomePessoa;

	@NonNull
	@JsonProperty("renda")
	private final BigDecimal renda;

}
