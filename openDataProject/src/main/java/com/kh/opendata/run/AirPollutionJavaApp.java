package com.kh.opendata.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class AirPollutionJavaApp {

	// 발급받은 인증키(반드시 본인의 키 입력) 정보 변수에 담아두기
	public static final String serviceKey = "yPagSk62H7KyCOt6Zf62FSlL%2BrFxiu2xND4RbWth3ybwAm6oWzAl9rEjJXQNjPAGUpQNnYaA%2F1uVfQiD12WsBw%3D%3D";

	public static void main(String[] args) {

		// OpenAPI 서버로 요청하고자 하는 URL 만들기
		// 응답받은 xml URL 내용 중 ? 전까지의 내용이 요청 URL, 따라서 ? 전까지 복사, = 우측에 붙여넣기
		String url = "https://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty";

		// 이어서 요청할 전달값 추가 ( 서비스키값과 시도명은 필수)
		url += "?serviceKey=" + serviceKey;
		try {
			url += "&sidoName=" + URLEncoder.encode("서울", "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		// 요청시 전달값 중 한글이 있을 경우 encoding 해야 함
		url += "&returnType=json";
		// 영문이므로 encoding 필요 없음

//			System.out.println(url);

		URL requestUrl;
		HttpURLConnection urlConnection = null;
		BufferedReader br = null;

		String responseText = "";
		String line;

		try {
			requestUrl = new URL(url);
			urlConnection = (HttpURLConnection) requestUrl.openConnection();
			urlConnection.setRequestMethod("GET");
			br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

			while ((line = br.readLine()) != null) {
//				System.out.println(line); 
				responseText += line;
			}
//			System.out.println(responseText); 
			
			// JsonObject / JsonArray, JsonElement를 이용해서 파싱할 수 있음(gson라이브러리에서 제공) => 내가 원하는 데이터만을 추출할 수 있음
			// 각각의 item 정보를 => AirVo 객체에 담고 => ArrayList에 쌓기
			
			// responseText에 담긴 문자열을 JsonObject객체로 변경
			JsonObject totalObj = 
					JsonParser.parseString(responseText).getAsJsonObject();
			
			JsonObject responseObj = totalObj.getAsJsonObject("response");
			// response속성 접근 => 응답데이터 {}에 있는 내용들을 JsonObject화
				// System.out.println(responseObj); 출력 확인 후 주석
			
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				urlConnection.disconnect();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
