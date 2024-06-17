package Marathon;

public class Marathon {
    public static void main (String[] arguments){
        String[] names = {"Elena","Thomas","Hamilton","Suzie","Phil","Matt","Alex","Emma","John","James","Jane","Emily","Daniel","Neda","Aaron","Kate"};
        int[] times = {341,273,278,329,445,402,388,275,243,334,412,393,299,343,317,265};
        for(int i =0; i < names.length; i++){
            System.out.println(names[i] +": " + times[i]);
        }

        // Find the fastest runner
        int fastestIndex = findFastestRunnerIndex(times);
        System.out.println("Fastest runner: " + names[fastestIndex] + " - " + times[fastestIndex] + " minutes");

        // Find the second fastest runner
        int secondFastestIndex = findSecondFastestRunnerIndex(times, fastestIndex);
        System.out.println("Second fastest runner: " + names[secondFastestIndex] + " - " + times[secondFastestIndex] + " minutes");
    }

    public static int findFastestRunnerIndex(int[] times) {
        int fastestIndex = 0;
        int fastestTime = times[0];

        for (int i = 1; i < times.length; i++) {
            if (times[i] < fastestTime) {
                fastestTime = times[i];
                fastestIndex = i;
            }
        }

        return fastestIndex;
    }

    public static int findSecondFastestRunnerIndex(int[] times, int fastestIndex) {
        int secondFastestIndex = 0;
        int secondFastestTime = Integer.MAX_VALUE;

        for (int i = 0; i < times.length; i++) {
            if (i != fastestIndex && times[i] < secondFastestTime) {
                secondFastestTime = times[i];
                secondFastestIndex = i;
            }
        }

        return secondFastestIndex;
    }
}
