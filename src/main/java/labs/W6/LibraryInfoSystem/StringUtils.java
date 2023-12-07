package labs.W6.LibraryInfoSystem;

public class StringUtils {
    public static boolean search(String s, String src){
        return src.toLowerCase().contains(s.strip().toLowerCase());
    }
}
