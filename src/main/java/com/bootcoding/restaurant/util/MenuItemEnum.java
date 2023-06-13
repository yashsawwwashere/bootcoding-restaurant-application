package com.bootcoding.restaurant.util;

public enum MenuItemEnum {
    PANEER_MASALA("Paneer Masala",true, "VEG_RESTAURANT"),
    PRAWNS_MASALA("Prawns Masala", false, "NON_VEG_RESTAURANT"),
    FISH_MASALA("Fish Curry", false, "NON_VEG_RESTAURANT"),
    CHICKEN_CURRY("Chicken Curry", false, "NON_VEG_RESTAURANT"),
    PRAWNS_CURRY("Prawns Curry", false, "NON_VEG_RESTAURANT"),
    FISH_HANDI("Fish Handi", false, "NON_VEG_RESTAURANT"),
    CHICKEN_HANDI("Chicken Handi", false, "NON_VEG_RESTAURANT"),
    PRAWNS_HANDI("Prawns Handi", false, "NON_VEG_RESTAURANT"),
    CHICKEN_TANDOORI("Chicken Tandoori", false, "NON_VEG_RESTAURANT"),
    FISH_KHOLAPURI("Fish Kolhapuri", false, "NON_VEG_RESTAURANT"),
    CHICKEN_KHOLAPURI("Chicken Kolhapuri", false, "NON_VEG_RESTAURANT"),
    PRAWNS_KHOLAPURI("Prawns Kolhapuri", false, "NON_VEG_RESTAURANT"),
    PANEER_TIKKA_MASALA("Paneer Tikka Masala",true, "VEG_RESTAURANT"),
    PANEER_LABABDAR("Paneer Lababdar",true, "VEG_RESTAURANT"),
    PANEER_HANDI("Paneer handi",true, "VEG_RESTAURANT"),
    PANEER_TIKKA_KHOLAPURI("Paneer Tikka Khlapuri",true, "VEG_RESTAURANT"),
    CHILLI_PANEER("Chilli Paneer",true, "VEG_RESTAURANT");







        private MenuItemEnum(String name,boolean isVeg,String category){
        this.name=name;
        this.veg=isVeg;
        this.category=category;

    }
    private String name;
    private boolean veg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVeg() {
        return veg;
    }

    public void setVeg(boolean veg) {
        this.veg = veg;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    private String category;

}
