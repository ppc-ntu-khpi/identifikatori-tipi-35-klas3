package domain;

/**
 * Class that calculate an evil numbers
 * @author Ivan Shapovlalov
 */
public class Exercise {
    private static char UNIT_CHAR = '1';
    
    /**
     * Method that calculate an evil numbers between 2 given numbers
     * @param firstNumber first number
     * @param secondNumber second number
     * @return String with evil numbers, separated by comma 
     */
    public static String Calculate(long firstNumber, long secondNumber) throws Exception {
        StringBuilder resultString = new StringBuilder();
        if(firstNumber >= 0 && secondNumber >= 0) {
            if(firstNumber <= secondNumber) {
                for(long i = firstNumber; i <= secondNumber; i++) {
                    String binaryNumber = Long.toBinaryString(i);
                    byte unitsCount = 0;
                    for(byte j = 0; j < binaryNumber.length(); j++) {
                        if(binaryNumber.charAt(j) == UNIT_CHAR) {
                            unitsCount++;
                        }
                    }
                    if(unitsCount % 2 == 0) {
                        resultString.append(i);
                        resultString.append(", ");
                    }
                }
            }
            else {
                throw new Exception("First number should be bigger than second");
            }
        }
        else {
            throw new Exception("Numbers cannot be negative");
        }
        
        return resultString.toString();
    }
}
