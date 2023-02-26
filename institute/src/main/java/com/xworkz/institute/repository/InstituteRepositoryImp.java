package com.xworkz.institute.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xworkz.institute.entity.InstituteEntity;

@Repository
public class InstituteRepositoryImp implements InstituteRepository {

	@Autowired
	EntityManagerFactory entityManagerFactory;

	public InstituteRepositoryImp() {
		System.out.println("this is InstituteServiceImp");
	}

	@Override
	public boolean saveDTO(InstituteEntity entity) {
		System.out.println("this is service method running in InstituteServiceImp");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		System.out.println(entity);
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}

	@Override
	public InstituteEntity findById(int id) {
		System.out.println("find by ID method");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		InstituteEntity data = entityManager.find(InstituteEntity.class, id);
		entityManager.close();

		return data;
	}

	@Override
	public InstituteEntity findByName(String instituteName) {
		System.out.println("find by Name method");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		// EntityTransaction transaction= entityManager.getTransaction();
		Query query = entityManager.createNamedQuery("findByName");
		Object obj = query.getSingleResult();
		InstituteEntity entity = (InstituteEntity) obj;

		System.out.println(entity);
		entityManager.close();
		return entity;
	}
}
