//Student's name: Gabriela Zambrano
//Group: 10c
//Date:
//Topic:

import java.util.Scanner;

class MinutesToYearsDays {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Please, enter your number of minutes:");
        long minutes = scanner.nextLong(); 
        
        
        long minutesInYear = 60 * 24 * 365;   
        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear; 
        long days = remainingMinutes / (60 * 24); 
        
    
        System.out.println(minutes + " the minutes are approximately" + years + " years and " + days + " days.");
        
        
        scanner.close();
    }
}
