package org.test;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import java.io.Serializable;

@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable="true")
public class Base implements Serializable {

    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Integer id;

    public Base() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer i) {
	this.id = i;
    }
}
