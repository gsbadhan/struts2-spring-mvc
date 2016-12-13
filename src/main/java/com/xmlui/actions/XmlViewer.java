package com.xmlui.actions;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import generated.SetchipMainMenu;

public class XmlViewer extends ActionSupport implements ModelDriven<SetchipMainMenu> {
	private static final String SUCCESS = "SUCCESS";
	private static final String XML_PATH = "XML_PATH";
	private static Properties properties = new Properties();

	private SetchipMainMenu setchipMainMenu = new SetchipMainMenu();

	public XmlViewer() {
	}

	public String showXML() {
		setchipMainMenu = readXML();
		return SUCCESS;
	}

	public String saveXML() {
		writeXML();
		return SUCCESS;
	}

	private void writeXML() {
		try {
			JAXBContext context = JAXBContext.newInstance(SetchipMainMenu.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(setchipMainMenu, new File("/Users/gsingh/Downloads/config_new.xml"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public SetchipMainMenu getSetchipMainMenu() {
		return setchipMainMenu;
	}

	public void setSetchipMainMenu(SetchipMainMenu setchipMainMenu) {
		this.setchipMainMenu = setchipMainMenu;
	}

	private SetchipMainMenu readXML() {
		SetchipMainMenu mainMenu = null;
		try {
			File xmlFile = new File(properties.getProperty(XML_PATH));
			JAXBContext jaxbContext = JAXBContext.newInstance(SetchipMainMenu.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			mainMenu = (SetchipMainMenu) unmarshaller.unmarshal(xmlFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mainMenu;
	}

	static {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		try {
			properties.load(classLoader.getResourceAsStream("config.properties"));
			System.out.println(properties);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public SetchipMainMenu getModel() {
		return setchipMainMenu;
	}
}
