package br.com.solid.calculadorarenda.contracts;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface PostControllerContract<F extends Form, V extends View> {

	@PostMapping
	ResponseEntity<V> create(@RequestBody F form);

}
