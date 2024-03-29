package ma.ehei.to.service.etudiant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import ma.ehei.dao.Etududiant;
import ma.ehei.tp.EtudiantDAO.EtudiantDAO;
import ma.ehei.tp.service.id.IdGenerateur;

public class ServiceEtudiant {
    @Autowired
    @Qualifier
	private EtudiantDAO e;
    @Autowired
	private IdGenerateur id;
	
	public void ajouterEtudinat(Etududiant e)
	{
		
	}
	
	public String GenerereID()
	{
		return null;
	}
	
}
