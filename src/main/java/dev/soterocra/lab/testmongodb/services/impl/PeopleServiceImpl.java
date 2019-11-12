package dev.soterocra.lab.testmongodb.services.impl;

import dev.soterocra.lab.testmongodb.dto.PeopleDTO;
import dev.soterocra.lab.testmongodb.repositories.PeopleRepository;
import dev.soterocra.lab.testmongodb.services.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    private PeopleRepository repository;

    @Override
    public PeopleDTO insert(PeopleDTO peopleDTO) {
        return new PeopleDTO(repository.insert(peopleDTO.toEntity()));
    }

    @Override
    public List<PeopleDTO> findAll() {
        List<PeopleDTO> dtoList = repository.findAll().stream().map(PeopleDTO::new).collect(Collectors.toList());
        return dtoList;
    }
}
