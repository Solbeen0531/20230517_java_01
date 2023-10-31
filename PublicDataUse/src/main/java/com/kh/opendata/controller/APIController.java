package com.kh.opendata.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class APIController {

	private static final String serviceKey = "yPagSk62H7KyCOt6Zf62FSlL%2BrFxiu2xND4RbWth3ybwAm6oWzAl9rEjJXQNjPAGUpQNnYaA%2F1uVfQiD12WsBw%3D%3D";
	
	@ResponseBody
	@RequestMapping(value="busroute.do", produces = "application/json; charset=utf-8")
	public String tsunamiShelter() throws IOException {
		
		System.out.println("controller call");;
		
		String url = "http://ws.bus.go.kr/api/rest/busRouteInfo/getStaionByRouteList";
		
		// url에 parameter 정보들을 추가하시오.
		url += "?serviceKey="+serviceKey;
		url += "&strSrch=";
		url += "&resultType=json";
		
		// 아래 내용은 수정 불 필요
		URL requestUrl = new URL(url);
		HttpURLConnection urlConnection = (HttpURLConnection)requestUrl.openConnection();
		urlConnection.setRequestMethod("GET");
		
		BufferedReader br =  new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
		
		String responseText = "";
		String line;
		while((line = br.readLine()) != null) {
			responseText += line;
		}
		br.close();
		urlConnection.disconnect();
		return responseText;
	}
}
