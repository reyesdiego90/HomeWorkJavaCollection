package HashTable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

import Animal.Animal;

public class HashTableExample {
    static Hashtable<Integer, Animal> animalList = new Hashtable<>();
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void addData() throws IOException {
        Animal.resetScreen();
        String nameAnimal, noiseAnimal;
        System.out.println("=============== HashTable: Add ===============");
        System.out.println("Add an animal: ");
        nameAnimal = br.readLine();
        do {
            System.out.println("Add a number key: ");
            noiseAnimal = br.readLine();
            if (animalList.containsKey(Integer.parseInt(noiseAnimal))) {
                System.out.println("La clave ya existe!!!!");
            } else {
                animalList.put(Integer.parseInt(noiseAnimal), new Animal(nameAnimal.toLowerCase()));
                break;
            }
        } while (true);
    }

    public static void removeData() throws IOException {
        System.out.println("=============== HashTable: Remove Data ===============");
        String nameAnimal;
        System.out.println("Iterating Data");
        animalList.forEach((k, v) -> {
            System.out.println("Key is : " + k + "   Value is : " + v);
        });
        System.out.println("What animal do you want to remove?: enter the key ");
        nameAnimal = br.readLine();
        System.out.println("deleting key from set...");
        animalList.remove(Integer.parseInt(nameAnimal));
        System.out.println("Elements after delete:");
    }

    public static void updateData() throws IOException {
        System.out.println("=============== HashTable: Update Data ===============");
        String keyAnimal, updateAnimal;

        animalList.forEach((k, v) -> {
            System.out.println("Key is : " + k + "   Value is : " + v);
        });
        System.out.println("What animal do you want to update?: enter the key ");
        keyAnimal = br.readLine();
        System.out.println("Introduce the new data: ");
        updateAnimal = br.readLine();
        animalList.get(Integer.parseInt(keyAnimal)).setName(updateAnimal);
    }

    public static void iterateData() {
        Animal.resetScreen();
        System.out.println("=============== HashTable: Iterate ===============");
        animalList.forEach((k, v) -> {
            System.out.println("Key is : " + k + "   Value is : " + v);
        });
    }
}