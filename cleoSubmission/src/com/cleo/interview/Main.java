package com.cleo.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String args[]) {
		
		/*
		 * IE: List = [‘a string’, [‘a’,’b’,[‘1’,’2’,’3’]], ‘spam’, [‘eggs’]]
			If itemizeList(“Example”, List) was called, the output would be:
			Example.0:  a string
			Example.1.0:  a
			Example.1.1:  b
			Example.1.2.0:  1
			Example.1.2.1:  2
			Example.1.2.2:  3
			Example.2:  spam
			Example.3.0:  eggs
		 * 
		 * */
		
		Utility util = new Utility();
		List<Item> items = new ArrayList();
		
		Item item1 = new Item("a string");
		items.add(item1);
		
		
		Item i21 = new Item("1");
		Item i22 = new Item("2");
		Item i23 = new Item("3");
		Item nested = new Item(Arrays.asList(i21,i22,i23));

		Item item2 = new Item(Arrays.asList(new Item("a"),new Item("b"),nested));
		
		
		items.add(item2);
		items.add(new Item("spam"));
		items.add(new Item(Arrays.asList(new Item("eggs"))));

		util.getHierachy("Example", items);
		
	}

	
}
