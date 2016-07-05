package org.test;

import java.io.Serializable;
import javax.inject.Named;
import org.apache.deltaspike.core.api.scope.WindowScoped;

@Named
@WindowScoped
public class ListAllDataTable implements Serializable {
	private java.util.List attrs;

	public ListAllDataTable() {
		attrs = new java.util.Vector();

		for (int x = 0; x < 100; x++) {
			attrs.add(new SimpleAttribute(java.util.UUID.randomUUID()
					.toString()));
		}
		System.out.println("Number of attrs: " + attrs.size());
	}

	public java.util.List getAttrs() {
		return (attrs);
	}

	public String delete() {
		javax.faces.context.FacesContext.getCurrentInstance().addMessage(
				null,
				new javax.faces.application.FacesMessage(
						javax.faces.application.FacesMessage.SEVERITY_ERROR,
						"Admin Permission Required", "Delete Failure"));
		return null;
	}
}
