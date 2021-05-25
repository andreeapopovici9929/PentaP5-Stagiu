package com.p5.adoptions.service;

import com.p5.adoptions.repository.dogs.DogRepository;
import com.p5.adoptions.repository.dogs.Dog;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class DogService
{
    private final DogRepository dogRepository;

    public DogService(DogRepository dogRepository)
    {
        this.dogRepository = dogRepository;
    }
    public void addDog(Dog dog)
    {
        if (dog.getName()==null && dog.getUrl()==null)
        {
            throw new RuntimeException("Cat must have a name and a photo!");
        }

        Dog dogToSave = new Dog()
                .setName(dog.getName())
                .setUrl(dog.getUrl());

         dogRepository.save(dogToSave);
    }
    public List<Dog> findAll(){
        return dogRepository.findAll();
    }
}
