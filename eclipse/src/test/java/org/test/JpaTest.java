package org.test;

import org.junit.Test;

public class JpaTest {
    private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(JpaTest.class);

    @Test
    public void testOne() throws Exception {
        log.info("test");

        jakarta.persistence.EntityManagerFactory emfactory = jakarta.persistence.Persistence
                .createEntityManagerFactory("h2-eclipselink");
        jakarta.persistence.EntityManager entitymanager = emfactory.createEntityManager();

        jakarta.persistence.Query query = entitymanager.createQuery("Select a from A a");
        java.util.List<A> list = (java.util.List<A>) query.getResultList();
        for (A a : list) {
            log.info(a.getId() + "\t" + a.getS());
        }

        S s1 = new S(1);

        entitymanager.getTransaction().begin();
        entitymanager.merge(s1);
        entitymanager.getTransaction().commit();

        S s2 = new S(2);

        entitymanager.getTransaction().begin();
        entitymanager.merge(s2);
        entitymanager.getTransaction().commit();

        A a1 = new A(1, s1);

        entitymanager.getTransaction().begin();
        entitymanager.merge(a1);
        entitymanager.getTransaction().commit();

        A a2 = new A(2, s2);

        entitymanager.getTransaction().begin();
        entitymanager.merge(a2);
        entitymanager.getTransaction().commit();

        query = entitymanager.createQuery("Select a from A a");
        list = (java.util.List<A>) query.getResultList();
        for (A a : list) {
            log.info(a.getId() + "\t" + a.getS());
        }
    }

}
