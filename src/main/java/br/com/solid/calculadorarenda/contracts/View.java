package br.com.solid.calculadorarenda.contracts;

import static java.time.LocalDateTime.now;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@Getter
public class View {

	@JsonProperty("data_hora_criacao")
	private final LocalDateTime dataHoraCriacao = now();

}
