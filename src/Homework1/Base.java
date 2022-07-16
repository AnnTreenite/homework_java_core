package Homework1;

public class Base {
    public static void main(String[] args) {
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        String world1 = world.toLowerCase();
        String resultWorld = hi.trim() + world1 + '\n';
        String repeatedText = resultWorld.repeat(3);
        System.out.println(repeatedText);

        double weight = 55.3;
        double high = 1.7;
        double bodyIndex = weight / (high * high);
        System.out.println(bodyIndex);

        char[] word = new char[]{'a' ,'b' ,'c' ,'d' ,'e'};
        System.out.println(word);
        char[] word2 = word;
        word[3] = 'h';
        System.out.println(word2);
    }
}
