package com.prasad.samples.spring.rest.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prasad.samples.spring.rest.dto.PartyDto;
import com.prasad.samples.spring.rest.model.Party;
import com.prasad.samples.spring.rest.repository.PartyRepository;

@Service
public class PartyService {
	
	@Autowired
	PartyRepository partyRepo;
	
	public PartyDto getPartyById(Long id) {
		
		return partyRepo.findById(id)
				.map(party -> new PartyDto(party.getFirstName(), party.getLastName())).orElse(null);
		
	}
	
	
	public long createNewParty(PartyDto party) {
		
		Party newParty = new Party();
		newParty.setFirstName(party.getFirstName());
		newParty.setLastName(party.getLastName());
		newParty.setCreationDate(LocalDateTime.now());
		
		return partyRepo.save(newParty).getId();
		
	}

}
