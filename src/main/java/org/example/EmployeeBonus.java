package org.example;

public class EmployeeBonus {
    public static void main (String[] args){
        String performance = "gold";
        String bonus;

        if (performance.equalsIgnoreCase("silver")){
            bonus = "100";
        }
        else if (performance.equalsIgnoreCase("gold")){
            bonus = "200";
        }
        else if (performance.equalsIgnoreCase("platinum")){
            bonus = "300";
        }
        else {
            bonus = "50";
        }
        System.out.println("performance: " + performance);
        System.out.println("Bonus assigned:  $" + bonus);
        System.out.println("..........................");

        String[] names = {"person1", "person2", "person3", "person4"};
        String[] performances = {"silver", "gold", "platinum", "broze"};

        for (int i=0;i<names.length; i++){
            String name = names[i];
            String Performance = performances[i];
            String Bonus;

            if (Performance.equalsIgnoreCase("silver")){
                Bonus = "100";
            }
            else if (Performance.equalsIgnoreCase("gold")){
                Bonus = "200";
            }
            else if (Performance.equalsIgnoreCase("platinum")){
                Bonus = "300";
            }
            else {
                Bonus = "50";
            }
            System.out.println(name + " = " + Performance +"Bonus: $" + bonus);
        }

    }

}
