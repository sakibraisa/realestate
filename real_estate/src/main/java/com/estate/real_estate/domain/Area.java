package com.estate.real_estate.domain;
// Generated Aug 30, 2018 1:31:48 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Area generated by hbm2java
 */
@Entity
@Table(name="area"
    ,catalog="db_estate"
)
public class Area  implements java.io.Serializable {


     private Integer areaId;
     private City city;
     private String areaName;
     private Set<Property> properties = new HashSet<Property>(0);

    public Area() {
    }

	
    public Area(City city, String areaName) {
        this.city = city;
        this.areaName = areaName;
    }
    public Area(City city, String areaName, Set<Property> properties) {
       this.city = city;
       this.areaName = areaName;
       this.properties = properties;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="area_id", unique=true, nullable=false)
    public Integer getAreaId() {
        return this.areaId;
    }
    
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="city_id", nullable=false)
    public City getCity() {
        return this.city;
    }
    
    public void setCity(City city) {
        this.city = city;
    }

    
    @Column(name="area_name", nullable=false, length=20)
    public String getAreaName() {
        return this.areaName;
    }
    
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="area")
    public Set<Property> getProperties() {
        return this.properties;
    }
    
    public void setProperties(Set<Property> properties) {
        this.properties = properties;
    }




}

