package com.mirvox.pingo.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mirvox.pingo.entities.Strings;
import com.mirvox.pingo.repositories.StringsRepository;

@Service
public class StringsService {
	
	@Autowired
	private StringsRepository repository;
	
	// LISTAR TODAS STRINGS
	
	public List<Strings> listAll() {
		return repository.findAll();
	}
	
	// PEGAR UMA STRING ALEATÓRIA
	
	public Strings findRandom() {
		Random numberGenerator = new Random();
		Long randomId = numberGenerator.nextLong(repository.count());
		Optional<Strings> randomString = repository.findById(randomId);
		
	    if (randomString.isPresent()) {
	        return randomString.get();
	    } 
	    
	    else {
			Optional<Strings> freeSpace = repository.findById(1L);
	        return freeSpace.get();
	    }
	}
	
	// PEGAR 16 STRINGS DIFERENTES
	public List<Strings> getRandomStrings() {
		
	    List<Strings> randomStrings = new ArrayList<>();
	    Random numberGenerator = new Random();
	    Set<Long> usedIds = new HashSet<>();

	    while (randomStrings.size() < 16) {
	        Long randomId = numberGenerator.nextLong(repository.count());
	        
	        if (!usedIds.contains(randomId)) {
	            Optional<Strings> randomString = repository.findById(randomId);
	            randomString.ifPresent(randomStrings::add);
	            usedIds.add(randomId);
	        }
	        
	        if (randomStrings.size() == 16) {
	            break;
	        }
	    }

	    return randomStrings;
	}

}
