package kh.lclass.openapi.controller;

import kh.lclass.openapi.model.service.EvInfoService;

public class EvInfoController {
	public void getEvInfoAll() {
//		Thread service = new EvInfoService();
		EvInfoService service = new EvInfoService();
		service.start();
	}
}
