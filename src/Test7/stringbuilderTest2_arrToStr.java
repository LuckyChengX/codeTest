package Test7;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/20 20:35
 * @project_name TestAll
 */
public class stringbuilderTest2_arrToStr {
    public static void main(String[] args) {
        //定义一个方法把一个数组变成字符串输出

        int[] arr = {1, 2, 3};

        String str = arrToString(arr);
        System.out.println(str);
    }

    public static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {//如果当前元素是数组最后一个元素，就只拼接元素和"]"
                sb.append(arr[i]).append("]");
            } else {
                sb.append(arr[i]).append(",");//非最后一个元素加一个逗号
            }
        }
        return sb.toString();
    }
}
