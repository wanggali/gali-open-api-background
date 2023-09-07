package com.gali.inf;

import com.gali.api.sdk.client.GaliApiClient;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

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
