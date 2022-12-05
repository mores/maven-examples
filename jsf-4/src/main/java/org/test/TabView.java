package org.test;

import jakarta.annotation.PostConstruct;
import jakarta.faces.lifecycle.ClientWindowScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ClientWindowScoped
@Named
public class TabView implements java.io.Serializable {

    private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( TabView.class );

    private int number;

    public TabView()
    {
        log.info( "init" );
    }

    @PostConstruct
    public void postConstruct()
    {
        log.info( "postConstruct" );
    }

    public void increment() {
        log.info( "increment" );
        number++;
    }

    public int getNumber() {
        log.info( "getNumber" );
        return number;
    }
}
