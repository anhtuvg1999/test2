/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package period2_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Period2_1 {

    /**
     * @param args the command line arguments
     */
    ArrayList<FanColor> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void menu() {
        System.out.println("1. add fan");
        System.out.println("2. display all fan");
        System.out.println("3. search fan using id");
    }

    public void add() {
        FanColor FC = new FanColor();
        Integer tempID, tempSpeed, tempPrice;
        String tempName, tempColor;
        System.out.println("Enter Color:");
        tempColor = sc.nextLine();
        System.out.println("Enter ID:");
        tempID = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Speed:");
        tempSpeed = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Price:");
        tempPrice = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name:");
        tempName = sc.nextLine();
        FanColor a = new FanColor(tempColor, tempID, tempSpeed, tempPrice, tempName);
        list.add(a);

    }

    public void display() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void Search() {
     
        System.out.println("Enter the ID search:");
        int a = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (a == list.get(i).getID()) {
                System.out.println(list.get(i).toString());
            }
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Period2_1 run = new Period2_1();
        while(true){
        run.menu();
        int choose = run.sc.nextInt();

        switch (choose) {
            case 1: {
                run.add();
                break;
            }
            case 2: {
                run.display();
                break;
            }
            case 3: {
                run.Search();
                break;
            }
        }
        }

    }

}
