package tddClass.dataStructure.set;

import tddClass.arrayList.ArrayList;
import tddClass.dataStructure.list.List;

public class Set {

    List elements = new ArrayList();

    public void add(String element){
        elements.add(element);
    }

    public int size(){
        return elements.size();
    }
}
