package me.hm.api.milk.model;

import me.libme.spring.kernel.jpa._m.JBaseModel;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_milk")
public class Milk extends JBaseModel{

    @Column(name = "amount")
    private double amount;

    @Column(name = "_time" , updatable = false)
    @Temporal(value= TemporalType.TIMESTAMP)
    private Date time;

    @Column(name = "age")
    private double age;

    @Column(name = "log")
    private double log;


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getLog() {
        return log;
    }

    public void setLog(double log) {
        this.log = log;
    }
}
