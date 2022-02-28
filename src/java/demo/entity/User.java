/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java.demo.entity;

/**
 *
 * @author Admin
 */
public class User {
    
    private Integer id;
    private String name;
    private String phone;
    private String user;
    private String password;
    private String role;
    private String favorite;
    private String about;

    public User() {
    }

    public User(Integer id, String name, String phone, String user, String password, String role, String favorite, String about) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.user = user;
        this.password = password;
        this.role = role;
        this.favorite = favorite;
        this.about = about;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
    
    
}
