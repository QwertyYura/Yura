package com.ifmo.lesson17;

public abstract class Factory {
     public static Factory getFactory(String CountryCode){

         if("JP".equals(CountryCode)){
            return new JapanFactory();
        }
         if("GR".equals(CountryCode)){
             return new GermanyFactory();
         }
         if("USA".equals(CountryCode)){
             return new USAFactory();
         }
         if("GB".equals(CountryCode)){
             return new GBFactory();
         }
         if("RUS".equals(CountryCode)){
             return new RussianFactory();
         }
         return null;
     }

    public abstract Car createCar();
}
