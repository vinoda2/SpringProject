package com.xworkz.events.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.events.dto.EventDTO;
import com.xworkz.events.entity.EventEntity;
@Repository
public class EventRepositoryImp implements EventRepository {

	@Autowired
	EntityManagerFactory entityManagerFactory ;
	
	@Override
	public boolean saveDTO(EventDTO dto) {
		System.out.println(dto);
		EntityManager entity=this.entityManagerFactory.createEntityManager();
		EntityTransaction  transaction=entity.getTransaction();
		transaction.begin();
		entity.persist(dto);
		transaction.commit();
		entity.close();
		return true;
	}
	
	@Override
	public EventEntity findById(int id) {
	System.out.println("find by id in repo.." + id);
	EntityManager entitymanager = this.entityManagerFactory.createEntityManager();
	EventEntity event=entitymanager.find(EventEntity.class, id);
	entitymanager.close();
	return event;
	}

}
