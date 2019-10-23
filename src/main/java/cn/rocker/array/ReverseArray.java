package cn.rocker.array;

/**
 * @author rocker
 * @date 2019/10/23 20:43
 * @since V1.0
 */
public class ReverseArray {

    //实现数组元素的翻转
    public static int[] reverse(int[] arr) {
        //遍历数组
        for (int i = 0; i < arr.length / 2; i++) {
            //交换元素 因为i从0开始所以这里一定要再减去1
            int temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = temp;
        }
        //返回反转后的结果
        return arr;
    }

    public static void main(String[] args) {
        //测试反转方法
        int[] arr = new int[]{10, 20, 30, 40, 50, 60, 70};
        for (int elem : arr) {
            System.out.print(elem + ",");
        }
        //打印反转后的元素
        arr = reverse(arr);
        System.out.println();
        for (int elem : arr) {
            System.out.print(elem + ",");
        }
    }

}
