package com.cleo.interview;

import java.util.List;

public class Utility {
	
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
	public void getHierachy(String name, List<Item> items) {
		printHierarachy(name,items,"");				
	}
	
	
	public void printHierarachy(String name,List<Item> items,String hierarchy) {
		
		
		for(int i=0;i<items.size();i++) {
			Item item = items.get(i);
			
			if(item.list==null) {
				
				System.out.println(name+"."+ hierarchy +i +": "   +item.value);
			}
			else {
				String newHi =  hierarchy + i +".";
				printHierarachy(name,item.list,newHi);
			}
		
		}
		
	}
		
}

