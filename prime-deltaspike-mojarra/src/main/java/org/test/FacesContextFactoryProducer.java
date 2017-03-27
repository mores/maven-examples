package org.test;

import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;

@Dependent
public class FacesContextFactoryProducer {

	@Produces
	@RequestScoped
	public javax.faces.context.FacesContextFactory produceFacesContextFactory() {
		System.out.println(" FCFP - - - - - - - - - -");
		javax.faces.lifecycle.LifecycleFactory lFactory = (javax.faces.lifecycle.LifecycleFactory) javax.faces.FactoryFinder
				.getFactory(javax.faces.FactoryFinder.LIFECYCLE_FACTORY);
		System.out
				.println("lFactory: " + lFactory + "\t" + lFactory.getClass());

		javax.faces.context.FacesContextFactory facesContextFactory = (javax.faces.context.FacesContextFactory) javax.faces.FactoryFinder
				.getFactory(javax.faces.FactoryFinder.FACES_CONTEXT_FACTORY);

		System.out.println("facesContextFactory: " + facesContextFactory + "\t"
				+ facesContextFactory.getClass());

		return facesContextFactory;
	}
}
