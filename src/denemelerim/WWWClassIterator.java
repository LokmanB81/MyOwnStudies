package denemelerim;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class WWWClassIterator {
    public static void main(String[] args) {
        String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String [] pickNameSplit=pickName.split("");
       List<String> pickNameList=new ArrayList<>();

        for (String each:pickNameSplit
             ) {
            pickNameList.add(each);

        }
        System.out.println(pickNameList);
      //
        Iterator it1= (Iterator) pickNameList.iterator();
        String temp;

        while (it1.hasNext()){
            temp=(String) it1.next();
            if(temp.equals("A")){
                System.out.print(temp);
            }
        }
    }
}
