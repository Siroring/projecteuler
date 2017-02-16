package answers;

/**
 * Created by seok on 2017. 2. 16..
 *
 * Problem 12
 *
 * The sequence of triangle numbers is generated by adding the natural numbers.
 * So the 7th triangle number would be
 * 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 * Let us list the factors of the first seven triangle numbers:
 * 1: 1
 * 3: 1,3
 * 6: 1,2,3,6
 * 10: 1,2,5,10
 * 15: 1,3,5,15
 * 21: 1,3,7,21
 * 28: 1,2,4,7,14,28
 * We can see that 28 is the first triangle number to have over five divisors.
 * What is the value of the first triangle number
 * to have over five hundred divisors?
 */
public class Problem12 {
    public static void main(String[] args) {
        int triangleNum = 1;
        int count = 1;
        int factorsCount = 0;
        for (int i = 2; ; i++) {
            int triangleSqrt = (int) Math.sqrt(triangleNum);
            while (count <= triangleSqrt) {
                if (triangleNum % count == 0) {
                    factorsCount++;
                }
                count++;
            }
            factorsCount *= 2;
            if (triangleSqrt * triangleSqrt == triangleNum) {
                factorsCount--;
            }
            if (factorsCount >= 100) {
                break;
            }
            count = 1;
            factorsCount = 0;
            triangleNum += i;
        }
        System.out.println(triangleNum);
    }
}
