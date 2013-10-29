package com.billzard.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppContextUtil {

	private static List<String> configLocations = new ArrayList<String>();

	public AppContextUtil() {

	}

	public ApplicationContext buildContext() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				configLocations.toArray(new String[configLocations.size() - 1]));
		return applicationContext;
	}

	public AppContextUtil setConfigFiles() {
		configLocations.add("config/applicationContext.xml");
		return this;
	}

	public AppContextUtil setConfigFiles(List<String> configFiles) {
		setConfigFiles();
		configLocations.addAll(configFiles);
		return this;
	}
}
