package Service;

import java.util.List;

import Entity.Hotel;


public interface HotelService {
	public void addorsave(Hotel h);
	public List<Hotel> findall();
	public Hotel findById(String id);
	public void delete(Hotel h);
}
