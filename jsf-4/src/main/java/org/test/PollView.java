package org.test;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@SessionScoped
@Named
public class PollView implements java.io.Serializable {

    private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( PollView.class );

    private int number;

    public PollView()
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
