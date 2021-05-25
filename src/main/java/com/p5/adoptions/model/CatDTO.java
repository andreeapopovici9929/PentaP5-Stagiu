package com.p5.adoptions.model;

public class CatDTO extends Animal
{
    public CatDTO(String name, String photoUrl, Integer id)
    {
        super(name, photoUrl,id );
    }
    public void iAmACat()
    {
        System.out.print("Cats are special!");
    }
    @Override
    public void speak()
    {
        System.out.println("Cat speaks!");
    }
}