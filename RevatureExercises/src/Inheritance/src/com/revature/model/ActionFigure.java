package com.revature.model;

public class ActionFigure extends Doll{
	private String skill;
	
	public ActionFigure() {
		this.name = "Oliver Queen";
		this.eyeColor = "blue";
		this.skill = "arrow shooting";
	}
	
	public ActionFigure(String name, String eyeColor, String skill) {
		this.name = name;
		this.eyeColor = eyeColor;
		this.skill = skill;
	}
	
	//getters and setters
	public String getSkill() {
		return this.skill;
	}
	
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	//behaviors
	public void useSkill() {
		System.out.println("Ka Pow! I'm using my skill, "+this.skill);
	}
	
}
