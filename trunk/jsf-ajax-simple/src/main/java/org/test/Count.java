package org.test;

import javax.faces.event.ActionEvent;

public class Count {
    Integer count = 0;

    public Integer getCount() {
        return count++;
    }

    public void reset(ActionEvent ae) {
        count = 0;
    }
}
