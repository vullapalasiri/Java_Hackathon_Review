public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student marks (0-100): ");
        int marks = scanner.nextInt();

        
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid input! Marks should be between 0 and 100.");
        } else {
            
     {
                
                case 9:
                    System.out.println("Grade: A (Excellent)");
                    break;
                case 8:
                    System.out.println("Grade: B (Very Good)");
                    break;
                case 7:
                    System.out.println("Grade: C (Good)");
                    break;
                case 6:
                    System.out.println("Grade: D (Satisfactory)");
                    break;
                case 5:
                    System.out.println("Grade: E (Pass)");
                    break;
                default:
                    System.out.println("Grade: F (Fail)");
                    break;
            }
        }

        
    }
}
