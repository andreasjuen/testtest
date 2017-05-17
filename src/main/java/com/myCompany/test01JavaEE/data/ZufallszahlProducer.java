/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myCompany.test01JavaEE.data;

import com.myCompany.test01JavaEE.model.ZufallszahlenWert;
import com.myCompany.test01JavaEE.util.Events.Added;
import com.myCompany.test01JavaEE.util.Events.Deleted;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Observes;
import javax.inject.Named;

@SessionScoped
@Named
public class ZufallszahlProducer implements Serializable {

    private List<ZufallszahlenWert> zufallszahlenWerte;

    public ZufallszahlProducer() {

        generateZufallszahl();
    }

    public void generateZufallszahl() {
        ZufallszahlenWert zufallszahlenWert = new ZufallszahlenWert();
        zufallszahlenWert.setVon(1);
        zufallszahlenWert.setBis(10);
        zufallszahlenWert.setDatum(123456);
        zufallszahlenWert.setZufallszahl(4);

        ZufallszahlenWert zufallszahlenWert02 = new ZufallszahlenWert();
        zufallszahlenWert02.setVon(1);
        zufallszahlenWert.setBis(10);
        zufallszahlenWert.setDatum(123456);
        zufallszahlenWert.setZufallszahl(4);

        zufallszahlenWerte.add(zufallszahlenWert);
        zufallszahlenWerte.add(zufallszahlenWert02);
    }

    public List<ZufallszahlenWert> getZufallszahlenWerte() {
        return zufallszahlenWerte;
    }

    public void onCampaignAdded(@Observes @Added ZufallszahlenWert campaign) {
         getZufallszahlenWerte().add(campaign);
    }

    public void onCampaignDeleted(@Observes @Deleted ZufallszahlenWert campaign) {
         getZufallszahlenWerte().remove(campaign);
    }
    
    

}
