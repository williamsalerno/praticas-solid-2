package br.com.solid.calculadorarenda.templates.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.solid.calculadorarenda.templates.domain.FormTemplate;
import br.com.solid.calculadorarenda.templates.domain.ViewTemplate;

public interface PostControllerTemplate<F extends FormTemplate, V extends ViewTemplate> {

	@PostMapping
	ResponseEntity<V> create(@RequestBody F form);

}
