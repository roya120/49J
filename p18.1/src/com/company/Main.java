package com.company;

import javafx.util.Pair;

import java.util.ArrayList;

public class Main {

    public static <T extends Measurable> Pair<T, T> minmax(T[] myArray) {
        T min = myArray[0], max = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i].getMeasure() > max.getMeasure()) {
                max = myArray[i];
            }
            if (myArray[i].getMeasure() < min.getMeasure()) {
                min = myArray[i];
            }
        }
        return new Pair<>(min, max);
    }

    public static void main(String[] args) {
        Measurable[] arry = {
                new Measurable() {
                    @Override
                    public double getMeasure() {
                        return 3;
                    }
                },
                new Measurable() {
                    @Override
                    public double getMeasure() {
                        return 45;
                    }
                },
                new Measurable() {
                    @Override
                    public double getMeasure() {
                        return 90;
                    }
                },
                new Measurable() {
                    @Override
                    public double getMeasure() {
                        return 100;
                    }

                },
                new Measurable() {
                    @Override
                    public double getMeasure() {
                        return 1;
                    }
                }
        };
        Pair<Measurable, Measurable> pair = minmax(arry);

        System.out.println("The min in the array is : " + pair.getKey().getMeasure());
        System.out.println("The max in the array is : " + pair.getValue().getMeasure());
    }
}