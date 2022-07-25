package Test7;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/22 14:24
 * @project_name TestAll
 */

/*
 * 给你一个字符串 str，由若干个单词组成，单词前后由空格字符隔开。
 * 返回字符串中最后一个单词的长度。
 *
 * 实例，str = "hello world";
 * 输出: 5
 * 解释: 最后一个单词"world" 长度为5
 * */
public class stringTest_countLast {
    public static void main(String[] args) {

        String str = "fuck you";
        System.out.println("最后一个字符串的长度为 " + countLastStr(str));
    }

    public static int countLastStr(String str) {
        int count = 0;
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                return count;
            } else count++;
        }
        return count;
    }
}
