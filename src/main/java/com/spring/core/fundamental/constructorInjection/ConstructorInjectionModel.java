package com.spring.core.fundamental.constructorInjection;

import java.util.List;

public class ConstructorInjectionModel {

     public String name;
     public int age;
     public long phone;
     public List<SkillsModel> skills;
     public AddressModel address;

     public ConstructorInjectionModel() {
          super();
     }

     public ConstructorInjectionModel(String name, int age) {
          this.name = name;
          this.age = age;
     }

     public ConstructorInjectionModel(String name, int age, long phone, List<SkillsModel> skills,
               AddressModel address) {
          this.name = name;
          this.age = age;
          this.phone = phone;
          this.skills = skills;
          this.address = address;
     }

     @Override
     public String toString() {
          return "ConstructorInjectionModel [name=" + name + ", age=" + age + ", phone=" + phone + ", skills=" + skills
                    + ", address=" + address + "]";
     }

}
