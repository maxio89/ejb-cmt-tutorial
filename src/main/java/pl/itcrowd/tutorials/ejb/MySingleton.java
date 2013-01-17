package pl.itcrowd.tutorials.ejb;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Startup
@Singleton
public class MySingleton {

    @PostConstruct
    public void onCreate() {


    }

}