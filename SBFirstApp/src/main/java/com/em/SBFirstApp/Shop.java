package com.em.SBFirstApp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data                                   // Lombok annotations
@AllArgsConstructor
public class Shop {                     // Java Bean Class
    private String shopName;
    private String shopLocation;

  /*  public Shop(String shopName, String shopLocation) {
        this.shopName = shopName;
        this.shopLocation = shopLocation;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopLocation() {
        return shopLocation;
    }

    public void setShopLocation(String shopLocation) {
        this.shopLocation = shopLocation;
    }*/

}
