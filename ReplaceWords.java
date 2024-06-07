import java.util.List;

class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Trie trie = new Trie();
        for (String i : dictionary) {
            trie.add(i);
        }
        String words[] = sentence.split(" ");
        StringBuilder result = new StringBuilder(sentence.length() + 1);

        for (String word : words) {

            String root = trie.getRoot(word);
            if (root.equals("")) {
                result.append(word);
                result.append(" ");

            } else {
                result.append(root);
                result.append(" ");
            }
        }
        return result.toString().trim();
    }
}

class Trie {
    private class Node {
        Node arr[];
        boolean isWord;

        Node() {
            arr = new Node[26];
        }
    }

    private Node root;

    Trie() {
        root = new Node();
    }

    void add(String word) {
        Node curr = root;
        for (char currChar : word.toCharArray()) {
            int index = currChar - 'a';
            if (curr.arr[index] == null) {
                curr.arr[index] = new Node();
                curr = curr.arr[index];
            } else {
                curr = curr.arr[index];
            }
        }
        curr.isWord = true;
    }

    String getRoot(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            if (curr.isWord) {
                return word.substring(0, i);
            }
            char currChar = word.charAt(i);
            if (curr.arr[currChar - 'a'] == null) {
                return "";
            } else {
                curr = curr.arr[currChar - 'a'];
            }

        }
        return word;
    }
}
