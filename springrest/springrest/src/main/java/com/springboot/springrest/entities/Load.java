package com.springboot.springrest.entities;

import java.util.Date;

//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class Load {

	
@Id
private long shipperId;

private String loadingPoint;
private String unloadingPoint;
private String productType;
private String truckType;
private int noOfTrucks;
private int wieght;
private String optionalComment;
private Date date;
public Load(long shipperId, String loadingPoint, String unloadingPoint, String productType, String truckType,
		int noOfTrucks, int wieght, String optionalComment, Date date) {
	super();
	this.shipperId = shipperId;
	this.loadingPoint = loadingPoint;
	this.unloadingPoint = unloadingPoint;
	this.productType = productType;
	this.truckType = truckType;
	this.noOfTrucks = noOfTrucks;
	this.wieght = wieght;
	this.optionalComment = optionalComment;
	this.date = date;
}
public Load() {
	super();
	// TODO Auto-generated constructor stub
}
public long getShipperId() {
	return shipperId;
}
public void setShipperId(long shipperId) {
	this.shipperId = shipperId;
}
public String getLoadingPoint() {
	return loadingPoint;
}
public void setLoadingPoint(String loadingPoint) {
	this.loadingPoint = loadingPoint;
}
public String getUnloadingPoint() {
	return unloadingPoint;
}
public void setUnloadingPoint(String unloadingPoint) {
	this.unloadingPoint = unloadingPoint;
}
public String getProductType() {
	return productType;
}
public void setProductType(String productType) {
	this.productType = productType;
}
public String getTruckType() {
	return truckType;
}
public void setTruckType(String truckType) {
	this.truckType = truckType;
}
public int getNoOfTrucks() {
	return noOfTrucks;
}
public void setNoOfTrucks(int noOfTrucks) {
	this.noOfTrucks = noOfTrucks;
}
public int getWieght() {
	return wieght;
}
public void setWieght(int wieght) {
	this.wieght = wieght;
}
public String getOptionalComment() {
	return optionalComment;
}
public void setOptionalComment(String optionalComment) {
	this.optionalComment = optionalComment;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
@Override
public String toString() {
	return "Load [shipperId=" + shipperId + ", loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint
			+ ", productType=" + productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks + ", wieght="
			+ wieght + ", optionalComment=" + optionalComment + ", date=" + date + ", getShipperId()=" + getShipperId()
			+ ", getLoadingPoint()=" + getLoadingPoint() + ", getUnloadingPoint()=" + getUnloadingPoint()
			+ ", getProductType()=" + getProductType() + ", getTruckType()=" + getTruckType() + ", getNoOfTrucks()="
			+ getNoOfTrucks() + ", getWieght()=" + getWieght() + ", getOptionalComment()=" + getOptionalComment()
			+ ", getDate()=" + getDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}



}
