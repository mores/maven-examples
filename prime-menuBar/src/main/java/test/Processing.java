package org.test;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.faces.lifecycle.ClientWindowScoped;

@Named( "Processing" )
@ClientWindowScoped
public class Processing implements java.io.Serializable {

	private Integer progress;

	public Integer getProgress()
        {
                return progress;
        }

        public void setProgress( Integer progress )
        {
                this.progress = progress;
        }
	
	public void start()
	{
		int max  = 100000;
		for( int x = 1; x < max; x++ )
		{
			progress = (int)( (double)x / (double)max * 100.0 );

			try
			{
				Thread.sleep( 10 );
			}
			catch( Exception e )
			{
			}
		}

		progress = 100;
	}
}


