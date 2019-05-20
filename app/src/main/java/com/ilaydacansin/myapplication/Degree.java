package com.ilaydacansin.myapplication;

/**
 * Created by Johnson on 1.05.2018.
 */

public enum Degree {
    BACHELOR{
        @Override
        public String toString(){
            return "Lisans";
        }
    },
    MASTER{
        @Override
        public String toString(){
            return "Yüksek Lisans";
        }
    },
    PHD{
        @Override
        public String toString(){
            return "Doktora";
        }
    }

}
