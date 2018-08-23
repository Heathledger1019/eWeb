package Action;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

import Entity.Administrator;
import Entity.Emergency;
import Service.AdminService;
import Service.EmergencyService;

public class EmergencyAction {

	private String emergencyid;
	private String starttime;
	private String endtime;
	private String content;
	private String photo;
	private String title;

	private Emergency e;
	private List<Emergency> es;
	private EmergencyService eservice;

	private Administrator a;
	private AdminService aserviceinEA;

	private Set<Emergency> eset;

	
	
	public Set<Emergency> getEset() {
		return eset;
	}

	public void setEset(Set<Emergency> eset) {
		this.eset = eset;
	}

	public AdminService getAserviceinEA() {
		return aserviceinEA;
	}

	public void setAserviceinEA(AdminService aserviceinEA) {
		this.aserviceinEA = aserviceinEA;
	}

	public Administrator getA() {
		return a;
	}

	public void setA(Administrator a) {
		this.a = a;
	}

	public EmergencyAction() {
	}

	public EmergencyAction(String emergencyid, String starttime, String endtime, String content, String photo,
			String title) {
		super();
		this.emergencyid = emergencyid;
		this.starttime = starttime;
		this.endtime = endtime;
		this.content = content;
		this.photo = photo;
		this.title = title;
	}

	public String execute() {
		e=eservice.findById(e.getId3());
		return "success";
	}

	public String getEmergencyid() {
		return emergencyid;
	}

	public void setEmergencyid(String emergencyid) {
		this.emergencyid = emergencyid;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Emergency getE() {
		return e;
	}

	public void setE(Emergency e) {
		this.e = e;
	}

	public List<Emergency> getEs() {
		return es;
	}

	public void setEs(List<Emergency> es) {
		this.es = es;
	}

	public EmergencyService getEservice() {
		return eservice;
	}

	public void setEservice(EmergencyService eservice) {
		this.eservice = eservice;
	}

	public String add() {
		try {
			
			
			//���Ҹ�admin
			a=aserviceinEA.findById(a.getId2());
			
			//�޸ĸ�admin����a��emergency Set
			a.getEmergencies().add(e);
			aserviceinEA.addorsave(a);
			
			//��ֵa �洢e
			e.setAdministrator(a);
			eservice.addorsave(e);
			
			System.out.print("1111221212");
			return "hasAdd";
		} catch (Exception e) {
			throw e;
		}
	}

	public String findall() {
		es = eservice.findall();
		return "hasFindAll";
	}

	public String change() {
		Timestamp ts1 = new Timestamp(System.currentTimeMillis());
		Timestamp ts2 = new Timestamp(System.currentTimeMillis());
		// String tsStr = "2011-05-09 11:49:45";
		try {
			/*
			ts1 = Timestamp.valueOf(e.getStarttime());
			ts2 = Timestamp.valueOf(e.getEndtime());
			*/
			// System.out.println(ts1);

			//e.setContent(this.content);
			//e.setEndtime(ts2);
		  	//e.setId3(this.emergencyid);
			//e.setPhoto(this.photo);
			//e.setStarttime(ts1);
			//e.setTitle(this.title);
			a=aserviceinEA.findById(a.getId2());
			
			e.setAdministrator(a);

			eservice.addorsave(e);
			return "hasChange";
		} catch (Exception e) {
			throw e;
		}

	}

	public String delete() {
		try {
			//删除emergency表
			e=eservice.findById(e.getId3());
			
			//删除admin表内特定a的emergency 保存
			a=aserviceinEA.findById(a.getId2());
			eset = a.getEmergencies();
			eset.remove(e);
			a.setEmergencies(eset);
			aserviceinEA.addorsave(a);
			
			//删除emergency表
			e.setAdministrator(a);
			eservice.delete(e);
			
			return "hasDelete";
		} catch (Exception e) {
			throw e;
		}
	}
}
