import javax.persistence.EntityManager;

import br.com.pjweb.entidade.Cadastro;
import br.com.pjweb.util.JPAUtil;


public class JPACadTeste {
	
	public static void main(String[] args){
		
		Cadastro novo = new Cadastro();
		EntityManager em = JPAUtil.getEntityManager();
		
		novo.setNome("Bruno Aquino");
		novo.setEmail("theodorodeaquino@gmail.com");
		novo.setCpf("55563562900");
		
		em.getTransaction().begin();
		em.persist(novo);
		em.getTransaction().commit();
		
		em.close();
	}

}
