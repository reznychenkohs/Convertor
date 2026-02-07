package NamesList;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {
    public List<String> getData() {
        List<String> list = new ArrayList<>();
        list.add("Anna");
        list.add("Bob");
        list.add("Lucy");
        list.add("Denis");
        list.add("Tom");
        return list;
    }
}
