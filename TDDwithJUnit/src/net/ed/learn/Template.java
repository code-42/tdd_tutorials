package net.ed.learn;

public class Template {
	
	private String templateText;
	
	// no arg constructor
	public Template() {}

	public Template(String templateText) {
		this.templateText = templateText;
	}
	
	public String render(int score) {
		return templateText;
	}

}
