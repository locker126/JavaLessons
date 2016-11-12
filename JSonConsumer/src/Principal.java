import com.google.gson.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		users Usuario = new users("1", "Leanne Graham", "Bret", "Sincere@april.biz", new Address("Kulas Light", "Apt. 556", "Gwenborough", "92998-3874", new Geo("-37.3159", "81.1496")), "1-770-736-8031 x56442","hildegard.org", new Company("Romaguera-Crona", "Multi-layered client-server neural-net", "harness real-time e-markets") );
		
		Gson jSon = new Gson();
		String sUsuario = jSon.toJson(Usuario);
		
		System.out.println(sUsuario);
		
		String sToJason ="{\"id\":2,\"name\":\"Ervin Howell\",\"username\":\"Antonette\",\"email\":\"Shanna@melissa.tv\",\"address\":{\"street\":\"Victor Plains\",\"suite\":\"Suite 879\",\"city\":\"Wisokyburgh\",\"zipcode\":\"90566-7771\",\"geo\":{\"lat\":\"-43.9509\",\"lng\":\"-34.4618\"}},\"phone\":\"010-692-6593 x09125\",\"website\":\"anastasia.net\",\"company\":{\"name\":\"Deckow-Crist\",\"catchPhrase\":\"Proactive didactic contingency\",\"bs\":\"synergize scalable supply-chains\"}}";
		
		
		users Usuario2 = jSon.fromJson(sToJason,  users.class);
		System.out.println(Usuario2.getId() + " " + Usuario2.getName());
		
		
	}

}
