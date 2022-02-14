package TreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.TreeSet;
import Animal.Animal;

public class TreeSetExample {
    static TreeSet<Animal> animalList = new TreeSet<Animal>();
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void addData() throws IOException {
        Animal.resetScreen();
        String nameAnimal;
        System.out.println("=============== TreeSet: Add ===============");
        System.out.println("Add an animal: ");
        nameAnimal = br.readLine();
        animalList.add(new Animal(nameAnimal.toLowerCase()));
    }

    public static void removeData() throws IOException {
        Animal.resetScreen();
        String nameAnimal;
        System.out.println("=============== TreeSet: Remove ===============");
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
        Animal.resetScreen();
        System.out.println("=============== TreeSet: Update ===============");
        String nameAnimal, updateAnimal;
        for (Animal ani : animalList) {
            System.out.println(ani);
        }
        System.out.println("What animal do you want to update?: ");
        nameAnimal = br.readLine();
        System.out.println("Introduce the new data: ");
        updateAnimal = br.readLine();
        Iterator<Animal> iterator = animalList.iterator();
        while (iterator.hasNext()) {
            Animal dataobj = iterator.next();
            String qID = dataobj.getName();
            if (qID.equals(nameAnimal)) {
                dataobj.setName(updateAnimal);
                break;
            }
        }

    }

    public static void iterateData() {
        Animal.resetScreen();
        System.out.println("=============== TreeSet: Iterate ===============");
        for (Animal ani : animalList) {
            System.out.println(ani);
        }
    }

    // public void TreeSetExampleFunction() {
    // Set<Animal> treeset = new TreeSet<Animal>();
    // if (!treeset.isEmpty()) {
    // treeset.clear();
    // }
    // Animal animal1 = new Animal();
    // animal1.setName("Horse");
    // Animal animal2 = new Animal();
    // animal2.setName("Pig");
    // Animal animal3 = new Animal();
    // animal3.setName("Cat");
    // Animal animal4 = new Animal();
    // animal4.setName("Dog");
    // Animal animal5 = new Animal();
    // animal5.setName("Fish");

    // // Add objects to the HashSet.
    // treeset.add(animal3);
    // treeset.add(animal1);
    // treeset.add(animal2);
    // treeset.add(animal5);
    // treeset.add(animal4);
    // // Print the TreeSet object.
    // System.out.println("TreeSet elements:");
    // System.out.println(treeset);

    // // Removing a specific existing element inserted
    // // above
    // treeset.remove(animal1);

    // // Again printing the updated TreeSet
    // System.out.println("After removing first " + treeset);

    // // Updating data
    // animal3.setName("Spider");
    // System.out.println("After update animal3 " + treeset);

    // // Iterate data
    // treeset.add(animal1);
    // System.out.println("=============== Iterate Elements ===============");
    // for (Animal ani : treeset) {
    // System.out.println(ani);
    // }
    // }
}