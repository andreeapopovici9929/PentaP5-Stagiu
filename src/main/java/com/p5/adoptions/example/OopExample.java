package com.p5.adoptions.example;

import com.p5.adoptions.model.Animal;
import com.p5.adoptions.model.Cat;
import com.p5.adoptions.model.Dog;

public class OopExample {
    public static void main(String[] args)
    {
        Animal animal=new Animal();
        Animal animal2=new Animal("Machi", "http://hachi.jpg");
        Animal animal3=new Animal()
                .setName("Machi")
                .setPhotoUrl("photo");

        // Polymorphism-capacitatea unui obiect de a lua mai multe forme
        Cat cat= new Cat("Machi","photo");
        Animal catAnimal=new Cat("Zoro","photo");
        cat.speak();
        catAnimal.speak();
    }
}
