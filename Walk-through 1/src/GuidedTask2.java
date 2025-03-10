
public class GuidedTask2 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter your name: ");
        String myName = scanner.nextLine(); // Read user's name
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read user's age
        
        System.out.println("Hi, " + "im " +  myName + "! i am " + age + " years old.");
        //addition
         System.out.println("FROM:MAGRAFIL");
         System.out.println("studied at Csu-G");
       
        LocalDateTime currentDateTime = LocalDateTime.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        
        System.out.println(" Date and Time: " + formattedDateTime);
         
 
        scanner.close();
    }
  }
