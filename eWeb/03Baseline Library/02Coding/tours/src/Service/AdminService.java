package Service;

import java.util.List;

import Entity.Administrator;


public interface AdminService {
public void addorsave(Administrator a);
public List<Administrator> findall();
public Administrator findById(int id);
public void delete(Administrator a);

}