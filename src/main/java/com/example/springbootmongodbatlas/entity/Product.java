package com.example.springbootmongodbatlas.entity;

import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.bson.json.JsonObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.reflect.Array;
import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection ="products")
public class Product {

    @Id
    private Integer id ;
    private String title;
    private Integer minQuantity;
    private String gender;
    private String iconUrl;
    private String shortDescription;
    private String longDescription;
    private String productName;
    private String productCategory;
    private String inventryStatus;
    private Integer availableQuantity;
    private String purchasable;
    private String model ;
    private String brand ;
    private String specification ;
    private Integer warrantyDuration;
    private Integer orderLimit;
    private Integer returnDates;
    private Integer retailPrice;
    private Integer length;
    private Integer width;
    private Integer height;
    private double weight;
    private String inventoryStatus;
    private Integer discount;
    private String isHazardous;
    private String isReturnable;
    private Boolean isElegibileForPromotion;

    private ArrayList searchTags;

    private ArrayList imageUrls;

    private Object ratings;


    public Object getRatings() {
        return ratings;
    }

    public void setRatings(Object ratings) {
        this.ratings = ratings;
    }

    public ArrayList getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(ArrayList imageUrls) {
        this.imageUrls = imageUrls;
    }

    public ArrayList getSearchTags() {
        return searchTags;
    }

    public void setSearchTags(ArrayList searchTags) {
        this.searchTags = searchTags;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getMinQuantity() {
        return minQuantity;
    }

    public void setMinQuantity(Integer minQuantity) {
        this.minQuantity = minQuantity;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getInventryStatus() {
        return inventryStatus;
    }

    public void setInventryStatus(String inventryStatus) {
        this.inventryStatus = inventryStatus;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public String getPurchasable() {
        return purchasable;
    }

    public void setPurchasable(String purchasable) {
        this.purchasable = purchasable;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Integer getWarrantyDuration() {
        return warrantyDuration;
    }

    public void setWarrantyDuration(Integer warrantyDuration) {
        this.warrantyDuration = warrantyDuration;
    }

    public Integer getOrderLimit() {
        return orderLimit;
    }

    public void setOrderLimit(Integer orderLimit) {
        this.orderLimit = orderLimit;
    }

    public Integer getReturnDates() {
        return returnDates;
    }

    public void setReturnDates(Integer returnDates) {
        this.returnDates = returnDates;
    }

    public Integer getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Integer retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getInventoryStatus() {
        return inventoryStatus;
    }

    public void setInventoryStatus(String inventoryStatus) {
        this.inventoryStatus = inventoryStatus;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public String getIsHazardous() {
        return isHazardous;
    }

    public void setIsHazardous(String isHazardous) {
        this.isHazardous = isHazardous;
    }

    public String getIsReturnable() {
        return isReturnable;
    }

    public void setIsReturnable(String isReturnable) {
        this.isReturnable = isReturnable;
    }

    public Boolean getElegibileForPromotion() {
        return isElegibileForPromotion;
    }

    public void setElegibileForPromotion(Boolean elegibileForPromotion) {
        isElegibileForPromotion = elegibileForPromotion;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", minQuantity=" + minQuantity +
                ", gender='" + gender + '\'' +
                ", iconUrl='" + iconUrl + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", productName='" + productName + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", inventryStatus='" + inventryStatus + '\'' +
                ", availableQuantity=" + availableQuantity +
                ", purchasable='" + purchasable + '\'' +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", specification='" + specification + '\'' +
                ", warrantyDuration=" + warrantyDuration +
                ", orderLimit=" + orderLimit +
                ", returnDates=" + returnDates +
                ", retailPrice=" + retailPrice +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", weight=" + weight +
                ", inventoryStatus='" + inventoryStatus + '\'' +
                ", discount=" + discount +
                ", isHazardous='" + isHazardous + '\'' +
                ", isReturnable='" + isReturnable + '\'' +
                ", isElegibileForPromotion=" + isElegibileForPromotion +
                '}';
    }
}

