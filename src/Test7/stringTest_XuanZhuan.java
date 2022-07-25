package Test7;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/21 21:33
 * @project_name TestAll
 */

/*
 * 给定两个字符串，A 和 B
 * A 的旋转就是将A最左边的字符移动到最右边。
 * 例如：，若A = 'abcde'，在一次移动后的结果是'bcdea'
 *
 * 如果在若干次调整操作之后，，A能变成B，那么返回true.
 * 如果不能匹配成功，则返回false.
 *
 *
 * 本题思路有2种
 * 思路1：使用substracte()方法来截取；
 * 思路2: 先把字符串变成字符数组，再进行处理。
 * */
public class stringTest_XuanZhuan {
    public static void main(String[] args) {

        String strA = "abcde";
        String strB = "cdeab";

        boolean flag = panduan(strA, strB);
        System.out.println(flag);


    }

    public static boolean panduan(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            str1 = subStr(str1);
            if (str1.equals(str2)) {
                return true;
            }
        }
        return false;

    }

    public static String subStr(String str) {
        char first = str.charAt(0);//得到头部元素
        String body = str.substring(1);//得到从下标1开始的所有元素
        return body + first;//拼接
    }
}
