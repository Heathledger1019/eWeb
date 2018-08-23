package Action;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;

import Entity.Complaint;
import Entity.Emergency;
import Entity.Hotel;
import Entity.Tourist;
import Service.ComplaintService;
import Service.HotelService;
import Service.TouristService;

public class TouristAction {
	private String phone;
	private String password;
	private Tourist t;
	private List<Tourist> ts;
	private TouristService tservice;

	private Set<Hotel> hset;
	private Set<Complaint> cset;

	private HotelService hserviceinTA;
	private ComplaintService cserviceinTA;
	private Set<Tourist> tstemp;

	public TouristAction() {
	}

	public TouristAction(String phone, String password) {
		this.phone = phone;
		this.password = password;
	}

	public String execute() {
		t = tservice.findById(t.getPhone());
		return "success";
	}
	
	

	public ComplaintService getCserviceinTA() {
		return cserviceinTA;
	}

	public void setCserviceinTA(ComplaintService cserviceinTA) {
		this.cserviceinTA = cserviceinTA;
	}

	public HotelService getHserviceinTA() {
		return hserviceinTA;
	}

	public void setHserviceinTA(HotelService hserviceinTA) {
		this.hserviceinTA = hserviceinTA;
	}

	public Set<Hotel> getHset() {
		return hset;
	}

	public void setHset(Set<Hotel> hset) {
		this.hset = hset;
	}

	public Set<Complaint> getCset() {
		return cset;
	}

	public void setCset(Set<Complaint> cset) {
		this.cset = cset;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Tourist getT() {
		return t;
	}

	public void setT(Tourist t) {
		this.t = t;
	}

	public List<Tourist> getTs() {
		return ts;
	}

	public void setTs(List<Tourist> ts) {
		this.ts = ts;
	}

	public TouristService getTservice() {
		return tservice;
	}

	public void setTservice(TouristService tservice) {
		this.tservice = tservice;
	}

	public String add() {
		try {
			// t.setPasswd(this.password);
			// t.setPhone(this.phone);
			tservice.addorsave(t);
			return "hasAdd";
		} catch (Exception e) {
			throw e;
		}
	}

	public String isRegister() {
		// t.setPasswd(this.password);
		// t.setPhone(this.phone);
		//System.out.print(t.getPhone());
		int flag = 0;
		ts = tservice.findall();
	   //t=tservice.findById(getPhone());
		for (Tourist tourist : ts) {
			if (tourist.getPhone().equals(t.getPhone())) {
				flag = 1;
				break;
			}
		}
		if (flag == 1 && tservice.findById(t.getPhone()).getPasswd().equals(t.getPasswd()))
			return "rightAccount";
		else
			return "wrongAccount";
	}

	public String findall() {
		ts = tservice.findall();
		return "hasFindAll";
	}

	public String changepsd() {
		try {
			System.out.println("eeeee");
			  System.out.println(t.getPhone());
			  System.out.println(t.getPasswd());
			//t=tservice.findById(t.getPhone());
			tservice.addorsave(t);
			return "hasChange";
		} catch (Exception e) {
			throw e;
		}
	}

	public String delete() {
		try {
			// ɾ��hotel��tourist Set��ĸ�tourist
			for (Hotel h : hserviceinTA.findall()) {
				tstemp = h.getTourists();
				for (Tourist t : tstemp) {
					if (t.getPhone().equals(this.phone)) {
						tstemp.remove(t);
					}
					hserviceinTA.addorsave(h);
				}
			}

			// ɾ��complaint��tourist list��ĸ�tourist
			for(Complaint c :cserviceinTA.findall())
			{
				if(c.getTourist().getPhone().equals(this.phone))
				{
					cserviceinTA.delete(c);
				}
			}
						
			// ɾ����tourist
			tservice.delete(tservice.findById(t.getPhone()));
			return "hasDelete";
		} catch (Exception e) {
			throw e;
		}
	}

}