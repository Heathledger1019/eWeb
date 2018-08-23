package Action;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

import Entity.Hotel;
import Service.HotelService;
import Service.TouristService;
import Entity.Tourist;

public class HotelAction {

	private String id;
	private String passwd;
	private String name;
	private String address;
	private String prove;
	private String conName;
	private String phone;
	private String email;
	private Boolean ispass;
	private int number;
	private double cost;

	private HotelService hservice;
	private Hotel h;
	private List<Hotel> hs;
	private Set<Hotel> hstemp;

	private Set<Tourist> tset;
	private TouristService tserviceinHA;

	public HotelAction() {
	}

	public HotelAction(String id, String passwd, String name, String address, String prove, String conName,
			String phone, String email, Boolean ispass) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.address = address;
		this.prove = prove;
		this.conName = conName;
		this.phone = phone;
		this.email = email;
		this.ispass = ispass;
	}

	public String registertemp(){
		return "success";
	}
	public String execute() {
		h = hservice.findById(h.getId());
		return "success";
	}
	
	public Set<Hotel> getHstemp() {
		return hstemp;
	}

	public void setHstemp(Set<Hotel> hstemp) {
		this.hstemp = hstemp;
	}
	

	public TouristService getTserviceinHA() {
		return tserviceinHA;
	}

	public void setTserviceinHA(TouristService tserviceinHA) {
		this.tserviceinHA = tserviceinHA;
	}

	public Set<Tourist> getTset() {
		return tset;
	}

	public void setTset(Set<Tourist> tset) {
		this.tset = tset;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProve() {
		return prove;
	}

	public void setProve(String prove) {
		this.prove = prove;
	}

	public String getConName() {
		return conName;
	}

	public void setConName(String conName) {
		this.conName = conName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getIspass() {
		return ispass;
	}

	public void setIspass(Boolean ispass) {
		this.ispass = ispass;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public HotelService getHservice() {
		return hservice;
	}

	public void setHservice(HotelService hservice) {
		this.hservice = hservice;
	}

	public Hotel getH() {
		return h;
	}

	public void setH(Hotel h) {
		this.h = h;
	}

	public List<Hotel> getHs() {
		return hs;
	}

	public void setHs(List<Hotel> hs) {
		this.hs = hs;
	}

	public String add() {
		try {
			h.setIspass(false);

			hservice.addorsave(h);
			return "hasAdd";
		} catch (Exception e) {
			throw e;
		}
	}

	public String isRegister() {
		int flag = 0;
		//System.out.println(h.getId());
		
		hs = hservice.findall();
		for (Hotel hotel : hs) {
			if (hotel.getId().equals(h.getId())) {
				System.out.println(h.getId());
				h=hservice.findById(h.getId());
				flag = 1;
				break;
			}
		}
		//System.out.print(h.getName());
	//	System.out.print(flag);
		if (flag == 1 && hservice.findById(h.getId()).getPasswd().equals(h.getPasswd()))
			return "rightAccount";
		else
			return "wrongAccount";
	}

	public String findall() {
		hs = hservice.findall();
		return "hasFindAll";
	}

	public String findallisnotpass() {
		hs = hservice.findall();
		for (Hotel h : hs) {
			if (h.getIspass() == true) {
				hs.remove(hs);
			}
		}
		return "hasFindAllIsNotpPass";
	}



	public String findallispass() {
		hstemp.clear();
		hs = hservice.findall();
		for (Hotel hh : hs) {
			if (hh.getIspass() == true) {
				hstemp.add(hh);
				//hs.remove(hs);
			}
		}
		return "hasFindAllIsPass";
	}

	public String change() {
		try {
			BigDecimal bd = new BigDecimal(this.cost);

			h.setCost(bd);
			/*
			h.setAddress(this.address);
			h.setConName(this.conName);
			h.setCost(bd);
			h.setEmail(this.email);
			// h.setId(this.id);
			h.setIspass(this.ispass);
			h.setName(this.name);
			h.setPasswd(this.passwd);
			h.setPhone(this.phone);
			h.setProve(this.prove);*/

			//h.setTourists(hservice.findById(h.getId()).getTourists());

			hservice.addorsave(h);
			return "hasChange";
		} catch (Exception e) {
			throw e;
		}
	}
	
	public String changemy() {
		try {
			h = hservice.findById(h.getId());
			
			h.setPasswd(this.passwd);
			h.setName(this.name);
			h.setAddress(this.address);
			//h.setTourists(hservice.findById(h.getId()).getTourists());

			hservice.addorsave(h);
			return "hasChangeMy";
		} catch (Exception e) {
			throw e;
		}
	}

	public String changecost() {
		try {
			BigDecimal bd = new BigDecimal(this.cost);

			h = hservice.findById(h.getId());
			h.setCost(bd);
			//h.setTourists(hservice.findById(h.getId()).getTourists());

			hservice.addorsave(h);
			return "hasChangeCost";
		} catch (Exception e) {
			throw e;
		}
	}

	public String changenum() {
		try {
			h = hservice.findById(h.getId());
			h.setNumber(this.number);
			//h.setTourists(hservice.findById(h.getId()).getTourists());

			hservice.addorsave(h);
			return "hasChangeNum";
		} catch (Exception e) {
			throw e;
		}
	}
	
	public String delete() {
		try {
			/*
			// ɾ��tourist��hotel Set��ĸ�hotel
			for (Tourist t : tserviceinHA.findall()) {
				hstemp = t.getHotels();
				for (Hotel h : hstemp) {
					if (h.getId().equals(this.id)) {
						hstemp.remove(h);
					}
				}

				tserviceinHA.addorsave(t);
			}*/

			h=hservice.findById(h.getId());
			hservice.delete(h);
			return "hasDelete";
		} catch (Exception e) {
			throw e;
		}
	}
}
