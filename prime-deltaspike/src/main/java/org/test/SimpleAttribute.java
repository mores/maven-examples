package org.test;

public class SimpleAttribute implements java.io.Serializable {
	private Long id;

	private String description;

	private String discriminator;

	public SimpleAttribute() {
	}

	public SimpleAttribute(String d) {
		this.description = d;
	}

	public Long getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String d) {
		this.description = d;
	}

	public String getDiscriminator() {
		return discriminator;
	}

	public void setDiscriminator(String d) {
		this.discriminator = d;
	}
}
