package br.com.solid.calculadorarenda.templates.domain;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ViewTemplate {

	@JsonProperty("data_hora_criacao")
	private LocalDateTime dataHoraCriacao;

}
