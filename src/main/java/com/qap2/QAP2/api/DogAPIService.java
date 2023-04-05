package com.qap2.QAP2.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "dog", path = "dog")
public interface DogAPIService extends JpaRepository <Dog, Long> {
public List<Dog> findByName(@Param("name")String name);
public List<Dog> findByBreed(@Param("breed")String breed);
public List<Dog> findByAge(@Param("age")int age);
public List<Dog> findByConditions(@Param("conditions")String conditions);
}
