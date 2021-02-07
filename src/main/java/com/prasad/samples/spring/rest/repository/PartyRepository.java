package com.prasad.samples.spring.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prasad.samples.spring.rest.model.Party;

public interface PartyRepository extends JpaRepository<Party, Long> {

}
