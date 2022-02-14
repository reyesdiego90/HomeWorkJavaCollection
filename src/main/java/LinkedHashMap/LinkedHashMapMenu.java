package LinkedHashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Animal.App;

public class LinkedHashMapMenu {
    public static void Menu() throws IOException {
        String inputMessage;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] menuData = {
                "1) Add\n" +
                        "2) Remove\n" +
                        "3) Update\n" +
                        "4) Iterate\n" +
                        "5) Previous Menu\n"
        };

        do {
            System.out.println("=============== LinkedHashMap ===============");
            for (String data : menuData) {
                System.out.println(data);
            }
            System.out.println("Choose an optio: ");
            inputMessage = br.readLine();
            switch (Integer.parseInt(inputMessage)) {
                case 1:
                    LinkedHashMapExample.addData();
                    break;
                case 2:
                    LinkedHashMapExample.removeData();
                    break;
                case 3:
                    LinkedHashMapExample.updateData();
                    break;
                case 4:
                    LinkedHashMapExample.iterateData();
                    break;
                case 5:
                    App.menu();
                    break;
                default:
                    break;
            }
        } while (true);

    }
}
