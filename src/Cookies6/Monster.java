package Cookies6;

public class Monster {
private String monsterImage;
private String skill1;
private int dmg;
private int hp;
private String type;
public String getMonsterImage() {
	return monsterImage;
}
public void setMonsterImage(String monsterImage) {
	this.monsterImage = monsterImage;
}
public String getSkill1() {
	return skill1;
}
public void setSkill1(String skill1) {
	this.skill1 = skill1;
}
public int getDmg() {
	return dmg;
}
public void setDmg(int dmg) {
	this.dmg = dmg;
}
public int getHp() {
	return hp;
}
public void setHp(int hp) {
	this.hp = hp;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Monster(String monsterImage, String skill1, int dmg, int hp, String type) {
	super();
	this.monsterImage = monsterImage;
	this.skill1 = skill1;
	this.dmg = dmg;
	this.hp = hp;
	this.type = type;
}


}
