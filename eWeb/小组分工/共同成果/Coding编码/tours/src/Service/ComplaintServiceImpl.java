package Service;

import java.util.List;

import DAO.ComplaintDAO;
import Entity.Complaint;

public class ComplaintServiceImpl implements ComplaintService {
	private ComplaintDAO cdao;

	public ComplaintDAO getCdao() {
		return cdao;
	}

	public void setCdao(ComplaintDAO cdao) {
		this.cdao = cdao;
	}

	@Override
	public void addorsave(Complaint c) {
		/*
		if (cdao.findById(c.getId4()) != null) {
			cdao.delete(cdao.findById(c.getId4()));
		}
		cdao.save(c);*/
		cdao.attachDirty(c);
	};

	@Override
	public List<Complaint> findall() {
		return cdao.findAll();
	};

	@Override
	public Complaint findById(String id) {
		return cdao.findById(id);
	};
	
	@Override
	public void delete(Complaint c){
		cdao.delete(c);
	}
}
