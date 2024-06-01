public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String temp = s.replaceAll("[^A-Za-z0-9]", ""); 
        temp = temp.toLowerCase();
        return isPalindromeHelper(temp,0,temp.length() - 1);
    }
    
    public boolean isPalindromeHelper(String s, int firstIndex, int lastIndex){
        if(firstIndex >= lastIndex) {
            return true;
        }
        if(s.charAt(firstIndex) != s.charAt(lastIndex)) {
            return false;
        }
            return isPalindromeHelper(s, firstIndex+1, lastIndex-1);
    }
}
// public boolean isPalindrome(String s) {
//     int frontCounter = 0;
//     int backCounter = s.length() - 1;

//     while (backCounter >= frontCounter) {
//         char currFront = s.charAt(frontCounter);
//         char currBack = s.charAt(backCounter);
//         while ((currFront >= 'a' && currFront <= 'z') || (currFront >= 'A' && currFront <= 'Z')) {
//             frontCounter++;
//             currFront = s.charAt(frontCounter);
//         }
//         while ((currBack >= 'a' && currBack <= 'z') || (currBack >= 'A' && currBack <= 'Z')) {
//             backCounter--;
//             currBack = s.charAt(backCounter);
//         }
//         if (currFront != currBack || Math.abs(currFront - currBack) != 32) {
//             return false;
//         }
//         frontCounter++;
//         backCounter--;
//     }
//     return true;
// }
