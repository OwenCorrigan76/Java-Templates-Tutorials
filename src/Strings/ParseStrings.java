package Strings;

public class ParseStrings {

    // find a word in a sentence

    public void parsing() {
        String s = "I love you loads Codecademy";
        String secondLastWord = findSecondLastWord(s);
        System.out.println(secondLastWord);
    }

    public String findSecondLastWord(String s) {
        String[] words = s.split("\\s+");
        if (words.length < 2) {
            return "Input string doesn't have enough words";
        }
        return words[words.length -2];
    }

    public void getWord(){
        String str =  "hello mofo";
        String findWord = findTheWord(str);
    }
    public String findTheWord(String s){
        String[] words = s.split("\\s+");
        return words[words.length -2];
    }
}
