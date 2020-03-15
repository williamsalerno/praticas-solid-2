package br.com.solid.calculadorarenda.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "TB01_RENDA")
@Data
public class RendaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "RENDA")
	private BigDecimal renda;
	
	@Column(name = "EMAIL")
	private String email;

	@Column(name = "NOME")
	private String nomePessoa;

}
