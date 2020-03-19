package com.onlinebookstore.enitities.security;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Role {
    @Id
	private int roleId;
	private String name;
	
	@OneToMany(mappedBy = "role", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<UserRole> user_roles = new HashSet<>();

	public int getId() {
		return roleId;
	}

	public void setId(int roleId) {
		this.roleId = roleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<UserRole> getUser_roles() {
		return user_roles;
	}

	public void setUser_roles(Set<UserRole> user_roles) {
		this.user_roles = user_roles;
	}
	
	
}
