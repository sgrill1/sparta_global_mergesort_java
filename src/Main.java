import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arrayToSort = {38,27,43,3,9,82,10};
        MergeSorter sorter = new MergeSorter ();
        int[] sortedArray = sorter.sortArray (arrayToSort);
        System.out.println (Arrays.toString (sortedArray));
    }

}

