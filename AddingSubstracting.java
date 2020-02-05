public class AddingSubstracting {
    public static void main(String[] arg) {
        double creditsEarned = 100;
        double creditsNeeded = 250;
        double creditsToGraduate = creditsNeeded - creditsEarned;
        System.out.println(creditsToGraduate);
        System.out.println(creditsNeeded > creditsEarned);
        int songsA = 9;
        int songsB = 9;
        int albumLengthA = 41;
        int albumLengthB = 53;
        boolean sameNumberOfSongs = songsA == songsB;
        boolean differentLength = albumLengthA != albumLengthB;
        System.out.println(sameNumberOfSongs);
        System.out.println(differentLength);
        String name = "Lotty";
        String otherName = "Martino";
        System.out.println(name.equals(otherName));
    }
}