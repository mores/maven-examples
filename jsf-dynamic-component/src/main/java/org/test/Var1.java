package org.test;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="var1")
@SessionScoped
public class Var1 implements Serializable {

    private String var;

    public Var1() {
	System.out.println( "init" );
    }

    public String getVar() {
	return var;
    }

    public void setVar( String v ) {
 	var = v;
    }
}
