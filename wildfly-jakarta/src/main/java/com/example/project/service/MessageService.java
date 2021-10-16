package com.example.project.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import com.example.project.model.Message;

@Stateless
public class MessageService {

	@PersistenceContext(unitName = "EvenPersistenceUnit")
	private EntityManager entityManagerEven;

	@PersistenceContext(unitName = "OddPersistenceUnit")
	private EntityManager entityManagerOdd;

	private EntityManager getEntityManager(String multitenancyIdentifier) {

		if ("even".equals(multitenancyIdentifier)) {
			return entityManagerEven;
		} else if ("odd".equals(multitenancyIdentifier)) {
			return entityManagerOdd;
		}

		return entityManagerEven;
	}

	public void create(String multitenancyIdentifier, Message message) {
		getEntityManager(multitenancyIdentifier).persist(message);
	}

	public List<Message> list(String multitenancyIdentifier) {
		return getEntityManager(multitenancyIdentifier).createQuery("FROM Message m", Message.class).getResultList();
	}
}
