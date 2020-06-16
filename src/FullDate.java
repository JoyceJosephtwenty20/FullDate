import java.util.Scanner;

public class FullDate {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter month (mm): ");
        int month = input.nextInt();
        System.out.println("Enter day (dd):");
        int day = input.nextInt();
        System.out.println("Enter year (yy): ");
        int year = input.nextInt();
        String convertedMonth = null;
        if (month == 1) {
            convertedMonth = "January";
        }
        else if (month > 1 && month == 2) {
            convertedMonth = "February";
        }
        else if (month > 2 && month == 3) {
            convertedMonth = "March";
        }
        else if (month > 3 && month == 4) {
            convertedMonth = "April";
        }
        else if (month > 4 && month == 5) {
            convertedMonth = "May";
        }
        else if (month > 5 && month == 6) {
            convertedMonth = "June";
        }
        else if (month > 6 && month == 7) {
            convertedMonth = "July";
        }
        else if (month > 7 && month == 8) {
            convertedMonth = "August";
        }
        else if (month > 8 && month == 9) {
            convertedMonth = "September";
        }
        else if (month > 9 && month == 10) {
            convertedMonth = "October";
        }
        else if (month > 10 && month == 11) {
            convertedMonth = "November";
        }
        else {
            convertedMonth = "December";
        }

        System.out.println("It is " + convertedMonth +" " + day + ", 20" + year);
    }
}
