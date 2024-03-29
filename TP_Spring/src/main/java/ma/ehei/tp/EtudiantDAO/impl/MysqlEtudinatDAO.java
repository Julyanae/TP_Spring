package ma.ehei.tp.EtudiantDAO.impl;

import ma.ehei.dao.Etududiant;
import ma.ehei.tp.EtudiantDAO.EtudiantDAO;

public class MysqlEtudinatDAO implements EtudiantDAO{
    @Override
	public void persister(Etududiant e)
	{
		System.out.print("Bien ajouté en MYSQL ! ");
	}
}
