package org.test;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="count")
@SessionScoped
public class Count implements Serializable {

    private Integer count = 0;

    public Count() {
	System.out.println( "init" );
    }

    public Integer getCount() {
	return count;
    }

    public void setCount( Integer i ) {
 	count = i;
    }

    public String add() {
	System.out.println( "adding" );
        count++;

	return "home";
    }

    public String reset() {
        count = 0;

	return "home";
    }
}
