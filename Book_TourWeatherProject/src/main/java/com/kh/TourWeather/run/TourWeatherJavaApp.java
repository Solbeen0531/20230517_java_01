package com.kh.TourWeather.run;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TourWeatherJavaApp {

	//발급받은 인증키(반드시 본인의 키 입력) 정보 변수에 담아두기
	public static final String serviceKey = "yPagSk62H7KyCOt6Zf62FSlL%2BrFxiu2xND4RbWth3ybwAm6oWzAl9rEjJXQNjPAGUpQNnYaA%2F1uVfQiD12WsBw%3D%3D";
	
	
	public static void main(String[] args) {
		
		//OpenAPI 서버로 요청하고자 하는 URL 만들기
		//응답받은 xml URL내용 중 ?전까지의 내용이 요청 URL, 따라서 ?전까지 복사, = 우측에 붙여넣기
		String url = "https://apis.data.go.kr/1360000/TourStnInfoService1/getTourStnVilageFcst1";
		
		//url +="?serviceKey=서비스키"; //서비스키가 제대로 부여되지 않았을 경우 SERVICE_KEY_IS_NOT_REGISTERED_ERROR 오류 발생
		url += "?serviceKey=" + serviceKey;
		url += "&numOfRows=10";
		url += "&pageNo=1";
		url += "&dataType=xml";
		
		LocalDateTime datetime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHH");
		
		url += "&CURENT_DATE";
	}
	
}
