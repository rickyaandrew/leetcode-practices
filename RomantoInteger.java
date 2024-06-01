// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000

public class RomantoInteger {
    private int checkValI(int value, String[] romanVal, int i) {
        if (i == 0) {
            return value;
        }
        if (romanVal[i - 1].equals("I")) {
            value -= 2; 
        }
        return value;
    }

    private int checkValX(int value, String[] romanVal, int i) {
        if (i == 0) {
            return value;
        }
        if (romanVal[i - 1].equals("X")) {
            value -= 20; 
        }
        return value;
    }

    private int checkValC(int value, String[] romanVal, int i) {
        if (i == 0) {
            return value;
        }
        if (romanVal[i - 1].equals("C")) {
            value -= 200; 
        }
        return value;
    }

    public int romanToInt(String s) {
        int value = 0;
        String[] romanVal = s.split("");
        for (int i = 0 ; i < romanVal.length; i++) {
            switch(romanVal[i]) {
                case "I":
                    value += 1;
                    break;
                
                case "V":
                    value += 5;
                    value = checkValI(value, romanVal, i);
                    break;
                
                case "X":
                    value += 10;
                    value = checkValI(value, romanVal, i);
                    break;

                case "L":
                    value += 50;
                    value = checkValX(value, romanVal, i);
                    break;

                case "C":
                    value += 100;
                    value = checkValX(value, romanVal, i);
                    break;

                case "D":
                    value += 500;
                    value = checkValC(value, romanVal, i);
                    break;

                case "M":
                    value += 1000;
                    value = checkValC(value, romanVal, i);
                    break;

                default:
                    break;
            }
        }
        return value;
    }
}

