package MapTest;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Set;

/**
 * @author Charlie Puth
 * @version 1.0
 **/
public class HashDemo1 {
    private HashMap<String,Object> hashMap;
    @Before
    public void before(){
        hashMap = new HashMap<>(5);
    }

    @Test
    public void create(){
        hashMap.put("name","zhangsan");
        hashMap.put("age",20);
        hashMap.put("num",20181220);
        hashMap.put("gender","male");
        System.out.println(hashMap);
    }
    @Test
    public void receive(){
        this.create();
        System.out.println(hashMap.get("name"));
        System.out.println(hashMap.containsKey("name"));
        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.size());
        System.out.println(hashMap.values());
        System.out.println(hashMap.keySet());
    }
    @Test
    public void delete(){
        this.create();
        hashMap.remove("age");
        hashMap.clear();
    }
    @Test
    public void iterator(){
        this.create();
        Set<String> keys = hashMap.keySet();
        for (String key : keys){
            System.out.println(key+":"+hashMap.get(key));
        }
    }
}
