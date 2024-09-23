import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Welcome to the Imperial to Metric Converter!.\nEnter '-1' as a value or 'exit' as a scale to exit");
        
        Scanner scanner = new Scanner(System.in);
        boolean offSwitchOne = false;
        boolean offSwitchTwo = false;
        double value;
        double answer;

        while(!offSwitchOne || !offSwitchTwo){

            System.out.print("Enter Number Value: ");
            value = Integer.parseInt(scanner.nextLine());

            if(value == -1){
                offSwitchOne = true;
                break;
            }

            System.out.print("Enter Imperial scale: ");
            String oldScale = scanner.nextLine();

            if(oldScale.equals("oz")){
                answer = value*28.34949254;
                System.out.println(value + oldScale + " = " + answer + "g");
            }
            else if(oldScale.equals("lb")){
                answer = (value/2.20462);
                System.out.println(value + oldScale + " = " + answer + "kg");
            }
            else if(oldScale.equals("F")){
                answer = ((value-32)/1.8);
                System.out.println(value + oldScale + " = " + answer + "C");
            }
            else if(oldScale.equals("mi")){
                answer = value*1.6093445;
                System.out.println(value + oldScale + " = " + answer + "km");
            }
            else if(oldScale.equals("exit")){
                offSwitchTwo = true;
                break;
            }
            else{
                System.out.println("Something went wrong please try again.\nRemeber to use the conversions available (oz, lb, F, mi).");
            }
        }
        scanner.close();
    }
}
