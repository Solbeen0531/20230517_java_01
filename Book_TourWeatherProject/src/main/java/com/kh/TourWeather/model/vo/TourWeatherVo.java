package com.kh.TourWeather.model.vo;

public class TourWeatherVo {
	
	private String spotAreaName; //관광지-지역 이름
	private String spotName; // 관광지명
	private String th3; //일 3시간 기온
	private String rhm; //습도
	private String pop; //강수확률
	
	public TourWeatherVo(String spotAreaName, String spotName, String th3, String rhm, String pop) {
		super();
		this.spotAreaName = spotAreaName;
		this.spotName = spotName;
		this.th3 = th3;
		this.rhm = rhm;
		this.pop = pop;
	}

	public TourWeatherVo() {
		super();
	}

	public String getSpotAreaName() {
		return spotAreaName;
	}

	public void setSpotAreaName(String spotAreaName) {
		this.spotAreaName = spotAreaName;
	}

	public String getSpotName() {
		return spotName;
	}

	public void setSpotName(String spotName) {
		this.spotName = spotName;
	}

	public String getTh3() {
		return th3;
	}

	public void setTh3(String th3) {
		this.th3 = th3;
	}

	public String getRhm() {
		return rhm;
	}

	public void setRhm(String rhm) {
		this.rhm = rhm;
	}

	public String getPop() {
		return pop;
	}

	public void setPop(String pop) {
		this.pop = pop;
	}

	@Override
	public String toString() {
		return "TourWeatherVo [spotAreaName=" + spotAreaName + ", spotName=" + spotName + ", th3=" + th3 + ", rhm="
				+ rhm + ", pop=" + pop + "]";
	}
	
	
	
}
