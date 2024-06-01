public class CheckIfTwoStringArraysareEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder resultBuilder1 = new StringBuilder();
        StringBuilder resultBuilder2 = new StringBuilder();
        for (String str : word1) {
            resultBuilder1.append(str);
        }
        for (String str : word2) {
            resultBuilder2.append(str);
        }
        return resultBuilder1.toString().equals(resultBuilder2.toString());
    }
}
