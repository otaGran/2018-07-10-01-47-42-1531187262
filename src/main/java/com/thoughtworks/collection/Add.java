package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.IntStream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        return IntStream.rangeClosed(Math.min(leftBorder, rightBorder), Math.max(leftBorder, rightBorder))
                .filter(number -> number % 2 == 0)
                .sum();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {

        int count = 0;
        for (int i = leftBorder; i < rightBorder; i++) {
            if (i % 2 != 0)
                count += i;
        }
        return count;

    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {

        int count = 0;
        for (int i : arrayList) {

            count += i;
        }
        return count + 2;

    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 != 0)
                arrayList.set(i, arrayList.get(i) * 3 + 2);
        }
        return arrayList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {

        throw new NotImplementedException();
    }

    public double getMedianOfEven(List<Integer> arrayList) {

        throw new NotImplementedException();
    }

    public double getAverageOfEven(List<Integer> arrayList) {

        int count = 0;
        int sum = 0;
        for (int i : arrayList) {
            if (i % 2 == 0)
                sum += i;
            count++;
        }
        return sum / count;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        return arrayList.indexOf(specialElment) % 2 == 0;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {


        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        throw new NotImplementedException();
    }
}
