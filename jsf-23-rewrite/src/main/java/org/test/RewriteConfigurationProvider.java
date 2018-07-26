package org.test;

import org.ocpsoft.rewrite.config.*;
import org.ocpsoft.rewrite.servlet.config.*;
import org.ocpsoft.rewrite.servlet.config.rule.*;
import org.ocpsoft.rewrite.faces.config.*;
import javax.faces.event.PhaseId;
import org.ocpsoft.rewrite.el.El;

import org.ocpsoft.rewrite.annotation.RewriteConfiguration;

@RewriteConfiguration
public class RewriteConfigurationProvider extends org.ocpsoft.rewrite.servlet.config.HttpConfigurationProvider
{
	@Override
	public int priority()
	{
		return 10;
	}

	@Override
	public org.ocpsoft.rewrite.config.Configuration getConfiguration( final javax.servlet.ServletContext context )
	{
		return org.ocpsoft.rewrite.config.ConfigurationBuilder.begin()
		        .addRule().when( Path.matches( "/name/{name}" ) )
		        .perform( PhaseAction.retrieveFrom( org.ocpsoft.rewrite.el.El.retrievalMethod( "#{BackingBean.action}" ) )
		                .after( PhaseId.RESTORE_VIEW )
		                .and( Forward.to( "/test.xhtml" ) ) )
		        .where( "name" ).bindsTo( PhaseBinding.to( org.ocpsoft.rewrite.el.El.property( "#{BackingBean.name}" ) )
		                .after( PhaseId.RESTORE_VIEW ) );
	}
}
