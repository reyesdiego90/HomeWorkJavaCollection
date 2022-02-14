package Animal;

import java.io.IOException;
import java.util.Scanner;

import ArrayList.ArrayListMenu;
import HashMap.HashMapMenu;
import HashSet.MenuHashSet;
import HashTable.HashTableMenu;
import LinkedHashMap.LinkedHashMapMenu;
import LinkedHashSet.LinkedHashSetMenu;
import LinkedList.LinkedListMenu;
import PriorityQueue.PriorityQueueMenu;
import TreeMap.TreeMapMenu;
import TreeSet.TreeSetMenu;
import Vector.VectorMenu;

public class App {
    public static void main(String[] args) throws IOException {
        menu();
    }

    public static void menu() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        String[] menuList = {
                "1) HashSet",
                "2) LinkedHashSet",
                "3) TreeSet",
                "4) ArrayList",
                "5) Vector",
                "6) LinkedList",
                "7) PriorityQueue",
                "8) HashTable",
                "9) HashMap",
                "10) LinkedHashMapExample",
                "11) TreeMap",
                "12) Exit"
        };

        boolean menu = true;
        do {
            int inputMessage;
            for (String m : menuList) {
                System.out.println(m);
            }
            System.out.println("Choose an option: ");
            inputMessage = sc.nextInt();
            switch (inputMessage) {
                case 1:
                    MenuHashSet.Menu();
                    break;
                case 2:
                    LinkedHashSetMenu.Menu();
                    break;
                case 3:
                    TreeSetMenu.Menu();
                    break;
                case 4:
                    ArrayListMenu.Menu();
                    break;
                case 5:
                    VectorMenu.Menu();
                    break;
                case 6:
                    LinkedListMenu.Menu();
                case 7:
                    PriorityQueueMenu.Menu();
                    break;
                case 8:
                    HashTableMenu.Menu();
                    break;
                case 9:
                    HashMapMenu.Menu();
                    break;
                case 10:
                    LinkedHashMapMenu.Menu();
                    break;
                case 11:
                    TreeMapMenu.Menu();
                    break;
                case 12:
                    menu = false;
                    break;
                default:
                    break;
            }

        } while (menu);

        sc.close();
    }
}
