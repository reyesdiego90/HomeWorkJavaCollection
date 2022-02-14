package LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Animal.App;

public class LinkedListMenu {
    public static void Menu() throws IOException {
        String inputMessage;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] menuData = {
                "1) Add\n" +
                        "2) Remove\n" +
                        "3) Remove First Element\n" +
                        "4) Remove Last Element\n" +
                        "5) Update\n" +
                        "6) Iterate\n" +
                        "7) Previous Menu\n"
        };

        do {
            System.out.println("=============== LinkedList ===============");
            for (String data : menuData) {
                System.out.println(data);
            }
            System.out.println("Choose an optio: ");
            inputMessage = br.readLine();
            switch (Integer.parseInt(inputMessage)) {
                case 1:
                    LinkedListExample.addData();
                    break;
                case 2:
                    LinkedListExample.removeData();
                    break;
                case 3:
                    LinkedListExample.removeFirstData();
                    break;
                case 4:
                    LinkedListExample.removeLastData();
                    break;
                case 5:
                    LinkedListExample.updateData();
                    break;
                case 6:
                    LinkedListExample.iterateData();
                    break;
                case 7:
                    App.menu();
                    break;
                default:
                    break;
            }
        } while (true);

    }
}
