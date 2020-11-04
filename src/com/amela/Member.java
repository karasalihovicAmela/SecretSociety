package com.amela;

import java.util.LinkedList;
import java.util.Scanner;

public class Member {

    private String name;

    public Member() {
    }

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void enterData(LinkedList<Member> nameArray){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter data: ");
            String name = scanner.nextLine().toUpperCase();
            String[] splittedNames = name.split(",");
            if (name.equals("STOP"))
                break;
            else {
                for (String s : splittedNames) {
                    Member member = new Member(s.trim());
                    nameArray.add(member);
                }
            }
        } while (true);

    }

}
