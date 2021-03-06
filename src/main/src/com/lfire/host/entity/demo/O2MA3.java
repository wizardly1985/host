package com.lfire.host.entity.demo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
/**
 * @author Ly
 * 一对多：  只在一的一方加多方的集合（多方没有一方的引用）会报错
 */
@Entity
public class O2MA3 {
	private int id;
	private String name;
//	private Set<O2MB1> sets;
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	@OneToMany(mappedBy="o2ma3",cascade = CascadeType.ALL, fetch = FetchType.LAZY) 
//	public Set<O2MB1> getSets() {
//		return sets;
//	}
//	public void setSets(Set<O2MB1> sets) {
//		this.sets = sets;
//	}
}
