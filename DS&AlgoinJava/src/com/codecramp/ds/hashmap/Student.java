package com.codecramp.ds.hashmap;

public class Student {

  private String name;
  private int rollNumber;
  
  public Student(String name, int rollNumber) {
    this.name = name;
    this.rollNumber = rollNumber;
  }
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getRollNumber() {
    return rollNumber;
  }
  public void setRollNumber(int rollNumber) {
    this.rollNumber = rollNumber;
  }
  

  @Override
  public int hashCode() {
    return 1;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Student other = (Student) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (rollNumber != other.rollNumber)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Student(" + name + ", " + rollNumber + ")";
  }
}
