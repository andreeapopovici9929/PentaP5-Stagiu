package com.p5.adoptions.example;

import com.p5.adoptions.model.Animal;
import com.p5.adoptions.model.CatDTO;

public class OopExample {
    public static void main(String[] args)
    {
        Animal animal=new Animal();
        Animal animal2=new Animal("Machi", "http://hachi.jpg",1);
        Animal animal3=new Animal()
                .setName("Machi")
                .setPhotoUrl("photo");

        // Polymorphism-capacitatea unui obiect de a lua mai multe forme
        CatDTO catDTO = new CatDTO("Machi","photo", animal.getId());
        Animal catAnimal=new CatDTO("Zoro","photo", animal.getId());
        catDTO.speak();
        catAnimal.speak();
    }
}
