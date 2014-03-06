import javax.persistence.EntityManager;

import br.com.pjweb.entidade.Usuario;
import br.com.pjweb.util.JPAUtil;



public class JPATeste {
	
	public static void main(String[] args){
		
		Usuario novo = new Usuario();
		
		EntityManager em = JPAUtil.getEntityManager();
		
		novo.setNome("Priscila da Silva Carvalho");
		novo.setEmail("priscila.soak@gmail.com");
		novo.setSenha("hotnegsup");
		
		em.getTransaction().begin();
		em.persist(novo);
		em.getTransaction().commit();
		
		em.close();
	}

}
