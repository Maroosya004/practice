public class Tree {
    public static void main(String[] args) {
        int[] nums = new int[1000];
        int firstBorder = 0;
        int secondBorder = 1000;
        int targetNumber = 127;
        int guess = (firstBorder + secondBorder) / 2;
        while (guess != targetNumber) {
            if (targetNumber < guess) { // tN<(0+1000)/2
                secondBorder = guess; // sB = 1000/2=500, fB=0
            } else {
                firstBorder = guess; // fB=500, sB=1000
            }
            guess = (firstBorder + secondBorder)/2;
            System.out.println("Current guess equals " + guess);
        }
    }
}
