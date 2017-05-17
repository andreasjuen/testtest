/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myCompany.test01JavaEE.controller;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@ViewScoped
@Named
public class ZufallszahlLayerController implements Serializable {
    
     public String doListZufallszahlen() {
        return Pages.list_zufallszahlLayer;
    }    
}