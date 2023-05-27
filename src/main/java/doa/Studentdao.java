package doa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Studentdto;

public class Studentdao {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();
public List<Studentdto> fetchall() {
	Query q=em.createQuery("select data from Studentdto data");
	List<Studentdto>dto=q.getResultList();
	return dto;
}
public void remove(int sid1) {
	// TODO Auto-generated method stub
	Studentdto std=em.find(Studentdto.class,sid1);
	if(std!=null)
	{
		et.begin();
		em.remove(std);
		et.commit();
	}
	
}
public void update(int sid, String sname, String gender,Long phno) {
 Studentdto dto1=em.find(Studentdto.class, sid);
 dto1.setSname(sname);
 dto1.setGender(gender);
 dto1.setPhno(phno);
 et.begin();
 em.persist(dto1);
 et.commit();	
}

public void update1(Studentdto dto) {
	et.begin();
	em.merge(dto);
	et.commit();
}
}

