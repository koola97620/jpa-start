package jpastart.reserve.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author choijaeyong on 2020/07/19.
 * @project jpa-start
 * @description
 */
@Entity
@Table(name="user")
public class User {

  @Id
  private String email;
  private String name;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "create_date")
  private Date createDate;

  public User(String email, String name, Date createDate) {
    this.email = email;
    this.name = name;
    this.createDate = createDate;
  }

  public String getEmail() {
    return email;
  }

  public String getName() {
    return name;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void test() {
    int k = 100;
  }
}
