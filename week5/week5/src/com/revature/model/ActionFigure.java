package com.revature.model;

public class ActionFigure extends Doll{
	private String skill;

	public ActionFigure(String name, String skill, String eyeColor) {
		this.skill = skill;
		this.name=name;
		this.eyeColor=eyeColor;
	}

	public ActionFigure() {
		this.skill="My skill is make children happy!";
		this.name="ActionFigure_Doll";
		this.eyeColor="Blue";
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public void useSkill()
	{
		System.out.println( "Ka Pow! I¡¯m using my skill, "+this.skill);
	}
}
