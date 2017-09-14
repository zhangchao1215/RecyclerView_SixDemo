package jiyun.com.recyclerview_sixdemo;

/**
 * 项目名称: 城市通
 * 类描述:
 * 创建人: Administrator
 * 创建时间: 2017/7/24 16:35
 * 修改人:  张超
 * 修改内容:
 * 修改时间:
 */

public class ByteActivity {

    public static void main(String[] args) {
        byte a = 1;
        byte b = (byte) (a + 1);
        char c = '3';
        System.out.println(c);
        int[] str = {95, 55, 62, 59, 99};

        for (int i = 0; i < str.length - 1; i++) {
            for (int j = 0; j < str.length - i; j++) {
                int temp;
                if (str[j] < str[j + 1]) {
                    temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
            for (int i1 = 0; i1 < str.length; i1++) {
                System.out.println(str[i1]);

            }
        }


    }
}
