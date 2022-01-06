package com.company;

// Create the results class, this class has 5 variables, Physics, Chemistry, and Biology, total and
// percentage.
// This class should also have 2 methods:

//Method 1 - displays the results that the person got for each exam and then the total mark.
// Try to make the output neat and bespoke for each exam.
//Method 2 - which finds and displays the percentage that the person received for the exams overall.

public class Results {

    int physics_result;
    int chemistry_result;
    int biology_result;
    int total;
    double percentage_total;

    public void displayResult(){
        System.out.println("Physics:" + "\t" + physics_result);
        System.out.println("Chemistry:" + "\t" + chemistry_result);
        System.out.println("Biology:" + "\t" + biology_result);
        total = physics_result + chemistry_result + biology_result;
        System.out.println("Total:" + "\t\t" + total + "/450");
    }
    public void displayPercentage(){
        displayResult();
        percentage_total = (total * 100) / 450;
        // in retrospect, I could have used a method for the calculations below.
        int physics_total = (physics_result * 100) / 150;
        int chemistry_total = (chemistry_result * 100) / 150;
        int biology_total = (biology_result * 100) / 150;
        System.out.println("-------------------");
        System.out.print("Percentage: " +  percentage_total + "%");
        if (percentage_total < 60) {
            System.out.print(" " + "(Fail!)" + "\n");
        } else {
            System.out.print(" " + "(Pass!)" + "\n");
        }

        if (physics_total < 60 || chemistry_total < 60 || biology_total < 60) {
          System.out.println("You failed the exam(s):");
        }

        if (physics_total < 60)
            System.out.println("Physics" + ": " + physics_total + "%");
        if (chemistry_total < 60)
            System.out.println("Chemistry" + ": " + chemistry_total + "%");
        if (biology_total < 60)
            System.out.println("Biology" + ": " + biology_total + "%");
    }
}

