package org.openjfx;

import java.sql.*;

public class JpaUtils {

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(JpaUtils.class);

	private jakarta.persistence.EntityManagerFactory emfactory;
	private jakarta.persistence.EntityManager entitymanager;

	public JpaUtils() {
		emfactory = jakarta.persistence.Persistence.createEntityManagerFactory("h2-eclipselink");

		entitymanager = emfactory.createEntityManager();
	}

	public void saveOrUpdate(Employee employee) {
		entitymanager.getTransaction().begin();
		entitymanager.merge(employee);
		entitymanager.getTransaction().commit();
	}

	public java.util.List<Employee> getEmployees() {
		jakarta.persistence.Query query = entitymanager.createQuery("Select e from Employee e");
		java.util.List<Employee> list = (java.util.List<Employee>) query.getResultList();

		return list;
	}

	public void close() {
		entitymanager.close();
		emfactory.close();
	}

}
