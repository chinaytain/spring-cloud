package cn.yifan.cloud.service;

import cn.yifan.cloud.common.ResponseMsg;
import cn.yifan.cloud.feignclient.TestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestClientService {
	
	@Autowired
	private TestClient testClient;

	public ResponseMsg list(){
		return testClient.list();
	}
	
}
