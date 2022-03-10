package Cookies5;

public class cookie {
	private String name;
	private String cookieImage;
	private String cookieIcon;
	private String skill2;// later will change it to Skills skill2, skill1
	private String skill1;//
	private int dmg;
	private int hp;
	private String type;
	


	public cookie(String name, String cookieImage, String cookieIcon, String skill2, String skill1, int dmg, int hp,
			String type) {
		super();
		this.name = name;
		this.cookieImage = cookieImage;
		this.cookieIcon = cookieIcon;
		this.skill2 = skill2;
		this.skill1 = skill1;
		this.dmg = dmg;
		this.hp = hp;
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCookieImage() {
		return cookieImage;
	}
	public void setCookieImage(String cookieImage) {
		this.cookieImage = cookieImage;
	}
	public String getCookieIcon() {
		return cookieIcon;
	}
	public void setCookieIcon(String cookieIcon) {
		this.cookieIcon = cookieIcon;
	}
	public String getSkill1() {
		return skill1;
	}
	public void setSkill1(String skill1) {
		this.skill1 = skill1;
	}
	public String getSkill2() {
		return skill2;
	}
	public void setSkill2(String skill2) {
		this.skill2 = skill2;
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

}
