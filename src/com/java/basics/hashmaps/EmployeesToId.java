package com.java.basics.hashmaps;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class EmployeesToId {
    public static void main(String[] args) {
        HashMap<String, Integer> empId = new HashMap<String, Integer>();
        LinkedHashMap<String, Integer> empId1 = new LinkedHashMap<>();
        empId.put("Jerome", 12345);
        empId.put("Harish", 32372);
        empId.put("Markus", 32783);

        System.out.println(empId);
        System.out.println();

        //Displaying the id value
        Integer id = empId.get("Jerome");
        System.out.println(id);
        System.out.println();

        //.containsKey() and .containsValue()
        boolean v1 = empId.containsKey("Jerome");
        boolean v2 = empId.containsKey("Martha");
        System.out.println(v1+" "+v2);
        System.out.println();
        boolean v3 = empId.containsValue(12345);
        boolean v4 = empId.containsValue(32342);
        System.out.println(v3+" "+v4);
        System.out.println();

        //.putIfAbsent() and .replace()
        empId.replace("Harish", 21233);
        empId.putIfAbsent("Martin", 43342);
        System.out.println(empId);
        System.out.println();

        //Using LinkedHashMaps to preserve the order
        empId1.put("Jerome", 12345);
        empId1.put("Harish", 32372);
        empId1.put("Markus", 32783);

        System.out.println(empId1);
    }
}
