package com.crunchify.controller; 

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
/*
 * author: Yatta Solutions
 * 
 */
 
@SuppressWarnings("unused")
@Controller
public class CrunchifyHelloWorld {
	

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() throws IOException {
		
		CrunchifySpringService crunchifySpringService = new CrunchifySpringService();
		
		String result = crunchifySpringService.ParserMethode();
		
				           
			  
		return new ModelAndView("welcome","message",result); 
			    
	}}
