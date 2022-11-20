//Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
// Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе - длину массива.

public class TASK01 {
    static final int INDEX = 12;
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println(findNumber(arr));
    }
    private static int findNumber(int[] arr) {
        if (arr.length < INDEX) {
            return -1;
        }
        return arr.length;
    }
}