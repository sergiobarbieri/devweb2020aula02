package br.com.drummond.aula.resources;

import java.util.Date;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.drummond.aula.model.Version;

@RestController
public class exemploResources {
	
	@RequestMapping(value = {"/hello/{ra}", "/hello"}, method = RequestMethod.GET)
	public String hello2(@PathVariable(value = "ra", required = false) Optional<Integer> ra,
			@RequestParam(value = "name", defaultValue = "alunos") String name) {
		
	if (!ra.isPresent())
		return String.format("Olá %s sem RA!", name);
	else
		return String.format("Olá %s com RA %s!", name, ra.get());
	}

	@RequestMapping(value = {"/version"}, method = RequestMethod.GET)
	public ResponseEntity<Version> getVersion() {
		
		Version version;
		version = new Version();
		version.setBuidVersionNumber(10);
		version.setBuildName("Aula 2");
		version.setBuildDate(new Date());
		
		return new ResponseEntity<Version>(version, HttpStatus.OK);
		
	}
	
}
