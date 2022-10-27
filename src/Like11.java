public class Like11 {
    public class PigLatin {
        public static String pigIt(String str) {
            return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
        }
    }
}
