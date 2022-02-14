package PriorityQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Animal.App;

public class PriorityQueueMenu {
    public static void Menu() throws IOException {
        String inputMessage;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] menuData = {
                "1) Add\n" +
                        "2) Remove\n" +
                        "3) Remove with Poll\n" +
                        "4) Update\n" +
                        "5) Iterate\n" +
                        "6) Previous Menu\n"
        };

        do {
            System.out.println("=============== PriorityQueue ===============");
            for (String data : menuData) {
                System.out.println(data);
            }
            System.out.println("Choose an optio: ");
            inputMessage = br.readLine();
            switch (Integer.parseInt(inputMessage)) {
                case 1:
                    PriorityQueueExample.addData();
                    break;
                case 2:
                    PriorityQueueExample.removeData();
                    break;
                case 3:
                    PriorityQueueExample.removePollData();
                    break;
                case 4:
                    PriorityQueueExample.updateData();
                    break;
                case 5:
                    PriorityQueueExample.iterateData();
                    break;
                case 6:
                    App.menu();
                    break;
                default:
                    break;
            }
        } while (true);

    }
}
