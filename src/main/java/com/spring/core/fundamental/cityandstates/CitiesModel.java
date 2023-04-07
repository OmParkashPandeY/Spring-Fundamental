package com.spring.core.fundamental.cityandstates;

public class CitiesModel {
     public String cityName;
     public long populations;
     public String area;
     public String lat;
     public String lng;

     public String getCityName() {
          return cityName;
     }

     public void setCityName(String cityName) {
          this.cityName = cityName;
     }

     public long getPopulations() {
          return populations;
     }

     public void setPopulations(long populations) {
          this.populations = populations;
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

     public CitiesModel() {
          super();
     }

     public CitiesModel(String cityName, long populations, String area, String lat, String lng) {
          this.cityName = cityName;
          this.populations = populations;
          this.area = area;
          this.lat = lat;
          this.lng = lng;
     }

     @Override
     public String toString() {
          return "Cities [cityName=" + cityName + ", populations=" + populations + ", area=" + area + ", lat=" + lat
                    + ", lng=" + lng + "]";
     }

}
