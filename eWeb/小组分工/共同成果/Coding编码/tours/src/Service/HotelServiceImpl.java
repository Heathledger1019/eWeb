package Service;

import java.util.List;

import DAO.HotelDAO;
import Entity.Hotel;
import Entity.Tourist;

public class HotelServiceImpl implements HotelService {

	private HotelDAO hdao;
	
	
	public HotelDAO getHdao() {
		return hdao;
	}

	public void setHdao(HotelDAO hdao) {
		this.hdao = hdao;
	}

	@Override
	public void addorsave(Hotel h) {
		/*
		if (hdao.findById(h.getId()) != null) {
			hdao.delete(hdao.findById(h.getId()));
		}
		hdao.save(h);*/
		hdao.attachDirty(h);
	}

	@Override
	public List<Hotel> findall() {
	
		return hdao.findAll();
	}

	@Override
	public Hotel findById(String id) {
		
		return hdao.findById(id);
	}

	@Override
	public void delete(Hotel h) {
		
		hdao.delete(h);
	}

}
