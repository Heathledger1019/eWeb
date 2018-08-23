package Service;

import java.util.List;

import Entity.Complaint;

public interface ComplaintService {
public void addorsave(Complaint c);
public List<Complaint> findall();
public Complaint findById(String id);
public void delete(Complaint c);
}