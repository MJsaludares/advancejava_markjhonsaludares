import java.time.LocalDate;
import java.time.LocalTime;

public class GuidedTask1 {
    public static void main(String[] args) {
       
        String myName = "Im"; 
        System.out.println("Hello, " + myName + "" + "Mark jhon saludare!");
        
        
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        System.out.println(" Date: " + currentDate);
        System.out.println(" Time: " + currentTime);
    }
}

