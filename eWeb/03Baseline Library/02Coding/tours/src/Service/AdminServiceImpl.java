package Service;

import java.util.List;

import DAO.AdministratorDAO;
import Entity.Administrator;

public class AdminServiceImpl implements AdminService{
	private AdministratorDAO adao;
	
	@Override
	public void addorsave(Administrator a) {
		/*
		if (adao.findById(a.getId2()) != null) {
			adao.delete(adao.findById(a.getId2()));
		}
		adao.save(a);*/
		adao.attachDirty(a);
	}
	public AdministratorDAO getAdao() {
		return adao;
	}

	public void setAdao(AdministratorDAO adao) {
		this.adao = adao;
	}

	@Override
	public List<Administrator> findall() {
		return adao.findAll();
	}
	
	@Override
	public Administrator findById(int id)
	{
		return adao.findById(id);
	}
	
	@Override
	public void delete(Administrator a){
		adao.delete(a);
	}
}