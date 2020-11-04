package com.amela;

import java.util.Comparator;
import java.util.LinkedList;

public class Utility{

    public static String createSecretSocietyName(LinkedList<Member> nameArray){
        String name = "";
        nameArray.sort(Comparator.comparing(Member::getName));
        for (Member a : nameArray){
            char temp1 = a.getName().charAt(0);
            name += temp1;
            for(int i = 1; i < a.getName().length(); i ++) {
                if (a.getName().charAt(i) == ' '){
                    temp1 = a.getName().charAt(i+1);
                    name += temp1;
                }
            }
        }
        return name;
    }
}
