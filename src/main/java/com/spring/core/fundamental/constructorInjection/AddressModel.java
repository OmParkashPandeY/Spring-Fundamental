package com.spring.core.fundamental.constructorInjection;

public class AddressModel {
     public String address1;
     public String address2;
     public String city;
     public String state;

     public AddressModel() {
          super();
     }

     public AddressModel(String address1, String address2, String city, String state) {
          this.address1 = address1;
          this.address2 = address2;
          this.city = city;
          this.state = state;
     }

     @Override
     public String toString() {
          return "Address [address1=" + address1 + ", address2=" + address2 + ", city=" + city + ", state=" + state
                    + "]";
     }
}
