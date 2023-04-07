package com.spring.core.fundamental.cityandstates;

public class StatesModel {

     public String stateName;
     public String area;
     public String lat;
     public String lng;
     public long populations;
     public CitiesModel cities;

     public StatesModel() {
          super();
     }

     public StatesModel(String stateName, String area, String lat, String lng, long populations, CitiesModel cities) {
          this.stateName = stateName;
          this.area = area;
          this.lat = lat;
          this.lng = lng;
          this.populations = populations;
          this.cities = cities;
     }

     public String getStateName() {
          return stateName;
     }

     public void setStateName(String stateName) {
          this.stateName = stateName;
     }

     public String getArea() {
          return area;
     }

     public void setArea(String area) {
          this.area = area;
     }

     public String getLat() {
          return lat;
     }

     public void setLat(String lat) {
          this.lat = lat;
     }

     public String getLng() {
          return lng;
     }

     public void setLng(String lng) {
          this.lng = lng;
     }

     public long getPopulations() {
          return populations;
     }

     public void setPopulations(long populations) {
          this.populations = populations;
     }

     public CitiesModel getCities() {
          return cities;
     }

     public void setCities(CitiesModel cities) {
          this.cities = cities;
     }

     @Override
     public String toString() {
          return "States [stateName=" + stateName + ", area=" + area + ", lat=" + lat + ", lng=" + lng
                    + ", populations=" + populations + ", cities=" + cities + "]";
     }

}
