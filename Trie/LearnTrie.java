class LearnTrie {

    public static class Node {
        Node[] children;
        boolean eow;

        Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int ind = word.charAt(i) - 'a';
            if (curr.children[ind] == null) {
                curr.children[ind] = new Node();
            }
            if(i == word.length()-1){
                curr.children[ind].eow = true;
            }
            curr = curr.children[ind];
        }
    }
    public static boolean search(String key){

         Node curr = root;
        for( int i = 0 ; i< key.length() ; i++){
            int ind = key.charAt(i) - 'a';

            if(curr.children[ind] == null){
                return false;
            }
            if( i == key.length()-1 && curr.children[ind].eow == false){
                return false;
            }
            curr = curr.children[ind];
        }
        return true;
    }
    public static boolean wordbreak(String key ){

        if(key.length() == 0){
            return true ;
        }
        for( int i =1 ; i<= key.length() ; i++){
            String firstpart = key.substring(0, i);
            String secondpart = key.substring(i);
            if(search(firstpart) && wordbreak( secondpart)){
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {

        String words[] = { "i", "like", "samsumg", "mobile", "ice" };
        for( int i = 0 ; i< words.length ; i++){
            insert(words[i]);
        }

       String key = "ioo";
       System.out.println(wordbreak(key));

        
    }
}