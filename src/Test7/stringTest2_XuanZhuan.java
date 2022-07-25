package Test7;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/22 12:57
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
public class stringTest2_XuanZhuan {
    public static void main(String[] args) {
        String strA = "abcde";
        String strB = "cdeab";

        boolean flag = panduan(strA, strB);
        System.out.println(flag);
    }

    public static boolean panduan(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            str1 = rotate(str1);
            if (str1.equals(str2)) {
                return true;
            }
        }
        return false;

    }

    public static String rotate(String str) {
        char[] chars = str.toCharArray();//将字符串转换成字符数组
        char first = chars[0];//头部元素
        for (int i = 1; i < chars.length; i++) {
            chars[i - 1] = chars[i];//从下标为1开始依次前移一个单位
        }
        chars[chars.length - 1] = first;//把索引为0处的值添加到数组末尾
        return new String(chars);//把字符数组转换回字符串
    }
}
