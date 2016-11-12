package ws1;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloWorld {
	@WebMethod
	public String holaMundo(String nombre);
}
