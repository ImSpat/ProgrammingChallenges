package FindMaxAndMinValuesExercise;

//  Your task is to make two functions, max and min, that receive a list of integers as input,
//  and return the largest and lowest number in that list, respectively.
//  Examples (Input -> Output)
//        * [4,6,2,1,9,63,-134,566]         -> max = 566, min = -134
//        * [-52, 56, 30, 29, -54, 0, -110] -> min = -110, max = 56
//        * [42, 54, 65, 87, 0]             -> min = 0, max = 87
//        * [5]                             -> min = 5, max = 5

public class FindMaxAndMinValues {
    public int min(int[] list) {
        int min=list[0];
        for (int i = 0; i <= list.length-1; i++) {
            if(min > list[i]){
                min = list[i];
            }
        }
        return min;
    }

    public int max(int[] list) {
        int max = list[0];
        for (int i = 0; i <= list.length-1; i++) {
            if(max < list[i]){
                max = list[i];
            }
        }
        return max;
    }
}
