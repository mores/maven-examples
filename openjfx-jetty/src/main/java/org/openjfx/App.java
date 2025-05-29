package org.openjfx;

/**
 * JavaFX App
 */
public class App extends javafx.application.Application {

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(App.class);

	@Override
	public void start(javafx.stage.Stage stage) {

		log.info("start");

		javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(TrustAllSSLProvider.getSslSocketFactory());
		javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(TrustAllSSLProvider.getHostNameVerifier());

		javafx.scene.web.WebView webView = new javafx.scene.web.WebView();
		javafx.scene.web.WebEngine engine = webView.getEngine();

		engine.load("https://127.0.0.1:8443");
		engine.getLoadWorker().stateProperty().addListener((ov, oldState, newState) -> {
			System.err.println(engine.getLoadWorker().exceptionProperty());
		});

		javafx.scene.layout.VBox vBox = new javafx.scene.layout.VBox(webView);
		javafx.scene.Scene scene = new javafx.scene.Scene(vBox, 960, 600);

		stage.setScene(scene);
		stage.show();

	}
	public static void main(String[] args) {

		System.setProperty("javax.net.debug", "ssl");

		try {

			int httpsPort = 8443;

			org.eclipse.jetty.server.Server server = new org.eclipse.jetty.server.Server(8080);

			org.eclipse.jetty.server.HttpConfiguration httpConfiguration = new org.eclipse.jetty.server.HttpConfiguration();
			httpConfiguration.setSecureScheme("https");
			httpConfiguration.setSecurePort(httpsPort);

			org.eclipse.jetty.util.ssl.SslContextFactory.Server sslContextFactory = new org.eclipse.jetty.util.ssl.SslContextFactory.Server();
			sslContextFactory.setKeyStorePath("keystore.jks");
			sslContextFactory.setKeyStorePassword("password");
			org.eclipse.jetty.server.HttpConfiguration httpsConfiguration = new org.eclipse.jetty.server.HttpConfiguration(
					httpConfiguration);

			org.eclipse.jetty.server.SecureRequestCustomizer secureRequestCustomizer = new org.eclipse.jetty.server.SecureRequestCustomizer();
			secureRequestCustomizer.setSniHostCheck(false);
			httpsConfiguration.addCustomizer(secureRequestCustomizer);
			org.eclipse.jetty.server.ServerConnector httpsConnector = new org.eclipse.jetty.server.ServerConnector(
					server,
					new org.eclipse.jetty.server.SslConnectionFactory(sslContextFactory,
							org.eclipse.jetty.http.HttpVersion.HTTP_1_1.asString()),
					new org.eclipse.jetty.server.HttpConnectionFactory(httpsConfiguration));
			httpsConnector.setPort(httpsPort);
			server.addConnector(httpsConnector);

			org.eclipse.jetty.servlet.ServletContextHandler servletContext = new org.eclipse.jetty.servlet.ServletContextHandler(
					org.eclipse.jetty.servlet.ServletContextHandler.SESSIONS);
			servletContext.setBaseResource(org.eclipse.jetty.util.resource.Resource.newResource("src/main/webapp"));
			servletContext.setContextPath("/");
			servletContext.setWelcomeFiles(new String[]{"index.html", "welcome.html"});

			servletContext.setAttribute("fromMain", "passed in from Main");

			org.eclipse.jetty.servlet.ServletHolder holder = new org.eclipse.jetty.servlet.ServletHolder("default",
					org.eclipse.jetty.servlet.DefaultServlet.class);
			holder.setInitParameter("dirAllowed", "true");
			servletContext.addServlet(holder, "/");

			servletContext.addServlet(new org.eclipse.jetty.servlet.ServletHolder(new HelloServlet()), "/hello");

			server.setHandler(servletContext);

			server.start();

		} catch (Exception e) {
			java.io.StringWriter sw = new java.io.StringWriter();
			java.io.PrintWriter pw = new java.io.PrintWriter(sw);
			e.printStackTrace(pw);
			log.error("error: " + sw.toString());
		}

		launch();
	}
}
