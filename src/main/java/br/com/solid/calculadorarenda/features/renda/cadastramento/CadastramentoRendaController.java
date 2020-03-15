package br.com.solid.calculadorarenda.features.renda.cadastramento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.solid.calculadorarenda.templates.controller.PostControllerTemplate;

@RestController
@RequestMapping("/v1/cadastro")
class CadastramentoRendaController implements PostControllerTemplate<CadastramentoRendaForm, CadastramentoRendaView> {

	@Autowired
	private CadastramentoRendaService cadastramentoRendaService;

	@Override
	public ResponseEntity<CadastramentoRendaView> create(CadastramentoRendaForm form) {
		return ResponseEntity.ok(cadastramentoRendaService.create(form));
	}

}
