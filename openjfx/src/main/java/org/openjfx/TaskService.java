package org.openjfx;

public class TaskService extends javafx.concurrent.Service<Void> {

	@Override
	protected javafx.concurrent.Task<Void> createTask() {

		System.out.println("createTask");

		javafx.concurrent.Task<Void> task = new javafx.concurrent.Task<Void>() {

			@Override
			protected Void call() throws Exception {

				System.out.println("call");

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
