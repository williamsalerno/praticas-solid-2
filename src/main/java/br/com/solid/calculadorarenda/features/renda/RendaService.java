package br.com.solid.calculadorarenda.features.renda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class RendaService {

	@Autowired
	protected RendaRepository rendaRepository;

}
