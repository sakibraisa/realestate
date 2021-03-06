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
 * User generated by hbm2java
 */
@Entity
@Table(name="user"
    ,catalog="db_estate"
)
public class User  implements java.io.Serializable {


     private Integer userId;
     private UserType userType;
     private String fname;
     private String lname;
     private String uname;
     private String password;
     private String email;
     private String gender;
     private String phoneNo;
     private String address;
     private Set<Inquiry> inquiries = new HashSet<Inquiry>(0);
     private Set<Booking> bookings = new HashSet<Booking>(0);
     private Set<Feedback> feedbacks = new HashSet<Feedback>(0);

    public User() {
    }

	
    public User(UserType userType, String fname, String lname, String uname, String password, String email, String gender, String phoneNo, String address) {
        this.userType = userType;
        this.fname = fname;
        this.lname = lname;
        this.uname = uname;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.phoneNo = phoneNo;
        this.address = address;
    }
    public User(UserType userType, String fname, String lname, String uname, String password, String email, String gender, String phoneNo, String address, Set<Inquiry> inquiries, Set<Booking> bookings, Set<Feedback> feedbacks) {
       this.userType = userType;
       this.fname = fname;
       this.lname = lname;
       this.uname = uname;
       this.password = password;
       this.email = email;
       this.gender = gender;
       this.phoneNo = phoneNo;
       this.address = address;
       this.inquiries = inquiries;
       this.bookings = bookings;
       this.feedbacks = feedbacks;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="user_id", unique=true, nullable=false)
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_type_id", nullable=false)
    public UserType getUserType() {
        return this.userType;
    }
    
    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    
    @Column(name="fname", nullable=false, length=15)
    public String getFname() {
        return this.fname;
    }
    
    public void setFname(String fname) {
        this.fname = fname;
    }

    
    @Column(name="lname", nullable=false, length=15)
    public String getLname() {
        return this.lname;
    }
    
    public void setLname(String lname) {
        this.lname = lname;
    }

    
    @Column(name="uname", nullable=false, length=15)
    public String getUname() {
        return this.uname;
    }
    
    public void setUname(String uname) {
        this.uname = uname;
    }

    
    @Column(name="password", nullable=false, length=20)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="email", nullable=false, length=30)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="gender", nullable=false, length=8)
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    
    @Column(name="phone_no", nullable=false, length=25)
    public String getPhoneNo() {
        return this.phoneNo;
    }
    
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    
    @Column(name="address", nullable=false, length=45)
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
    public Set<Inquiry> getInquiries() {
        return this.inquiries;
    }
    
    public void setInquiries(Set<Inquiry> inquiries) {
        this.inquiries = inquiries;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
    public Set<Booking> getBookings() {
        return this.bookings;
    }
    
    public void setBookings(Set<Booking> bookings) {
        this.bookings = bookings;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
    public Set<Feedback> getFeedbacks() {
        return this.feedbacks;
    }
    
    public void setFeedbacks(Set<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }




}


