package org.test;

import javax.faces.event.ActionEvent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="count")
@SessionScoped
public class Count {
    Integer count = 0;

    public Integer getCount() {
        return count++;
    }

    public void reset(ActionEvent ae) {
        count = 0;
    }
}
