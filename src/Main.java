import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String animale = "Leone";
        if (animali().contains(animale)) {
            System.out.println(animali());
        }
    }
    public static HashSet<String> animali() {
        HashSet<String> animali = new HashSet<>();
        animali.add("Leone");
        animali.add("Tigre");
        animali.add("Orso");
        return animali;
    }
}