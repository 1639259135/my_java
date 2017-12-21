package bubble;

public class Test {
    public static void main(String[] args) {
        int[] array = {2,3,5,4,1} ;

        for (int i = 0; i < array.length; i ++){
            for (int j = 0; j < array.length - 1; j ++){
                if (array[j] > array[j + 1]){
                    int c = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = c;
                }
            }
        }
        for (int i = 0; i < array.length; i ++){
            System.out.print(array[i]);
        }
    }

}
