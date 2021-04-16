package com.cleo.interview;

import java.util.ArrayList;
import java.util.List;

public class Item {
	
	String value;
	List<Item> list;
	
	public Item(){
	}
	
	public Item(String value){
		this.value = value;
		this.list =null;
	}
	
	public Item(List<Item> list) {
		this.value = null;
		this.list = list;
	}
	
	
}
