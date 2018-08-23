package Service;

import java.util.List;
import Entity.Tourist;

public interface TouristService {
public void addorsave(Tourist t);
public List<Tourist> findall();
public Tourist findById(String id);
public void delete(Tourist t);
}