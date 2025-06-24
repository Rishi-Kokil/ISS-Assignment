package stringsarrays;

public class StringDemo {

    public static void main(String[] args) {

        // Creating a string using character array
        char[] ch = {'R', 'i', 's', 'h', 'i'};
        String s = new String(ch);

        // Direct string assignment
        String name = "Rishi";

        System.out.println("First String from character array: " + s);
        System.out.println("Second String from string literal: " + name);

        // Creating a string using 'new' keyword
        String s1 = new String("Hello World");
        System.out.println("String created using 'new' keyword: " + s1);

        // Common String methods
        String demoString1 = "Welcome";

        System.out.println("Index of first occurrence of 'e': " + demoString1.indexOf('e'));
        System.out.println("Index of last occurrence of 'e': " + demoString1.lastIndexOf('e'));
        System.out.println("Index of substring 'Wel': " + demoString1.indexOf("Wel"));
        System.out.println("Index of substring 'me' from end: " + demoString1.lastIndexOf("me"));
        System.out.println("Replacing 'e' with 'p': " + demoString1.replace('e', 'p'));
        System.out.println("Replacing 'Wel' with 'abc': " + demoString1.replace("Wel", "abc"));
        System.out.println("Length of the string: " + demoString1.length());
        System.out.println("Substring from index 3 to end: " + demoString1.substring(3));
        System.out.println("Substring from index 1 to 4: " + demoString1.substring(1, 4));
        System.out.println("Character at index 2: " + demoString1.charAt(2));
        System.out.println("String in uppercase: " + demoString1.toUpperCase());
        System.out.println("String in lowercase: " + demoString1.toLowerCase());
        System.out.println("Does the string start with 'Wel'? " + demoString1.startsWith("Wel"));
        System.out.println("Does the string end with 'me'? " + demoString1.endsWith("me"));
        System.out.println("Trimming whitespace: '" + "   Java   ".trim() + "'");
        System.out.println("Comparing 'Welcome' with 'welcome': " + demoString1.equals("welcome"));
        System.out.println("Comparing (ignore case) 'Welcome' with 'welcome': " + demoString1.equalsIgnoreCase("welcome"));
        System.out.println("Concatenating with ' Home': " + demoString1.concat(" Home"));

        // Using StringBuilder for mutable strings
        StringBuilder demoString2 = new StringBuilder("Hello World!");
        System.out.println("Reversed StringBuilder String : " + demoString2 + " is " + demoString2.reverse());
        System.out.println("Length of StringBuilder String: " + demoString2 + " is " + demoString2.length());
        
        
        
        //String traversal using forEach loop
        int count = 0;
        System.out.print("[");
        for(char c : demoString1.toCharArray()) {
        	System.out.print(c + ",");
        	count++;
        }
        System.out.print("]");
        System.out.println("");
        System.out.println("Length of the String counted through for each : " + count);
        
        
        
    }
}
