import java.util.Arrays;

public class test {
    int solve (int[] array, int front, int back) {
        if(front > back) {
            return -1;
        }

        int mid = (front + back)/2;

        if(mid <= 0 || mid >= array.length -1) {
            return -1;
        }

        if((array[mid] >= array[mid-1]) && (array[mid] >= array[mid+1])) {
            return mid;
        }
        else if(array[mid-1] > array[mid]) {
            return solve(array, front, mid);
        }
        else {
            return solve(array, mid, back);
        }
    }
}
