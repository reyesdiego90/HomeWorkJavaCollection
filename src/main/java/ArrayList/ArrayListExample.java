package ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import Animal.Animal;

public class ArrayListExample {
    static ArrayList<Animal> animalList = new ArrayList<Animal>();
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void addData() throws IOException {
        Animal.resetScreen();
        String nameAnimal;
        System.out.println("=============== ArrayList: Add ===============");
        System.out.println("Add an animal: ");
        nameAnimal = br.readLine();
        animalList.add(new Animal(nameAnimal.toLowerCase()));
    }

    public static void removeData() throws IOException {
        Animal.resetScreen();
        int contador = 0;
        String animalIndex;
        System.out.println("=============== ArrayList: Remove ===============");
        System.out.println("Iterating Data");
        for (Animal ani : animalList) {
            System.out.println("[" + contador + "] = " + ani);
            contador++;
        }
        System.out.println("What animal do you want to update?: Introduce a number inside of [] ");
        animalIndex = br.readLine();
        System.out.println("deleting key from set...");
        animalList.remove(Integer.parseInt(animalIndex));
        System.out.println("Elements after delete:");
    }

    public static void updateData() throws IOException {
        Animal.resetScreen();
        int contador = 0;
        System.out.println("=============== ArryList: Update ===============");
        String nameAnimal, updateAnimal;
        for (Animal ani : animalList) {
            System.out.println("[" + contador + "] = " + ani);
            contador++;
        }
        System.out.println("What animal do you want to update?: Introduce a number inside of [] ");
        nameAnimal = br.readLine();
        System.out.println("Introduce the new data: ");
        updateAnimal = br.readLine();
        Animal getAnimalIndex = animalList.get(Integer.parseInt(nameAnimal));
        getAnimalIndex.setName(updateAnimal);
        animalList.set(Integer.parseInt(nameAnimal), getAnimalIndex);
    }

    public static void iterateData() {
        Animal.resetScreen();
        System.out.println("=============== ArrayList: Iterate ===============");
        animalList.forEach(animal -> System.out.println(animal));
    }
}
