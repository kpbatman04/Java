package collection;

import java.util.ArrayList;
import java.util.List;

public class TestinfList {
    public static void main(String[] args) {
        //genericas are COmpile time ont run time
        List<String> strList = new ArrayList<>();// in old has to also define on right but now it is ok not to do so
        // in <> Integer is right not int, so there must be wrapper class
        strList.add("krish");
        strList.add("Prajapati");
        strList.add(1,"SB");
        strList.remove(1);
//        strList.add(55);

        if(strList.contains("Prajapati")){
            System.out.println("prajapati exists .");
            System.out.println(strList.indexOf("Prajapati"));
        }
        System.out.println(strList.get(0));
        for (int i = 0;i<strList.size() ; i++){
            System.out.print(" "+strList.get(i));
        }
        for (String s : strList) {
            System.out.println(s);
        }
    }
}
