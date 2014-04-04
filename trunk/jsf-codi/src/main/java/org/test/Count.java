package org.test;

import java.io.Serializable;
import javax.inject.Named;
import org.apache.myfaces.extensions.cdi.core.api.scope.conversation.WindowScoped;
//import org.apache.myfaces.extensions.cdi.core.api.scope.conversation.ConversationScoped;

@Named
@WindowScoped
//@ConversationScoped
public class Count extends Generic implements Serializable {

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

    public void addMyListener( javax.faces.event.ActionEvent ae )
    {
  	System.out.println( "addMyListener" );
        count++;
    }
}
