package firstSteps;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "yoyoyo")
public class HelloWorldRepresentation {

	@JacksonXmlProperty(localName = "hello")	
	private String hello;

	public String getHello() {
		return "world";
	}
}
