package com.generics;
import java.util.ArrayList;
public class GenerisDemo2 {


       public static void main(String[] args) {
//		        With Java Generics :

		        ArrayList<Integer> myArrayList = new ArrayList();
		        myArrayList.add(10);
		        myArrayList.add(20);
		        myArrayList.add(30);
		        myArrayList.add(40);

		        int x = myArrayList.get(0);
		        System.out.println(x);

		    }
		
	}


