public class swaptwovariables {
    public static void main(String[] args) {
        int first = 10;
        int second = 20;
        System.out.println("Before swapping: First = " + first + ", Second = " + second);
        int temp = first;
        first = second;
        second = temp;
        System.out.println("After swapping: First = " + first + ", Second = " + second);
    }
}