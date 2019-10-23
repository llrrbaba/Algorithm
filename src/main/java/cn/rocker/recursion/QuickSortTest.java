package cn.rocker.recursion;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 快排
 * @author rocker
 * @date 2018/12/27 16:17
 * @since V1.0
 */
public class QuickSortTest {

    // 通过递归计算列表总和 START------------
    @Test
    public void testQuickSort(){
        List<Integer> list = Arrays.asList(76, 567, 678, 5, 890, 9, 32, 43, 234, 234, 5, 2342, 21, 5, 6423, 23, 43, 234, 354, 345);
        System.out.println(StringUtils.join(list));
        List<Integer> sortedList = quickSort(list);
        System.out.println(StringUtils.join(sortedList));
    }


    public List<Integer> quickSort(List<Integer> list){
        if(list.size() < 2){
            return list;//基线条件
        }

        int pivot = list.get(0);//递归条件

        List<Integer> subList = list.subList(1, list.size());
        List<Integer> smallerSubList = new ArrayList<>();//由所有小于等于基准值的元素组成的子集合
        List<Integer> biggerSubList = new ArrayList<>();//由所有大于基准值的元素组成的子集合
        for (Integer ele : subList) {
            if(ele <= pivot){
                smallerSubList.add(ele);
            }else{
                biggerSubList.add(ele);
            }
        }

        smallerSubList = quickSort(smallerSubList);
        smallerSubList.add(pivot);
        smallerSubList.addAll(quickSort(biggerSubList));
        return smallerSubList;

    }


    // 通过递归计算列表总和 END--------------

}
