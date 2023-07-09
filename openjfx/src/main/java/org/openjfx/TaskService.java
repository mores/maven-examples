package org.openjfx;

public class TaskService extends javafx.concurrent.Service<Void> {

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(TaskService.class);

	@Override
	protected javafx.concurrent.Task<Void> createTask() {

		log.debug("createTask");

		javafx.concurrent.Task<Void> task = new javafx.concurrent.Task<Void>() {

			@Override
			protected Void call() throws Exception {

				log.debug("call");

				for (int p = 0; p < 100; p++) {
					Thread.sleep(40);
					updateProgress(p, 100);
				}
				return null;
			}
		};
		return task;
	}
}
