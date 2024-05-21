public class Switch {
    public static void main(String[] args) {
        int marks = 80;

        switch (marks) {
            case 100: 
                System.out.println("Excellent");
                break;
            case 80: 
                System.out.println("Good");
                break;
            case 60: 
                System.out.println("Can do better");  
                break;
            case 40: 
                System.out.println("You Failed");
                break;
            default:System.out.println("invalid marks");        
                break;                   
        }
    }
}
