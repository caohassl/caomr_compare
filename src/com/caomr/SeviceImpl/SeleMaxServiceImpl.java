package com.caomr.SeviceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by icourt1 on 2018/4/23.
 */
public class SeleMaxServiceImpl {

    /**
     * 根据list产生最大值
     *
     * @param numberList
     * @return
     */
    public StringBuilder geneRet(List<String> numberList) {
        int i = 0;
        Double o1 = Double.parseDouble(numberList.get(0).split(" ")[1]);
        for (int j = 1; j < numberList.size(); j++) {
            Double o2 = Double.parseDouble(numberList.get(j).split(" ")[1]);
            if (o2.equals(o1)) {
                i++;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("最大值为");
        for (int j = 0; j <= i; j++) {
            sb.append(numberList.get(j) + ",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb;
    }

    public List genList(Double num1,Double num2,Double num3,Double num4,Double num5){
        List<String> numberList = new ArrayList<>();
        numberList.add("第一个数 " + num1);
        numberList.add("第二个数 " + num2);
        numberList.add("第三个数 " + num3);
        numberList.add("第四个数 " + num4);
        numberList.add("第五个数 " + num5);
        Collections.sort(numberList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                Double o1 = Double.parseDouble(s1.split(" ")[1]);
                Double o2 = Double.parseDouble(s2.split(" ")[1]);
                return o2 - o1 > 0 ? 1 : o2 - o1 == 0 ? 0 : -1;
            }
        });
        return numberList;
    }

}
