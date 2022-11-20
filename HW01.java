//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого 
//равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить 
//пользователя

public class HW01 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arrDiff = diffOfArr(arr1, arr2);
    }
    private static int[] diffOfArr(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null){
            throw new RuntimeException("Some array is null");
        }
        if (arr1.length != arr2.length){
            throw new RuntimeException("Always length isn't equal");
        }
        int[] arr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i] - arr2[i];
        }
        return arr;
        
    }
    
}

