package dev.soterocra.lab.testmongodb.services;

import dev.soterocra.lab.testmongodb.dto.PeopleDTO;

import java.util.List;

public interface PeopleService {

    public PeopleDTO insert(PeopleDTO peopleDTO);
    public List<PeopleDTO> findAll();

}
