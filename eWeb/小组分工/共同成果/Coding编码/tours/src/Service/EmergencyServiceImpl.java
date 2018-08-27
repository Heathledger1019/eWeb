package Service;

import java.util.List;

import DAO.EmergencyDAO;
import Entity.Emergency;

public class EmergencyServiceImpl implements EmergencyService {
	private EmergencyDAO edao;

	public EmergencyDAO getEdao() {
		return edao;
	};

	public void setEdao(EmergencyDAO edao) {
		this.edao = edao;
	};

	@Override
	public void addorsave(Emergency e) {
		/*
		if (edao.findById(e.getId3()) != null) {
			edao.delete(edao.findById(e.getId3()));
		}
		edao.save(e);*/
		edao.attachDirty(e);
	};

	@Override
	public List<Emergency> findall() {
		return edao.findAll();
	};

	@Override
	public Emergency findById(String id) {
		return edao.findById(id);
	};
	
	@Override
	public void delete(Emergency e){
		edao.delete(e);
	};
}
