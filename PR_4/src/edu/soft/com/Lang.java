package edu.soft.com;

public enum Lang {
	
	Season season;

	...

	switch (month) {

	case 1:
	day = Season.WINTER; break;

	case "Marth": case "April": case "May":

	season = Season.SPRING; break;

	case "June": case "Jule": case "August":

	season = Season.SUMMER; break;

	case "September": case "October": case "November":

	season = Season.AUTUMN; break;

	default:

	System.out.println("No this month");

	System.exit(0);
	
	
	EN("англійська", "English", "русский"), UA("українська", "Ukrainian", "русский"), RU("російська", "Russian", "русский");

	private final String ua;
	private final String en;
	private final String ru;

	Lang(String ua, String en, String ru) {
		this.ua = ua;
		this.en = en;
		this.ru = ru;
	}

	public String getUa() {
		return ua;
	}

	public String getEn() {
		return en;
	}
	
	public String getRu() {
		return ru;
	}
}
