import java.util.Stack;

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
        System.out.println("The Trie has been created");
    }

    public void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;
        }
        current.endOfString = true;
        System.out.println("Successfully inserted " + word + " in Trie");
    }

    public boolean search(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                System.out.println(word + " word is not present in Trie");
                return false;
            }
            current = node;
        }

        if (current.endOfString == true) {
            System.out.println(word + " word is present in Trie");
            return true;
        } else {
            System.out.println(word + "word is not present in Trie");
            return false;
        }
    }

    public boolean delete(TrieNode parentNode, String word, int index) {
        char ch = word.charAt(index);
        TrieNode currentNode = parentNode.children.get(ch);
        boolean canThisNodeBeDeleted;
        //same prefix for more than 1 word
        if (currentNode.children.size() > 1) {
            delete(currentNode, word, index + 1);
            return false;
        }
        if (index == word.length() - 1) {
            //at last charchter of word but its prefix for other word
            if (currentNode.children.size() >= 1) {
                currentNode.endOfString = false;
                return false;
            }
            //at last charchter of word and its not prefix for other word
            else {
                parentNode.children.remove(ch);
                return true;
            }
        }
        //some other word is prefix of this word
        if (currentNode.endOfString == true) {
            delete(currentNode, word, index + 1);
            return false;
        }
        //no other node is dependent
        canThisNodeBeDeleted = delete(currentNode, word, index + 1);
        if (canThisNodeBeDeleted) {
            parentNode.children.remove(ch);
            return true;
        } else {
            return false;
        }
    }

    public void delete(String word) {
        if (search(word) == true) delete(root, word, 0);
    }
}
