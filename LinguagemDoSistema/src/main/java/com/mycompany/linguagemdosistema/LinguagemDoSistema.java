/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.linguagemdosistema;

import java.util.Locale;

/**
 *
 * @author Adelton Silva
 */
public class LinguagemDoSistema {

    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.print("o seu sistema esta em ");
        System.out.println(loc.getDisplayLanguage());
        System.out.println(loc.getLanguage());
    }
}
