package Action;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

import Entity.Complaint;
import Entity.Tourist;
import Service.ComplaintService;
import Service.TouristService;

public class ComplaintAction {

	private String complaintid;
	private String time;
	private String content;
	private String photo2;
	private boolean ishandle = false;
	private String ishandletemp;
	private TouristService tserviceinCA;
	
	private String dealtime;
	private String answer;
	private String evaluate;

	private Complaint c;
	private List<Complaint> cs,bs;
	private ComplaintService cservice;

	private Tourist t;
	
	private Set<Complaint> cset;
	
	private    int page=1;
	private   int totalUsers;
	private int usersPerPage;
	private int totalPages;
	private   int beginIndex;
	private int endIndex ;
	
	public List<Complaint> getBs() {
		return bs;
	}

	public void setBs(List<Complaint> bs) {
		this.bs = bs;
	}

	public Set<Complaint> getCset() {
		return cset;
	}

	public void setCset(Set<Complaint> cset) {
		this.cset = cset;
	}

	public TouristService getTserviceinCA() {
		return tserviceinCA;
	}

	public void setTserviceinCA(TouristService tserviceinCA) {
		this.tserviceinCA = tserviceinCA;
	}

	public Tourist getT() {
		return t;
	}

	public void setT(Tourist t) {
		this.t = t;
	}

	public ComplaintAction() {

	}

	public ComplaintAction(String a1, String a2, String a3, String a4, boolean a5, String a6, String a7, String a8) {
		this.complaintid = a1;
		this.time = a2;
		this.content = a3;
		this.photo2 = a4;
		this.ishandle = a5;
		this.dealtime = a6;
		this.answer = a7;
		this.evaluate = a8;
	}

	public String execute() {
		c=cservice.findById(c.getId4());
		return "success";
	}

	public String getComplaintid() {
		return complaintid;
	}

	public void setComplaintid(String complaintid) {
		this.complaintid = complaintid;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPhoto2() {
		return photo2;
	}

	public void setPhoto2(String photo2) {
		this.photo2 = photo2;
	}

	public boolean isIshandle() {
		return ishandle;
	}

	public void setIshandle(boolean ishandle) {
		this.ishandle = ishandle;
	}

	public String getDealtime() {
		return dealtime;
	}

	public void setDealtime(String dealtime) {
		this.dealtime = dealtime;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getEvaluate() {
		return evaluate;
	}

	public void setEvaluate(String evaluate) {
		this.evaluate = evaluate;
	}

	public Complaint getC() {
		return c;
	}

	public void setC(Complaint c) {
		this.c = c;
	}

	public List<Complaint> getCs() {
		return cs;
	}

	public void setCs(List<Complaint> cs) {
		this.cs = cs;
	}

	public ComplaintService getCservice() {
		return cservice;
	}

	public void setCservice(ComplaintService cservice) {
		this.cservice = cservice;
	}

	public String add() {
		try {
			// �貹��ͼƬ
			
			//���ø�Ͷ��δ����
			c.setIshandle(false);
			
			//����Tourist t
			t=tserviceinCA.findById(t.getPhone());
			
			//�޸ĸ�tourist����t��complaint Set
			t.getComplaints().add(c);
			tserviceinCA.addorsave(t);
			
			//�洢
			c.setTourist(t);
			cservice.addorsave(c);
			
			return "hasAdd";
		} catch (Exception e) {
			throw e;
		}

	}

	public String findall() {
		cs = cservice.findall();

		totalUsers=cs.size();
		 usersPerPage = 10;
		 totalPages = totalUsers % usersPerPage == 0 ? totalUsers / usersPerPage : totalUsers / usersPerPage + 1;
		 beginIndex = (page - 1) * usersPerPage;
		// System.out.println("begin "+beginIndex);
		 
		 endIndex = beginIndex + usersPerPage-1;
		// System.out.println(endIndex);
	        if (endIndex > totalUsers)
	            endIndex = totalUsers-1;
		return "hasFindAll";
	}
	

	public String findallthose() {
		bs.clear();
		cs = cservice.findall();
		//System.out.println(t.getPhone()+":t.phone");
		for (Complaint com : cs) {
			//System.out.print("com.getTourist().getPhone():"+com.getTourist().getPhone());
			if (com.getTourist().getPhone().equals(t.getPhone())) {
				//cs.remove(com);
				bs.add(com);
			}
		}
		totalUsers=bs.size();
		 usersPerPage = 10;
		 totalPages = totalUsers % usersPerPage == 0 ? totalUsers / usersPerPage : totalUsers / usersPerPage + 1;
		 beginIndex = (page - 1) * usersPerPage;
		// System.out.println("begin "+beginIndex);
		 
		 endIndex = beginIndex + usersPerPage-1;
		// System.out.println(endIndex);
	        if (endIndex > totalUsers)
	            endIndex = totalUsers-1;
		return "hasFindAll";
	}

	public String findallisnothandle() {
		cs = cservice.findall();
		for(Complaint c : cs )
		{
			if(c.getIshandle()==true)
			{
				cs.remove(c);
			}
		}
		return "hasFindAllIsNotHandle";
	}
	
	public String findallishandle() {
		cs = cservice.findall();
		for(Complaint c : cs )
		{
			if(c.getIshandle()==false)
			{
				cs.remove(c);
			}
		}
		return "hasFindAllIsHandle";
	}
	
	public String change() {
		Timestamp ts1 = new Timestamp(System.currentTimeMillis());
		//Timestamp ts2 = new Timestamp(System.currentTimeMillis());
		// String tsStr = "2011-05-09 11:49:45";
		try {
			System.out.print(complaintid);
			System.out.print(12344);
			ts1 = Timestamp.valueOf(this.dealtime);
			/*
			ts2 = Timestamp.valueOf(this.time);
			*/
			// System.out.println(ts1);
			c=cservice.findById(this.complaintid);
			System.out.print(c.getId4());
			/*
			c.setId4(this.complaintid);
			c.setAnswer(this.answer);
			c.setContent(this.content);
			c.setDealtime(ts1);
			c.setEvaluate(this.getEvaluate());
			c.setIshandle(this.ishandle);
			c.setPhoto2(this.photo2);
			c.setTime(ts2);
			*/
			c.setDealtime(ts1);
			c.setAnswer(this.answer);
			
			c.setIshandle(true);
			//c.setTourist(t);

			cservice.addorsave(c);
			
			return "hasChange";
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	public String eva()
	{
		try{
			
			c=cservice.findById(c.getId4());
			if(c.getIshandle()==true)
			{
				c.setEvaluate(this.evaluate);
				
				cservice.addorsave(c);
				return "hasEva";
			}else return "NotHandle";
		}catch(Exception e)
		{
			throw e;
		}
	}

	public String delete() {
		try {
			//删除complaints表
			c=cservice.findById(c.getId4());
			
			//删除tourist表内特定t的complaints保存
			t=tserviceinCA.findById(t.getPhone());
			cset = t.getComplaints();
			cset.remove(c);
			t.setComplaints(cset);
			tserviceinCA.addorsave(t);
			
			//删除complaints表
			c.setTourist(t);
			cservice.delete(c);
			
			return "hasDelete";
		} catch (Exception e) {
			throw e;
		}
	}
}
