package com.example.spreadsheet.excel_dataDB.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EXcel_Entity {
@GeneratedValue(strategy = GenerationType.IDENTITY)	
@Id	
private Integer id;
private Integer	HO_Sr_No ;
private Integer	Branch_Sr_No;
private String	COMPANY;
private double	Emp_ID;
private String	Employee_Name;
private String	Location;
private String	Branch;
private String	Department;
private String	Division;
private String	STATUS;
private String	ITEM_TYPE;
private String	IS_OS_LICENSE_REQUIRED;
private String	OS_License_Traking_No;
private String	Licenses_Key;
private String IS_OFFICE_LICENSE_REQUIRED;
private String	Office_License_Traking_No;
private String	MS_OFFICE_Type;

private String	Brand_Name;
private String	Model;
private String Sr_No;
private String	Configuration; 
private String	Age_of_the_System_in_years;
private String	YEAR_OF_PURCHASE;
private String	INVOICE_DATE;
private String	INVOICE_NO;
private Integer	AMOUNT;
private String	VENDOR_DETAILS;
private String	Warrnaty_Detials ;
private String	REMARKS;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Integer getHO_Sr_No() {
	return HO_Sr_No;
}
public void setHO_Sr_No(Integer hO_Sr_No) {
	HO_Sr_No = hO_Sr_No;
}
public Integer getBranch_Sr_No() {
	return Branch_Sr_No;
}
public void setBranch_Sr_No(Integer branch_Sr_No) {
	Branch_Sr_No = branch_Sr_No;
}
public String getCOMPANY() {
	return COMPANY;
}
public void setCOMPANY(String cOMPANY) {
	COMPANY = cOMPANY;
}
public double getEmp_ID() {
	return Emp_ID;
}
public void setEmp_ID(double d) {
	Emp_ID = d;
}
public String getEmployee_Name() {
	return Employee_Name;
}
public void setEmployee_Name(String employee_Name) {
	Employee_Name = employee_Name;
}
public String getLocation() {
	return Location;
}
public void setLocation(String location) {
	Location = location;
}
public String getBranch() {
	return Branch;
}
public void setBranch(String branch) {
	Branch = branch;
}
public String getDepartment() {
	return Department;
}
public void setDepartment(String department) {
	Department = department;
}
public String getDivision() {
	return Division;
}
public void setDivision(String division) {
	Division = division;
}
public String getSTATUS() {
	return STATUS;
}
public void setSTATUS(String sTATUS) {
	STATUS = sTATUS;
}
public String getITEM_TYPE() {
	return ITEM_TYPE;
}
public void setITEM_TYPE(String iTEM_TYPE) {
	ITEM_TYPE = iTEM_TYPE;
}
public String getIS_OS_LICENSE_REQUIRED() {
	return IS_OS_LICENSE_REQUIRED;
}
public void setIS_OS_LICENSE_REQUIRED(String iS_OS_LICENSE_REQUIRED) {
	IS_OS_LICENSE_REQUIRED = iS_OS_LICENSE_REQUIRED;
}
public String getOS_License_Traking_No() {
	return OS_License_Traking_No;
}
public void setOS_License_Traking_No(String oS_License_Traking_No) {
	OS_License_Traking_No = oS_License_Traking_No;
}
public String getLicenses_Key() {
	return Licenses_Key;
}
public void setLicenses_Key(String licenses_Key) {
	Licenses_Key = licenses_Key;
}
public String getIS_OFFICE_LICENSE_REQUIRED() {
	return IS_OFFICE_LICENSE_REQUIRED;
}
public void setIS_OFFICE_LICENSE_REQUIRED(String iS_OFFICE_LICENSE_REQUIRED) {
	IS_OFFICE_LICENSE_REQUIRED = iS_OFFICE_LICENSE_REQUIRED;
}
public String getOffice_License_Traking_No() {
	return Office_License_Traking_No;
}
public void setOffice_License_Traking_No(String office_License_Traking_No) {
	Office_License_Traking_No = office_License_Traking_No;
}
public String getMS_OFFICE_Type() {
	return MS_OFFICE_Type;
}
public void setMS_OFFICE_Type(String mS_OFFICE_Type) {
	MS_OFFICE_Type = mS_OFFICE_Type;
}
public String getBrand_Name() {
	return Brand_Name;
}
public void setBrand_Name(String brand_Name) {
	Brand_Name = brand_Name;
}
public String getModel() {
	return Model;
}
public void setModel(String model) {
	Model = model;
}
public String getSr_No() {
	return Sr_No;
}
public void setSr_No(String sr_No) {
	Sr_No = sr_No;
}
public String getConfiguration() {
	return Configuration;
}
public void setConfiguration(String configuration) {
	Configuration = configuration;
}
public String getAge_of_the_System_in_years() {
	return Age_of_the_System_in_years;
}
public void setAge_of_the_System_in_years(String age_of_the_System_in_years) {
	Age_of_the_System_in_years = age_of_the_System_in_years;
}
public String getYEAR_OF_PURCHASE() {
	return YEAR_OF_PURCHASE;
}
public void setYEAR_OF_PURCHASE(String yEAR_OF_PURCHASE) {
	YEAR_OF_PURCHASE = yEAR_OF_PURCHASE;
}
public String getINVOICE_DATE() {
	return INVOICE_DATE;
}
public void setINVOICE_DATE(String iNVOICE_DATE) {
	INVOICE_DATE = iNVOICE_DATE;
}
public String getINVOICE_NO() {
	return INVOICE_NO;
}
public void setINVOICE_NO(String iNVOICE_NO) {
	INVOICE_NO = iNVOICE_NO;
}
public Integer getAMOUNT() {
	return AMOUNT;
}
public void setAMOUNT(Integer aMOUNT) {
	AMOUNT = aMOUNT;
}
public String getVENDOR_DETAILS() {
	return VENDOR_DETAILS;
}
public void setVENDOR_DETAILS(String vENDOR_DETAILS) {
	VENDOR_DETAILS = vENDOR_DETAILS;
}
public String getWarrnaty_Detials() {
	return Warrnaty_Detials;
}
public void setWarrnaty_Detials(String warrnaty_Detials) {
	Warrnaty_Detials = warrnaty_Detials;
}
public String getREMARKS() {
	return REMARKS;
}
public void setREMARKS(String rEMARKS) {
	REMARKS = rEMARKS;
}
	
	
	
}
