import java.io.*;

class Animal
{
  public void animalSound()
  {
    System.out.println("The animal makes a sound");
  }
}

class Cat extends Animal
{
  public void animalSound()
  {
    System.out.println("The cat says: meow meow");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class PolyEx
{
  public static void main(String[] args)
  {
    Animal a= new Animal();
    Animal cat = new Cat();
    Animal dog = new Dog();
    a.animalSound();
    cat.animalSound();
    dog.animalSound();
  }
}
