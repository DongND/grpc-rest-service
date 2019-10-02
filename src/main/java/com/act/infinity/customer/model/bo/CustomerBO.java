package com.act.infinity.customer.model.bo;


public class CustomerBO {
  private int id;
  private String name;

  public CustomerBO(){

  }
  public CustomerBO(int id, String name){
    this.id = id;
    this.name = name;
  }

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

}
