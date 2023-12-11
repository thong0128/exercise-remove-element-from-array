import java.util.Scanner;

public class ElementRemove {
    public static void main(String[] args) {
        int[] array = {9, 16, 5, 6, 14, 14, 17, 16, 11, 18};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elements in array: ");
        for (int j : array) {
            System.out.print(j + "\t");
        }
        System.out.println("");
        System.out.println("Enter element to be removed: ");
        int delElement = scanner.nextInt();
        int index = indexOf(array, delElement);
        if (index != -1) {
            removeElement(array, index);
        }else {
            System.out.println("Can't find element in array");
            System.exit(0);
        }
        System.out.print("Elements in array: ");
        for (int j : array) {
            System.out.print(j + "\t");
        }
    }
    public static int indexOf(int[] arr, int e) {
        if (arr == null)
            return -1;
        int len = arr.length;
        int i = 0;
        while (i < len) {
            if (arr[i] == e){
                return i;
            }
            i++;
        }
        return -1;
    }
    public static void removeElement(int[] arr, int index) {
        if (index == arr.length - 1) {
            arr[index] = 0;
        } else {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length -1] = 0;
        }
    }
}
