
//Реализуйте метод, принимающий в качестве аргументов двумерный массив в двумерный массив, метод должен проверить что длина строк и 
// столбцов с одинаковыми индексами одинковы

public class TASK04 {
    public static void main(String[] args) {
        int[][] arr= {{1, 2, 3}, {4, 5, 6}, {7, 8 ,9}};
        checkArr(arr);
    }
    public static void checkArr(int[][] arr) {
        if (arr == null) {
            throw new RuntimeException("Array is null");
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != arr[i].length){
                throw new RuntimeException("Line not equals row");
            }
        }
    }
}
