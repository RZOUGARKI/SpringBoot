package com.employee.employee.dao;
import java.util.List;


public interface EntityRepository<G>  {
public G save(G p);
public List<G> findAll();
public G findOne(Long emplyeeId);
public G update(G p);
public void delete(Long emplyeeId);
}