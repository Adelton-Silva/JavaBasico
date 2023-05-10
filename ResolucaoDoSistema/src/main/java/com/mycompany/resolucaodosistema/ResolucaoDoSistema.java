/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.resolucaodosistema;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Adelton Silva
 */
public class ResolucaoDoSistema {

    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A dimensao da tela e " + d.width +" X "+ d.height);
        System.out.println("");
            
    }
}
