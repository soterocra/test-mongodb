package dev.soterocra.lab.testmongodb.repositories;

import dev.soterocra.lab.testmongodb.entities.People;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends MongoRepository<People, String> {
}
