/**
 * Copyright (C), 2015-2019, XXX有限公司
 * Author:   cheng
 * Date:     2019/12/30 10:24
 * Description: 直接插入排序法
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jacob.sort;

/**
 * 〈一句话功能简述〉<br>
 * 〈直接插入排序法〉
 *
 * @author GuanBinChen
 * @create 2019/12/30
 * @since 1.0.0
 */
public class InsertSort {

    public static void insertSort(int[] data) {
        System.out.println("开始排序");
        int arrayLength = data.length;
        for (int i = 1; i < arrayLength; i++) {
            //令temp等于第二个数组的值
            int temp = data[i];
            //如果后一项比前一项要小
            if (data[i] - data[i - 1] < 0) {
                int j = i - 1;
                for (; j >= 0 && data[j] - temp > 0; j--) {
                    data[j + 1] = data[j];
                }
                data[j + 1] = temp;
            }
            System.out.println(java.util.Arrays.toString(data));
        }

    }

    public static void main(String[] args) {
        int[] data = {9, -16, 21, 23, -30, -49, 21, 30, 30};
        System.out.println("排序之前：\n" + java.util.Arrays.toString(data));
        insertSort(data);
        System.out.println("排序之后：\n" + java.util.Arrays.toString(data));
    }
}
