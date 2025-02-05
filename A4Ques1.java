package Assignment4;

import java.util.*;

// Functional Interface
@FunctionalInterface
interface StringProcessor {
    String process(String str);
}

public class A4Ques1 {
    public static void main(String[] args) {
    	
    	//List of names
        List<String> names = Arrays.asList("Reshu","Anu","Yash","Jyosh","Vysh");
        
        //Sorting in reverse order
        names.sort(Comparator.reverseOrder());
        System.out.println("After sorting list in reverse order :");
        names.forEach(name -> System.out.println(name));
        
        System.out.println("------------");
        //Implementation of Functional Interface using Lambda
        StringProcessor sp = (name) -> name.toUpperCase();
        
        System.out.println("Upper case names using lambda function :");
        names.forEach(name -> System.out.println(sp.process(name)));
        System.out.println("------------");
        
        //Using Method Reference
        StringProcessor spr = String::toUpperCase;
        System.out.println("Upper case names using method reference :");
        names.forEach(name -> System.out.println(spr.process(name)));
    }
}

