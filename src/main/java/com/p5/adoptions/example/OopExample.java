package com.p5.adoptions.example;

import com.p5.adoptions.model.AnimalDTO;
import com.p5.adoptions.model.CatDTO;

public class OopExample {
    public static void main(String[] args)
    {
        AnimalDTO animal=new AnimalDTO();
        AnimalDTO animal2=new AnimalDTO("Machi", "http://hachi.jpg",1);
        AnimalDTO animal3=new AnimalDTO()
                .setName("Machi")
                .setPhotoUrl("photo");

        // Polymorphism-capacitatea unui obiect de a lua mai multe forme
        CatDTO catDTO = new CatDTO("Machi","photo", animal.getId());
        AnimalDTO catAnimal=new CatDTO("Zoro","photo", animal.getId());
        catDTO.speak();
        catAnimal.speak();
    }
}
