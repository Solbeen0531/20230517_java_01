package com.kh.opendata.model.vo;

public class AirVo {

	private String stationName; // 측정소명
	private String datetime; // 측정일시
	private String khaiValue; // 통합대기환경 수치
	
	private String pm10Value; // 미세먼지 농도
	private String so2Value; // 아황산가스 농도
	private String coValue; // 일산화탄소 농도
	private String no2Value; // 이산화질소 농도
	private String o3Value; // 오존 농도
	
	public AirVo() {
		super();
	}

	public AirVo(String stationName, String datetime, String khaiValue, String pm10Value, String so2Value,
			String coValue, String no2Value, String o3Value) {
		super();
		this.stationName = stationName;
		this.datetime = datetime;
		this.khaiValue = khaiValue;
		this.pm10Value = pm10Value;
		this.so2Value = so2Value;
		this.coValue = coValue;
		this.no2Value = no2Value;
		this.o3Value = o3Value;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public String getKhaiValue() {
		return khaiValue;
	}

	public void setKhaiValue(String khaiValue) {
		this.khaiValue = khaiValue;
	}

	public String getPm10Value() {
		return pm10Value;
	}

	public void setPm10Value(String pm10Value) {
		this.pm10Value = pm10Value;
	}

	public String getSo2Value() {
		return so2Value;
	}

	public void setSo2Value(String so2Value) {
		this.so2Value = so2Value;
	}

	public String getCoValue() {
		return coValue;
	}

	public void setCoValue(String coValue) {
		this.coValue = coValue;
	}

	public String getNo2Value() {
		return no2Value;
	}

	public void setNo2Value(String no2Value) {
		this.no2Value = no2Value;
	}

	public String getO3Value() {
		return o3Value;
	}

	public void setO3Value(String o3Value) {
		this.o3Value = o3Value;
	}

	@Override
	public String toString() {
		return "AirVo [stationName=" + stationName + ", datetime=" + datetime + ", khaiValue=" + khaiValue
				+ ", pm10Value=" + pm10Value + ", so2Value=" + so2Value + ", coValue=" + coValue + ", no2Value="
				+ no2Value + ", o3Value=" + o3Value + "]";
	}
	
	
}
