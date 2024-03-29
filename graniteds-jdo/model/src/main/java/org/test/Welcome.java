package org.test;

import javax.jdo.annotations.Element;
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
	@FetchGroup(name="withHeaders", members = {@Persistent(name="headers")})
	})
public class Welcome extends Base implements Serializable {

    @Persistent
    private String name;

    @Persistent
    @Element(types=org.test.Header.class, dependent="true",mappedBy="welcome")
    private java.util.List<Header> headers = new java.util.Vector();

    public Welcome() {
    }

    public Welcome(String name) {
        this.name = name;
    }
	
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public java.util.List<Header> getHeaders() {
	return headers;
    }

    public void setHeaders( java.util.List<Header> headers ) {
	this.headers = headers;
    }
}
