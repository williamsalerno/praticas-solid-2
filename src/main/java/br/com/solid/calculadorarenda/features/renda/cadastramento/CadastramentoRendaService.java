package br.com.solid.calculadorarenda.features.renda.cadastramento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.solid.calculadorarenda.entites.RendaEntity;
import br.com.solid.calculadorarenda.features.renda.RendaService;

@Component
class CadastramentoRendaService extends RendaService {

	@Autowired
	private RendaMapper rendaMapper;

	public CadastramentoRendaView create(CadastramentoRendaForm cadastramentoRendaForm) {
		RendaEntity rendaEntity = rendaMapper.toRendaEntity(cadastramentoRendaForm);
		rendaEntity = super.rendaRepository.save(rendaEntity);
		return rendaMapper.toCadastramentoRendaView(rendaEntity);
	}

}
