/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dustintsan.math.util.swt301;

/**
 *
 * @author Admin
 */
public class MathUtilitySWT {

     public int calculateFibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be greater than 0");
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        
 
        return calculateFibonacci(n-1) + calculateFibonacci(n-2);
    }
}