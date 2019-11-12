package dev.soterocra.lab.testmongodb.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Objects;

@Document(collection = "people")
public class People implements Serializable {
    private static final long serialVersionUID = 2829923215706417322L;

    @Id
    private String id;

    private String name;
    private Integer age;

    public People() {
    }

    public People(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return id.equals(people.id) &&
                Objects.equals(name, people.name) &&
                Objects.equals(age, people.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }
}
