package Service;

import java.util.List;
import DAO.TouristDAO;
import Entity.Tourist;

public class TouristServiceImpl implements TouristService {
	private TouristDAO tdao;

	@Override
	public void addorsave(Tourist t) {
		/*
		Tourist t1;
		if (tdao.findById(t.getPhone()) != null) {
			t1 = tdao.findById(t.getPhone());
			tdao.delete(t1);
		}
		tdao.save(t);*/
		tdao.attachDirty(t);
	}

	public TouristDAO getTdao() {
		return tdao;
	}

	public void setTdao(TouristDAO tdao) {
		this.tdao = tdao;
	}

	@Override
	public List<Tourist> findall() {
		return tdao.findAll();
	}

	@Override
	public Tourist findById(String id) {
		return tdao.findById(id);
	}

	@Override
	public void delete(Tourist t) {
		tdao.delete(t);
	}
}
