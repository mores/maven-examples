package org.test;

import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;

@Dependent
public class LifecycleProducer {

	@Produces
	@RequestScoped
	public javax.faces.lifecycle.Lifecycle produceLifecycle() {
		System.out.println(" LP   - - - - - - - - -");
		javax.faces.lifecycle.LifecycleFactory lFactory = (javax.faces.lifecycle.LifecycleFactory) javax.faces.FactoryFinder
				.getFactory(javax.faces.FactoryFinder.LIFECYCLE_FACTORY);
		return lFactory
				.getLifecycle(javax.faces.lifecycle.LifecycleFactory.DEFAULT_LIFECYCLE);
	}
}
