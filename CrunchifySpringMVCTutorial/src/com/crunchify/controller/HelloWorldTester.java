package com.crunchify.controller;




import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class HelloWorldTester{
	
	@Test
	public void ShouldReturnEmail() {
		
		CrunchifySpringService crunchifySpringService = new CrunchifySpringService();
		
		String result = crunchifySpringService.ParserMethode();
		
		
		assertThat(result, CoreMatchers.containsString("fred@yatta.de=Thu Nov 23 00:00:00 CET 2017"));
		assertThat(result, CoreMatchers.containsString("schmidt@yatta.de=Thu Nov 23 00:00:00 CET 2017"));
		assertThat(result, CoreMatchers.containsString("bork@yatta.de=Thu Nov 23 00:00:00 CET 2017"));
		
	}

}



