package com.mirvox.pingo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mirvox.pingo.entities.Strings;
import com.mirvox.pingo.services.StringsService;


@RestController
@RequestMapping
public class StringsResources {

	@Autowired
	private StringsService service;
	
	// LISTING ALL STRINGS
	
	@GetMapping(value="/transparency/listAll")
	public ResponseEntity<List<Strings>> listAll() {
		
		List<Strings> stringList = service.listAll();
		return ResponseEntity.ok().body(stringList);
	}
	
	// FINDING A RANDOM STRING
	
	@GetMapping(value="/transparency/findRandom")
	public ResponseEntity<Strings> findRandom() {
		
		Strings string = service.findRandom();
		return ResponseEntity.ok().body(string);
	}
	
	// GETTING 16 RANDOM STRINGS
	
	@GetMapping(value="/transparency/getRandom")
	public ResponseEntity<List<Strings>> getRandomStrings() {
		
		List<Strings> listString = service.getRandomStrings();
		return ResponseEntity.ok().body(listString);
	}
	
}
