package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;

class IntersectArraysTest {
    //Given
    int[] a = {2,3,4,5,7,9,10,15,20,21,22,25,29,30};
    int[] b = {1,4,6,7,11,15,19,21,22,25,26,27,28,29};

    @Test
    void intersectArrays1() {
        //When
        IntersectArrays i = new IntersectArrays();
        List<Integer> rs = i.intersectArrays1(a,b);
        //Then
        List<Integer> expectedRs = Arrays.asList(4,7,15,21,22,25,29);
        Assert.assertThat(rs,is(expectedRs));
    }

    @Test
    void intersectArrays2() {
        //When
        IntersectArrays i = new IntersectArrays();
        List<Integer> rs = i.intersectArrays2(a,b);
        //Then
        List<Integer> expectedRs = Arrays.asList(4,7,15,21,22,25,29);
        Assert.assertThat(rs,is(expectedRs));
    }

    @Test
    void intersectArrays3() {
        //When
        IntersectArrays i = new IntersectArrays();
        List<Integer> rs = i.intersectArrays3(a,b);
        //Then
        List<Integer> expectedRs = Arrays.asList(4,7,15,21,22,25,29);
        Assert.assertThat(rs,is(expectedRs));
    }
}