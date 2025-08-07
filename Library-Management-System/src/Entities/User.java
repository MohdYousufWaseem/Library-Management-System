package Entities;

import java.util.List;

public class User
{
    private int userid;
    private String username;
    private String department;
    private Long contactno;
    private List<Book> userownbooks;


    public List<Book> getUserownbooks() {
        return userownbooks;
    }

    public void setUserownbooks(List<Book> userownbooks) {
        this.userownbooks = userownbooks;
    }


    public Long getContactno() {
        return contactno;
    }

    public void setContactno(Long contactno) {
        this.contactno = contactno;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


}
