

public class Hamming {
    String firstString = "";
    String secondString = "";

    public Hamming(String s, String s1) {
        if (s.length() != s1.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        firstString = s;
        secondString = s1;
    }

    public int getHammingDistance() throws IllegalArgumentException {


        Integer hammingDistance = 0;
        if (firstString.length() == secondString.length()) {
            for (int i = 0; i <= firstString.length() - 1; i++) {
                if (firstString.charAt(i) != secondString.charAt(i)) {
                    hammingDistance++;
                }
            }


        }
        return hammingDistance;

}
}
