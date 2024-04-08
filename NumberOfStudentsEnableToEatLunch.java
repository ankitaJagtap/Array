/**
 * Number Of Students Enable To Eat Lunch
 */
public class NumberOfStudentsEnableToEatLunch {

    public static int countStudents(int[] students, int[] sandwiches) {
        int oneCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == 1) {
                oneCount++;
            } else {
                zeroCount++;
            }
        }

        for (int i = 0; i < sandwiches.length; i++) {
            if (sandwiches[i] == 1 && oneCount > 0) {
                oneCount--;
            } else if (sandwiches[i] == 0 && zeroCount > 0) {
                zeroCount--;
            } else {
                break;
            }
        }
        return Math.max(oneCount, zeroCount);
    }

    public static void main(String[] args) {
        int[] students = { 1, 1, 0, 0 };
        int[] sandwitches = { 0, 0, 1, 1 };
        System.out.println(countStudents(students, sandwitches));
    }
}