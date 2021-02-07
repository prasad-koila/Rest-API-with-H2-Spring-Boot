package com.prasad.samples.spring.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prasad.samples.spring.rest.dto.PartyDto;
import com.prasad.samples.spring.rest.service.PartyService;

@RestController
public class YourRestController {

	@Autowired
	PartyService partyService;
	
	@GetMapping(value = "/party/{id}")
	public ResponseEntity<PartyDto> getEntityById(@PathVariable Long id) {

		return new ResponseEntity<>(partyService.getPartyById(id), HttpStatus.OK);

	}

	@PostMapping(value = "/newParty")
	public ResponseEntity<Long> createParty(@RequestBody PartyDto party) {
		return new ResponseEntity<>(partyService.createNewParty(party), HttpStatus.CREATED);

	}

	
}
