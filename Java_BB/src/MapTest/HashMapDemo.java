package MapTest;

import org.junit.Before;
import org.junit.Test;

import java.util.TreeMap;

/**
 * @author Charlie Puth
 * @version 1.0
 **/
public class HashMapDemo {
    // TreeMap有顺序 hashmap没有顺序
    private TreeMap<String,Object> treeMap;

    @Before
    public void before(){
        treeMap = new TreeMap<>();
    }

    @Test
    public void create(){
        treeMap.put("name","Curry");
        treeMap.put("age",32);
        treeMap.put("num",30);
        treeMap.put("score",22305);
        System.out.println(treeMap);

    }
    @Test
    public void receive(){
        this.create();
        System.out.println(treeMap.ceilingEntry("50"));
        System.out.println(treeMap.ceilingKey("31"));
        System.out.println(treeMap.higherEntry("31"));//heigher 没有等于就是大于
        System.out.println(treeMap.higherKey("31"));
        System.out.println(treeMap.floorEntry("31"));
        System.out.println(treeMap.floorKey("31"));
        System.out.println(treeMap.lowerEntry("31"));
        System.out.println(treeMap.lowerKey("31"));

        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry());
    }
    @Test
    public void intercept(){
        this.create();
        System.out.println(treeMap.headMap("33"));
        System.out.println(treeMap.tailMap("33"));
        System.out.println(treeMap.subMap("name","age"));//左闭右开

    }
}
