
/*已知一个数组 arr = {19, 28, 37, 46, 50}; 用程序实现把数组中的元素值交换，
    交换后的数组 arr = {50, 46, 37, 28,
        19}; 并在控制台输出交换后的数组元素。*/
public class Demo01 {
    public static void main(String[] args) {
        int[] arr1 = {19,28,37,46,50};
        for (int i = 0; i < arr1.length; i++) {
            for (int i1 = arr1.length-1; i1 < arr1.length; i1--) {
                if( i != i1 && i<i1){
                    int temp = arr1[i];
                    arr1[i] = arr1[i1];
                    arr1[i1] =  temp;
                    break;
                }
            }
        }
        for (int i : arr1) {
            System.out.println(i);
        }
    }
}
