package homework_week_9;

import java.util.ArrayList;

public class Programme_7_UnderGroundTubeName {
    public void isEmpty() {
        ArrayList<String> tubeNames = new ArrayList<>();
        tubeNames.add("Bakerloo_line");
        tubeNames.add("Central_line");
        tubeNames.add("Circle_line");
        tubeNames.add("District_line");
        tubeNames.add("Hammersmith_and_City_line");
        tubeNames.add("Jubilee_line");
        tubeNames.add("Northern_line");
        tubeNames.add("Piccadilly_line");
        tubeNames.add("Victoria_line");
        tubeNames.add("Waterloo_and_City_line");
        System.out.println("Given Array List: " + tubeNames);
        if (tubeNames.isEmpty()) {
            System.out.println("Given Array List is Empty!!");
        } else {
            System.out.println("Given Array List is not Empty!!");
        }
    }

    public static void main(String[] args) {
        Programme_7_UnderGroundTubeName obj = new Programme_7_UnderGroundTubeName();
        obj.isEmpty();
    }
}

