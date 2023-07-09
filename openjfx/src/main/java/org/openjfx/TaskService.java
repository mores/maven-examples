package org.openjfx;

public class TaskService extends javafx.concurrent.Service<Void> {

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(TaskService.class);

	private Model model;

	public TaskService(Model model) {
		this.model = model;
	}

	@Override
	protected javafx.concurrent.Task<Void> createTask() {

		log.debug("createTask");

		javafx.concurrent.Task<Void> task = new javafx.concurrent.Task<Void>() {

			@Override
			protected Void call() throws Exception {

				log.debug("call");

				try {
					for (ColorPlus colorPlus : model.getColorsProperty()) {
						for (int p = 0; p < 20; p++) {
							Thread.sleep(40);
							updateProgress(p, 100);
						}

						colorPlus.setComplete(true);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				return null;
			}
		};
		return task;
	}
}
