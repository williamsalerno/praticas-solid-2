package br.com.solid.calculadorarenda.features.renda.cadastramento;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.solid.calculadorarenda.templates.domain.ViewTemplate;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
class CadastramentoRendaView extends ViewTemplate {

	@JsonProperty("renda")
	private BigDecimal renda;
	
	@JsonProperty("email")
	private String email;

	@JsonProperty("nome_pessoa")
	private String nomePessoa;

}
