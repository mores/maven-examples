package org.openjfx;

public class About implements javafx.event.EventHandler<javafx.event.ActionEvent>
{
    @Override
    public void handle( javafx.event.ActionEvent event )
    {
	System.out.println("About Selected");
    }
}
