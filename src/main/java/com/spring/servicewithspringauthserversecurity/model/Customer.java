package com.spring.servicewithspringauthserversecurity.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private long id;

    private String name;

    private String email;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String pwd;

    private String role;

    @Column(name = "create_dt")
    @JsonIgnore
    private Date createDt;

    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<Authority> authorities;

    public long getId() {
        return id;
    }

    public Customer setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Customer setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public Customer setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    public String getPwd() {
        return pwd;
    }

    public Customer setPwd(String pwd) {
        this.pwd = pwd;
        return this;
    }

    public String getRole() {
        return role;
    }

    public Customer setRole(String role) {
        this.role = role;
        return this;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public Customer setCreateDt(Date createDt) {
        this.createDt = createDt;
        return this;
    }

    public Set<Authority> getAuthorities() {
        return authorities;
    }

    public Customer setAuthorities(Set<Authority> authorities) {
        this.authorities = authorities;
        return this;
    }
}
