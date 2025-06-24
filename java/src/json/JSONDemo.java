package json;

import org.json.JSONObject;
import org.json.JSONArray;


public class JSONDemo {
    public static void main(String[] args) {
    	
        JSONObject studentJson = new JSONObject();
        studentJson.put("id", 101);
        studentJson.put("name", "Rishi Kokil");
        studentJson.put("department", "Computer Engineering");

        System.out.println("JSON Output from Java object:");
        System.out.println(studentJson.toString(2));  // Pretty print

        //Create JSON Array
        JSONArray studentsArray = new JSONArray();
        studentsArray.put(studentJson); // adding same for demo
        studentsArray.put(new JSONObject().put("id", 102).put("name", "Amit").put("department", "IT"));

        System.out.println("\n JSON Array of Students:");
        System.out.println(studentsArray.toString(2));

        // Read values from JSON
        System.out.println("\nReading from JSON Object:");
        System.out.println("ID: " + studentJson.getInt("id"));
        System.out.println("Name: " + studentJson.getString("name"));
        System.out.println("Dept: " + studentJson.getString("department"));

        // Looping through JSONArray
        System.out.println("\nLooping through JSONArray:");
        for (int i = 0; i < studentsArray.length(); i++) {
            JSONObject obj = studentsArray.getJSONObject(i);
            System.out.println(obj.getString("name") + " (" + obj.getString("department") + ")");
        }
    }
}
