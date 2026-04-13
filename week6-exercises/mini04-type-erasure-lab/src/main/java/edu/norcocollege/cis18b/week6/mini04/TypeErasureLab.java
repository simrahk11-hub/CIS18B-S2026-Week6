package edu.norcocollege.cis18b.week6.mini04;

import java.util.ArrayList;
import java.util.List;

public class TypeErasureLab {
// Type Erasure Note: At runtime Java removes generic type information, which means List<String> and List<Integer> 
// both become just List, so they share the same runtime class.

    public static void main(String[] args) 
    {
        List<String> courseNames = new ArrayList<>();
        List<Integer> sectionCounts = new ArrayList<>();

        boolean sameRuntimeClass = courseNames.getClass() == sectionCounts.getClass();
        boolean listInstanceCheck = courseNames instanceof List;

        System.out.println("Same runtime class: " + sameRuntimeClass);
        System.out.println("List is instance of java.util.List: " + listInstanceCheck);
        System.out.println("Course token simple name: " + TypeTokenPrinter.simpleNameOf(String.class));
    }
}
