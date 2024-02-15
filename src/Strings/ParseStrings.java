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
        return words[words.length - 2];
    }

    public void getWord() {
        String str = "hello mofo";
        String findWord = findTheWord(str);
        System.out.println(findWord);
    }

    public String findTheWord(String s) {
        String[] words = s.split("\\s+");
        return words[words.length - 2];
    }

    // get the letter index of a word
    public void getTheIndexOfWord() {
        String str = "Java Exercises";
        String target = word(str);
        System.out.println(target);
    }

    public String word(String str) {
        char words = str.charAt(10);
        return String.valueOf(words);
    }

    public void testConcat() {
        String s = "PHP Exercises and ";
        String p = "Python Exercises";
        String g = s.concat(p);
        System.out.println(g);
    }

    // compare two Strings
    public void testConcat2() {
        String a = "Comparing example.com and example.com";
        String b = "Comparing Example.com and example.com";
        boolean c = a.contentEquals(b);
        System.out.println("Answer: " + c);
    }

    public void testConcat3() {
        String a = "Comparing example.com and example.com ";
        String b = "Comparing Example.com and example.com ";
        StringBuilder stringBuilder = new StringBuilder(a);
        StringBuilder stringBuilder1 = new StringBuilder(b);
        ;
        System.out.println(a + stringBuilder + " : " + a.contentEquals(stringBuilder));
        System.out.println(b + stringBuilder1 + " : " + a.contentEquals(stringBuilder1));
    }
}
