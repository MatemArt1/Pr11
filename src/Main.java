public class Main {
    /*
    Move the first letter of each word to the end of it, then add "ay" to the end of the word.
    Leave punctuation marks untouched.
     */
    public class PigLatin {
        public static String pigIt(String str) {
            String[] words = str.split(" ");
            for (int i = 0; i < words.length; i++)
            {
                char f = words[i].charAt(0);
                if (((int)f >= 65 && (int)f <= 90) || ((int)f >= 97 && (int)f <= 122))
                    words[i] = words[i].substring(1) + f + "ay";
            }
            String str1 = "";
            for (int i = 0; i < words.length; i++)
            {
                str1 = str1 + words[i] + " ";
            }
            str1 = str1.substring(0, str1.length() - 1);
            return str1;
        }
    }

    public static void main(String[] args) {

    }
}