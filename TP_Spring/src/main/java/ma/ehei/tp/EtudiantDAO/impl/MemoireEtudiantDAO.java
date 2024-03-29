package ma.ehei.tp.EtudiantDAO.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import ma.ehei.dao.Etududiant;
import ma.ehei.tp.EtudiantDAO.EtudiantDAO;
@Service
public class MemoireEtudiantDAO implements EtudiantDAO{
	
	static ArrayList <Etududiant> etudiants = new ArrayList<>();
	
	@Override
	public void persister(Etududiant e)
	{
		etudiants.add(e);
	}
	
}
