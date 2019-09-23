package cn.rocker.lru;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author chengzc
 * @date 2019-09-23 16:44
 * @since
 */
public class LinkedHashMapTest {

    @Test
    public void testLinkedHashMap(){
        Map<String, String> linkedHashMap = new LinkedHashMap<>(3, 0.75f, true);
        linkedHashMap.put("1","one");
        linkedHashMap.put("2","one");
        linkedHashMap.put("3","one");
        linkedHashMap.put("4","one");

        System.out.println(linkedHashMap.get("3"));
        String eldestKey = linkedHashMap.entrySet().iterator().next().getKey();
        System.out.println(eldestKey);

        System.out.println(new ArrayList<>(linkedHashMap.entrySet()));
    }

    @Test
    public void testHashMap(){
        Map<String, String> hashMap = new HashMap<>(3, 0.75f);
        hashMap.put("1","one");
        hashMap.put("2","one");
        hashMap.put("3","one");
        hashMap.put("4","one");

        System.out.println(hashMap.get("3"));
        String eldestKey = hashMap.entrySet().iterator().next().getKey();
        System.out.println(eldestKey);

        System.out.println(new ArrayList<>(hashMap.entrySet()));
    }

}
