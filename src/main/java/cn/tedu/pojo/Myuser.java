package cn.tedu.pojo;

import java.util.Date;
import javax.persistence.*;

public class Myuser {
    @Id
    private Integer id;

    private String username;

    private String password;

    private Integer age;

    private String gander;

    private Date brithday;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return gander
     */
    public String getGander() {
        return gander;
    }

    /**
     * @param gander
     */
    public void setGander(String gander) {
        this.gander = gander;
    }

    /**
     * @return brithday
     */
    public Date getBrithday() {
        return brithday;
    }

    /**
     * @param brithday
     */
    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }
}