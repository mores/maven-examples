package org.test;

import javax.jdo.annotations.FetchGroup;
import javax.jdo.annotations.FetchGroups;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import java.io.Serializable;

@Inheritance(strategy=InheritanceStrategy.NEW_TABLE)
@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable="true")
@FetchGroups({
        @FetchGroup(name="withWelcome", members = {@Persistent(name="welcome")})
        })
public class Header extends Base implements Serializable {

    @Persistent
    private String name;

    @Persistent
    private String value;

    private Welcome welcome;

    public Header() {
    }

    public Header(String name, String value) {
        this.name = name;
        this.value = value;
    }
	
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

   public Welcome getWelcome() {
	return welcome;
   }

   public void setWelcome( Welcome welcome ) {
	this.welcome = welcome;
   }
}
