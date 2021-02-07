package com.prasad.samples.spring.rest.controller;

import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.springframework.http.MediaType;

import com.prasad.samples.spring.rest.AbstractControllerTest;
import com.prasad.samples.spring.rest.dto.PartyDto;

public class YourRestControllerTest extends AbstractControllerTest {

	@Test
	public void shouldCreateParty() throws Exception {
		// given
		String partyData = "{\"firstName\":\"First Name\", \"lastName\":\"lastName\"}";
		PartyDto party = new PartyDto("First Name", "Last Name");

		// when
		when(partyService.createNewParty(party)).thenReturn(1L);

		// then
		mockMvc.perform(post("/newParty").content(partyData).contentType(APPLICATION_JSON_UTF8)
				.accept(MediaType.APPLICATION_JSON)).andExpect(status().isCreated());

	}

}
