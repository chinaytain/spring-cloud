package cn.yifan.cloud.service;

import cn.yifan.cloud.common.ResponseMsg;
import cn.yifan.cloud.feignclient.TestClient;
import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestClientService {
	
	@Autowired
	private TestClient testClient;

	public String list(){

		return  testClient.list();
	}
	
}
