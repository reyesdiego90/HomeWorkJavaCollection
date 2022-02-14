package HashSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import Animal.Animal;

public class HashSetExampel {

    static HashSet<Animal> animalList = new HashSet<Animal>();
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void addData() throws IOException {
        String nameAnimal;
        System.out.println("=============== HashSet: Add Data ===============");
        System.out.println("Add an animal: ");
        nameAnimal = br.readLine();
        animalList.add(new Animal(nameAnimal));
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void iterateData() {
        System.out.println("=============== HashSet: Iterate Data ===============");
        System.out.println("Iterating Data");
        for (Animal ani : animalList) {
            System.out.println(ani);
        }
    }

    public static void removeData() throws IOException {
        System.out.println("=============== HashSet: Remove Data ===============");
        String nameAnimal;
        for (Animal ani : animalList) {
            System.out.println(ani);
        }
        System.out.println("What animal do you want to remove?: ");
        nameAnimal = br.readLine();
        Animal a = new Animal(nameAnimal);
        System.out.println("deleting key from set...");
        animalList.remove(a);
        System.out.println("Elements after delete:");
    }

    public static void updateData() throws IOException {
        System.out.println("=============== HashSet: Update Data ===============");
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

}
