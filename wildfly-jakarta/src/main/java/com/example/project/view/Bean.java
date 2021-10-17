package com.example.project.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.project.model.Message;
import com.example.project.service.MessageService;

import org.apache.deltaspike.core.api.scope.WindowScoped;

@Named
@WindowScoped
public class Bean implements java.io.Serializable {

	private Message message = new Message();
	private List<Message> messages;

	@Inject
	private org.slf4j.Logger logger;

	@Inject
	private MessageService messageService;

	private String tenant;

	@PostConstruct
	public void init() {

		tenant = "even";

		logger.debug("Initiated @PostConstruct method. Tenant is: " + tenant);
		messages = messageService.list(tenant);
	}

	public void submit() {
		logger.trace("submit: " + message.getText());
		messageService.create(tenant, message);
		messages.add(message);
		message = new Message();
	}

	public Message getMessage() {
		return message;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public String getTenant() {
		return tenant;
	}

	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	public void changeTenant(javax.faces.event.AjaxBehaviorEvent event) {
		logger.debug("Changed tenant to: " + tenant);
		messages = messageService.list(tenant);
	}
}
