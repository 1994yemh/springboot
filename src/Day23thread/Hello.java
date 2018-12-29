package Day23thread;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;
@WebService
public class Hello {
public String sayHello(String name) {

return"Hello " + name;
}
public static void main(String[] args){
Endpoint.publish("http://localhost:8090/Day23thread.Hello", new Hello());
System.out.println("Success");
}
}