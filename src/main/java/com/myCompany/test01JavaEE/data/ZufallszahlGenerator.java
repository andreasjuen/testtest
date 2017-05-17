/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myCompany.test01JavaEE.data;

import java.io.Serializable;
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Random;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@SessionScoped
@Named
public class ZufallszahlGenerator implements Serializable{

    private Random random;
    private int von;
    private int bis;

    public ZufallszahlGenerator() {
        this.random = new Random();
    }
    
    public int getRandomzahl() {
        int bereich = bis - von;
        return random.nextInt(bereich) + von;
    }

    public int getVon() {
        return von;
    }

    public int getBis() {
        return bis;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public void setVon(int von) {
        this.von = von;
    }
    
    
    
    

}


