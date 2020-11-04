package com.amela;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        LinkedList <Member> nameArray = new LinkedList<>();

        Member member = new Member();

        member.enterData(nameArray);

        Utility utility = new Utility();

        System.out.println(utility.createSecretSocietyName(nameArray));
    }

}
