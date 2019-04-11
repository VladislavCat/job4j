package ru.job4j.array;

public class Matrix {
    int[][] multiple(int size){
        int[][] table = new int[size][size];
        for(int i=0; i < table.length; i++) {
            for(int n=0; n < table.length; n++ ){
             table[i][n]=n*i;
            }
        }
        return table;
        }
    }
