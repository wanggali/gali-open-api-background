package com.gali.api;

import com.gali.api.client.GaliApiClient;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@SpringBootTest
class GaliApiInterfaceApplicationTests {

	@Resource
	private GaliApiClient galiApiClient;

	@Test
	void contextLoads() {
		galiApiClient.getNameByGet("gali");
		galiApiClient.getNameByPost("gali");
	}

}
