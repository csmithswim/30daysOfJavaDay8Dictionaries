package com.csmithswim;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> phoneBook = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
//            System.out.println(name);
//            System.out.println(phone);
            phoneBook.put(name,phone);
//            System.out.println(phoneBook);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
                if (phoneBook.containsKey(s)){
                    System.out.println(s+"="+phoneBook.get(s));
                } else if(!phoneBook.containsKey(s)){
                    System.out.println("Not found");
                }
        }
        in.close();
    }
}

/*
3
sam 99912222
tom 11122222
harry 12299933
sam
edward
harry
 */