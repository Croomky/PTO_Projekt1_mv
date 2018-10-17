
public class Parser {

    public static void Execute(String line) {
        String[] words = line.split(" ");
        if(words.length != 3) {
            System.out.println("Write a line in format: [number] [+, -, /, *] [number]");
        }

        if(!ParseNumber(words[0]) || !ParseNumber(words[2])) {
            System.out.println("Write numeric values.");
            return;
        }

        double a = Double.parseDouble(words[0]);
        double b = Double.parseDouble(words[2]);
        double result;

        switch(words[1]) {
            case "+":
                result = Calculator.add(a, b);
                break;

            case "-":
                result = Calculator.minus(a, b);
                break;

            case "/":
                if(b == 0) {
                    System.out.println("Cannot divide by zero!");
                    return;
                }
                result = Calculator.divide(a, b);
                break;

            case "*":
                result = Calculator.multiply(a, b);
                break;

            default:
                System.out.println("Write a line in format: [number] [+, -, /, *] [number]");
                return;
        }

        System.out.println(result);
    }

    public static boolean ParseNumber(String number) {
        try {
            Double.parseDouble(number);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }
}
