package com.crunchify.controller;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DefMethode {

	public static Set<?> transformListIntoSet(List<?> list) {
	      Set<Object> set = new LinkedHashSet<>();
	      set.addAll(list);
	      return set;
	      
	}
	
    public static List<?> transformSetIntoList(Set<?> set) {
	      List<Object> list = new ArrayList<>();
	      list.addAll(set);
          return list;
    }}