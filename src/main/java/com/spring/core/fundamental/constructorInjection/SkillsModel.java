package com.spring.core.fundamental.constructorInjection;

public class SkillsModel {
     public String name;
     public String duration;
     public String usedFor;

     public SkillsModel() {
          super();
     }

     public SkillsModel(String name, String duration, String usedFor) {
          this.name = name;
          this.duration = duration;
          this.usedFor = usedFor;
     }

     @Override
     public String toString() {
          return "SkillsModel [name=" + name + ", duration=" + duration + ", usedFor=" + usedFor + "]";
     }
}
