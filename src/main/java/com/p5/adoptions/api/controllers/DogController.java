package com.p5.adoptions.api.controllers;


import com.p5.adoptions.model.DogDTO;
import com.p5.adoptions.model.ListDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.p5.adoptions.service.DogService;

@RestController
@RequestMapping("/v1/dogs")
public class DogController
{
    private final DogService dogService;

    public DogController(DogService dogService) {
        this.dogService = dogService;
    }
    @GetMapping
    public ResponseEntity<ListDTO<DogDTO>>getAllCats()
    {
        return ResponseEntity.ok(dogService.findAll());
    }

    @PostMapping
    public void addDog(@RequestBody DogDTO dogDto)

    {
        dogService.addDog(dogDto);
    }
    @GetMapping("/{name}")
    public ResponseEntity<DogDTO> getDogByName(@PathVariable("name")String name)
    {
        return ResponseEntity.ok(dogService.findDog(name));
    }
}