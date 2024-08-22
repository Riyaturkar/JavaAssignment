package com.revature.coll.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo02 {
    public static void main(String[] args) {
       List<String> friendsList=new ArrayList<>();
        friendsList.add("Satheesh");
        friendsList.add("Abdul");
        friendsList.add("Aruna");
        friendsList.add("Amit");
        friendsList.add("Dharshini");

        System.out.println(friendsList);

        Collections.sort(friendsList);

        System.out.println(friendsList);
    }
}
