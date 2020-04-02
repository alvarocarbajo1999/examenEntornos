/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenalvarocarbajo;

/**
 *
 * @author pablo
 */
public class prueba {

    public static int aProbar(int q) {
        int res = 0, i = 0;

        if (q < 0) {
            return 0;
        } else {
            while (i < q) {
                res = res + q;
                i++;
            }
        }
        return res;
    }
}
