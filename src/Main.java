//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        test t = new test();

        int[] testCase = {0,3,2,3,0};

        if(testCase.length < 3) {
            System.out.println("not possible as array length < 3");
        }
        else {
            System.out.println(t.solve(testCase, 0, testCase.length-1));
        }

    }
}