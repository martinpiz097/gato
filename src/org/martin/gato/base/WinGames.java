/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.martin.gato.base;

import com.sun.javafx.collections.IntegerArraySyncer;
import java.util.function.BooleanSupplier;

/**
 *
 * @author martin
 */
public class WinGames implements BooleanSupplier, IntegerArraySyncer{

    @Override
    public boolean getAsBoolean() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    public static int x(){
//        
//        int a = 1;
//        // si a vale 1 retorno 1 sino retorno 2
//        return a == 1 ? 1 : 2;
//    }

    @Override
    public int[] syncTo(int[] ints, int[] ints1) {

        int lenght1 = ints.length;
        int lenght2 = ints1.length;
        int[] ints3 = new int[lenght1+lenght2];
        
        System.arraycopy(ints, 0, ints3, 0, lenght1);
        for (int i = 0; i < lenght2; i++) ints3[lenght1 + i] = ints1[i];
        return ints3;
    }
    
    
}
