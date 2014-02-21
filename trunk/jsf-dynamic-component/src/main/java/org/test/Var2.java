package org.test;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="var2")
@SessionScoped
public class Var2 implements Serializable {

    private String var;

    public Var2() {
	System.out.println( "init" );
    }

    public String getVar() {
	return var;
    }

    public void setVar( String v ) {
 	var = v;
    }
}
