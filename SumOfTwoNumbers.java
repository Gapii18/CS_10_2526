//Student's name: Gabriela Zambrano
//Group: 10c
//Date:
//Topic:

import java.util.Scanner;

class MinutesToYearsDays {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Por favor, ingrese la cantidad de minutos:");
        long minutes = scanner.nextLong(); 
        
        
        long minutesInYear = 60 * 24 * 365;   
        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear; 
        long days = remainingMinutes / (60 * 24); 
        
    
        System.out.println(minutes + " minutos son aproximadamente " + years + " años y " + days + " días.");
        
        
        scanner.close();
    }
}
