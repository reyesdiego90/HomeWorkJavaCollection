package LinkedHashSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

import Animal.Animal;

public class LinkedHashSetExample {

    static LinkedHashSet<Animal> animalList = new LinkedHashSet<Animal>();
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void addData() throws IOException {
        System.out.println("=============== LinkedHashSet: Add Data ===============");
        String nameAnimal;
        System.out.println("Add an animal: ");
        nameAnimal = br.readLine();
        animalList.add(new Animal(nameAnimal.toLowerCase()));
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void removeData() throws IOException {
        System.out.println("=============== LinkedHashSet: Remove Data ===============");
        String nameAnimal;
        System.out.println("Iterating Data");
        for (Animal ani : animalList) {
            System.out.println(ani);
        }
        System.out.println("What animal do you want to remove?: ");
        nameAnimal = br.readLine();
        System.out.println("deleting key from set...");
        animalList.removeIf(animal -> animal.getName().equals(nameAnimal));
        System.out.println("Elements after delete:");
    }

    public static void updateData() throws IOException {
        System.out.println("=============== LinkedHashSet: Update Data ===============");
        String nameAnimal, updateAnimal;
        for (Animal ani : animalList) {
            System.out.println(ani);
        }
        System.out.println("What animal do you want to update?: ");
        nameAnimal = br.readLine();
        System.out.println("Introduce the new data: ");
        updateAnimal = br.readLine();
        for (Animal ani : animalList) {
            System.out.println("nameAnimal update: " + ani.getName());
            if (ani.getName().equals(nameAnimal)) {
                ani.setName(updateAnimal);
                break;
            }
        }
    }

    public static void iterateData() {
        System.out.println("=============== LinkedHashSet: Iterate Data ===============");
        animalList.forEach(animal -> System.out.println(animal));
    }

}