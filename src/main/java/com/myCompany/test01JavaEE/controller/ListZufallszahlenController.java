
package com.myCompany.test01JavaEE.controller;

import com.myCompany.test01JavaEE.data.ZufallszahlProducer;
import com.myCompany.test01JavaEE.model.ZufallszahlenWert;
import com.myCompany.test01JavaEE.util.Events.Deleted;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import javax.enterprise.event.Event;
import javax.faces.view.ViewScoped;

@ViewScoped
@Named
public class ListZufallszahlenController implements Serializable {

    @Inject
    private ZufallszahlProducer campaignProducer;

    private ZufallszahlenWert zufallszahlenWert;
    
    @Inject @Deleted
    private Event<ZufallszahlenWert> zufallszahlenWertEvent;

    public void doDeleteZufallszahlenWert(ZufallszahlenWert zufallszahlenWert) {
        this.zufallszahlenWert = zufallszahlenWert;
        System.out.println("Aktion zum löschen vorgemerkt");
    }

    public void commitDeleteCampaign() {
        zufallszahlenWertEvent.fire(zufallszahlenWert);
    }
}
