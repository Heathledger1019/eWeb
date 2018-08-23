package Service;

import java.util.List;

import Entity.Emergency;

public interface EmergencyService {
public void addorsave(Emergency e);
public List<Emergency> findall();
public Emergency findById(String id);
public void delete(Emergency e);
}