package com.saigontech.actualFinal;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products implements Serializable {

	private int id;
	private String name;
	private double price;
	private String storage;
	private String data;
	private String panel;
	private String support;
	private String addon;
	
//	@Column(name="STATE")
//	private String state;
//	@Column(name="COUNTRY")
//	private String country;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getPanel() {
		return panel;
	}
	public void setPanel(String panel) {
		this.panel = panel;
	}
	public String getSupport() {
		return support;
	}
	public void setSupport(String support) {
		this.support = support;
	}
	public String getAddon() {
		return addon;
	}
	public void setAddon(String addon) {
		this.addon = addon;
	}
	
	
	@Override
	public String toString() {
		return "Products [name=" + name + ", price=" + price + ", storage=" + storage + ", data=" + data + ", panel="
				+ panel + ", support=" + support + ", addon=" + addon + "]";
	}
	public Products() {
		super();
	}
	public Products(String name, double price, String storage, String data, String panel, String support,
			String addon) {
		super();
		this.name = name;
		this.price = price;
		this.storage = storage;
		this.data = data;
		this.panel = panel;
		this.support = support;
		this.addon = addon;
	}
	
	
}	
