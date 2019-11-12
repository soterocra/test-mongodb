package dev.soterocra.lab.testmongodb.dto;

import dev.soterocra.lab.testmongodb.entities.People;

import java.io.Serializable;

public class PeopleDTO implements Serializable {
    private static final long serialVersionUID = 2829923215706417322L;

    private String id;
    private String name;
    private Integer age;

    public PeopleDTO() {
    }

    public PeopleDTO(String id, String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public PeopleDTO(People entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.age = entity.getAge();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public People toEntity() {
        return new People(this.id, this.name, this.age);
    }
}
