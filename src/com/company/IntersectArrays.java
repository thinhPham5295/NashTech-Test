package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntersectArrays {
    public List<Integer> intersectArrays1(int[] a, int[] b){
        List<Integer> rs = new ArrayList<>();
        for (int i =  0; i < a.length; i++){
            for(int j =  0; j < b.length; j++){
                if (a[i] == b[j]){
                    rs.add(a[i]);
                    break;
                }
            }
        }
        return rs;
    }

    public List<Integer> intersectArrays2(int[] as, int[] bs) {
        if (as.length <= bs.length) {
            return findIntersect(as, bs);
        } else {
            return findIntersect(bs, as);
        }
    }

    private List<Integer> findIntersect(int[] as, int[] bs){
        List<Integer> rs = new ArrayList<>();
        Map<Integer, Integer> map = IntStream.of(bs).boxed().collect(Collectors.toMap(i -> i, i -> i));
        for (int a : as) {
            if(map.containsKey(a)){
                rs.add(a);
            }
        }
        return rs;
    }

    public List<Integer> intersectArrays3(int[] a, int[] b){
        Set<Integer> s1 = IntStream.of(a).boxed().collect(Collectors.toSet());
        Set<Integer> s2 = IntStream.of(b).boxed().collect(Collectors.toSet());
        s1.retainAll(s2);
        return s1.stream().collect(Collectors.toList());
    }
}
