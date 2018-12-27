package cn.rocker.recursion;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 递归算法
 * @author rocker
 * @date 2018/12/27 12:35
 * @since V1.0
 */
public class RecursionTest {

    // 通过递归计算列表总和 开始------------
    @Test
    public void testSum(){
        int sum = getSum(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(sum);
    }

    public int getSum(List<Integer> list){
        if(list.size() == 0){
            return 0;
        }
        return list.get(0) + getSum(list.subList(1, list.size()));
    }
    // 通过递归计算列表总和 结束------------


    // 编写一个递归函数来计算列表包含的元素数 START------------
    @Test
    public void testLength(){

        //TODO 待实现

    }

    // 编写一个递归函数来计算列表包含的元素数 END------------


    // 找出列表中最大的数字 START------------
    @Test
    public void testMax(){
        int max = getMax(Arrays.asList(1, 0, 3, 742, 5, 6, 4356, 8, 853, 10, 31, 12, 23, 45, 78, 902));
        System.out.println(max);
    }

    public int getMax(List<Integer> list){
        if(list.size() == 2){
            return list.get(0)>list.get(1)?list.get(0):list.get(1);
        }

        int max = getMax(list.subList(1, list.size()));
        return list.get(0)>max?list.get(0):max;
    }
}
