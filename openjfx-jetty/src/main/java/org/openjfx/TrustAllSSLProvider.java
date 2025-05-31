package org.openjfx;

import javafx.application.Application;
import javafx.concurrent.Worker;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import javax.net.ssl.*;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;

public class TrustAllSSLProvider {

	// Verify-all name verifier
	private final static HostnameVerifier hostNameVerifier = (hostname, session) -> true;

	// Trust-all socket factory
	private static final SSLSocketFactory sslSocketFactory;
	static {
		TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
			public java.security.cert.X509Certificate[] getAcceptedIssuers() {
				return null;
			}
			public void checkClientTrusted(X509Certificate[] certs, String authType) {
			}
			public void checkServerTrusted(X509Certificate[] certs, String authType) {
			}
		}};
		SSLContext sc;
		try {
			sc = SSLContext.getInstance("TLS");
		} catch (NoSuchAlgorithmException e) {
			throw new IllegalStateException(e);
		}
		try {
			sc.init(null, trustAllCerts, new java.security.SecureRandom());
		} catch (KeyManagementException e) {
			throw new IllegalStateException(e);
		}
		SSLContext.setDefault(sc);
		sslSocketFactory = sc.getSocketFactory();
	}

	public static HostnameVerifier getHostNameVerifier() {
		return hostNameVerifier;
	}

	public static SSLSocketFactory getSslSocketFactory() {
		return sslSocketFactory;
	}
}
