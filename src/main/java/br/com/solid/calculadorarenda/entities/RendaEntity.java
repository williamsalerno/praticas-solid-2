package br.com.solid.calculadorarenda.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.solid.calculadorarenda.contracts.MultiDestination;
import lombok.Value;

@Entity
@Table(name = "TB01_RENDA")
@Value
public class RendaEntity implements MultiDestination {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@Column(name = "VALOR")
	BigDecimal valor;

	@Column(name = "NOME")
	String nomePessoa;

}
