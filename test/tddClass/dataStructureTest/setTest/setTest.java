package tddClass.dataStructureTest.setTest;

import org.junit.jupiter.api.Test;
import tddClass.dataStructure.set.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class setTest {


    @Test
    public void addOneElementsSizeIsOneTest(){
        Set mySet = new Set();
        mySet.add("G-String");
        assertEquals(1, mySet.size());
    }

    @Test
    public void addXTwiceElemnentSizeIsOneTest(){
        Set mySet = new Set();
        mySet.add("G-String");
        mySet.add("G-String");
        assertEquals(1, mySet.size());
    }
}
