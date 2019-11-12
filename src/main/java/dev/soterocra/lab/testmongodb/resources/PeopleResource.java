package dev.soterocra.lab.testmongodb.resources;


import dev.soterocra.lab.testmongodb.dto.PeopleDTO;
import dev.soterocra.lab.testmongodb.services.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Controller
@RequestMapping("/people")
public class PeopleResource {

    @Autowired
    private PeopleService service;

    @PostMapping
    public ResponseEntity<PeopleDTO> insert(@RequestBody PeopleDTO dto) {
        PeopleDTO newDto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newDto.getId()).toUri();
        return ResponseEntity.created(uri).body(newDto);
    }

    @GetMapping
    public ResponseEntity<List<PeopleDTO>> findAll() {
        List<PeopleDTO> dtoList = service.findAll();
        return ResponseEntity.ok().body(dtoList);
    }

}
