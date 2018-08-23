package Action;

import java.util.List;
import java.util.Set;

import Entity.Administrator;
import Entity.Emergency;
import Service.AdminService;
import Service.EmergencyService;

public class AdminAction {

	private int adminid;
	private String name;
	private boolean sex = false;
	private String sextemp;

	private Administrator a;
	private List<Administrator> as;
	private AdminService aservice;

	private Set<Emergency> eset;
	private EmergencyService eserviceinAA;
	
	public AdminAction() {
	}

	public AdminAction(int adminid, String name, boolean sex) {
		this.adminid = adminid;
		this.name = name;
		this.sex = sex;
	}

	public String execute() {
		a = aservice.findById(a.getId2());
		return "success";
	}

	
	
	public EmergencyService getEserviceinAA() {
		return eserviceinAA;
	}

	public void setEserviceinAA(EmergencyService eserviceinAA) {
		this.eserviceinAA = eserviceinAA;
	}

	public Set<Emergency> getEset() {
		return eset;
	}

	public void setEset(Set<Emergency> eset) {
		this.eset = eset;
	}

	public int getAdminid() {
		return adminid;
	}

	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public Administrator getA() {
		return a;
	}

	public void setA(Administrator a) {
		this.a = a;
	}

	public List<Administrator> getAs() {
		return as;
	}

	public void setAs(List<Administrator> as) {
		this.as = as;
	}

	public AdminService getAservice() {
		return aservice;
	}

	public void setAservice(AdminService aservice) {
		this.aservice = aservice;
	}

	// sex不能直接注入

	public String add() {
		try {
			// a.setSex(this.sex);
			if (this.sextemp.equals("男")) {
				a.setSex(false);
			} else {
				a.setSex(true);
			}
			aservice.addorsave(a);
			return "hasAdd";
		} catch (Exception e) {
			throw e;
		}

	}

	public String isRegister() {
		/// * 如果id号和名字匹配
		int flag = 0;
		as = aservice.findall();
		for (Administrator a : as) {
			if (a.getId2().equals(a.getId2())) {
				flag = 1;
				break;
			}
		}
		if (flag == 1 && aservice.findById(a.getId2()).getName().equals(a.getName()))
			return "rightAccount";
		else
			return "wrongAccount";
	}

	public String findall() {
		as = aservice.findall();
		return "hasFindAll";
	}

	public String change() {

		try {
			// a.setId2(this.adminid);
			// a.setName(this.name);
			if (this.sextemp.equals("男")) {
				a.setSex(false);
			} else {
				a.setSex(true);
			}
			
			a.setEmergencies(aservice.findById(a.getId2()).getEmergencies());

			aservice.addorsave(a);
			return "hasChange";
		} catch (Exception e) {
			throw e;
		}

	}

	public String delete() {
		try {
			//删除该admin的所有emergency
			for(Emergency e :eserviceinAA.findall())
			{
				if(e.getAdministrator().getId2().equals(a.getId2()))
				{
					eserviceinAA.delete(e);
				}
			}
			
			aservice.delete(aservice.findById(a.getId2()));
			return "hasDelete";
		} catch (Exception e) {
			throw e;
		}
	}
}
