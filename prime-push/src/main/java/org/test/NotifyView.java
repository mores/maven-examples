package org.test;
 
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.apache.commons.lang.StringEscapeUtils;
import org.primefaces.push.EventBus;
import org.primefaces.push.EventBusFactory;
 
@ManagedBean
@RequestScoped
public class NotifyView {

    private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( NotifyView.class );
     
    private final static String CHANNEL = "/notify";
     
    private String summary;
     
    private String detail;
     
    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
     
    public String getDetail() {
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }
     
    public void send() {
        EventBus eventBus = EventBusFactory.getDefault().eventBus();
	log.trace( "EventBus: " + eventBus );
        eventBus.publish(CHANNEL, new FacesMessage(StringEscapeUtils.escapeHtml(summary), StringEscapeUtils.escapeHtml(detail)));
    }
}
