package test.com.goku.demo.client;


import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import com.goku.demo.controller.ExampleController;

/**
 * Created by nbfujx on 2017/11/27.
 */
public class CxfClient {

    public static void main(String[] args) {
        echo();
    }

    public static void echo() {
        // 创建动态客户端
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://localhost:8080/services/ExampleService?wsdl");
        Object[] objects = new Object[0];
        try {
            objects = client.invoke("echo", "str");
            System.out.println("echo:" + objects[0]);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
