public class ArmstrongNum {

    public static void main(String[] args) {
        int number = 371;
        
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
    
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int digits = String.valueOf(number).length();
        int sum = 0;
        
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }
        
        return sum == originalNumber;
    }
}
