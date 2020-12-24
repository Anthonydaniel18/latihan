import java.util.*;
public class Main {

	Scanner sc = new Scanner(System.in);
	//Vector<User>users = new Vector<>();
	//Vector<String>username = new Vector<String>();
	Vector<Integer>pinn = new Vector<Integer>();
	HashMap<String, String> userr = new HashMap <String,String>();

	public Main(){
		awal();
	}
	
	void awal(){
		int menu;
	
		do {
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.print(">> ");
			try {
				menu = sc.nextInt(); sc.nextLine();
			} catch (Exception e) {
				menu=0;
				System.out.println("menu tidak ada");
				sc.nextLine();
				
			}
			
		} while (menu<1||menu>2);
		
		switch(menu){
		case 1:
			regist();
			awal();
		case 2:
			login();
			awal();
		}
	}
	
	
	void regist(){
		String nama,user,pindb;
		int id,pin;
		
		do{
		System.out.print("nama :");
		nama = sc.nextLine();
		}while(nama.length()<3);
		
		System.out.println("pin : ");
		pin = sc.nextInt();sc.nextLine();
		
	//	id = users.size()+1;
		
		//User u = new User (id,nama,pin);
		//users.add(u);
		
		//username.add(nama);
		//pinn.add(pin);
		
		userr.put(nama, Integer.toString(pin));
		
		System.out.println("Pendaftaran Berhasil!");
		
		System.out.println("isi: " + userr);
		
		//for(int i = 0; i<username.size();i++){
			//System.out.println("nama :" + users.get(i).getNama());
			//System.out.println("pin :" + Integer.toString(users.get(i).getPin()));
			//System.out.print("nama :" + username.get(i));
			//System.out.println("pin :" + Integer.toString(pinn.get(i)));
			//}
		

		
	}
		
	void login(){
		String nama,pin;
		User u;
		
		//for(int i = 0; i<users.size();i++){
		//namadb = users.get(i).getNama();
		//pindb = Integer.toString(users.get(i).getPin());
		//System.out.println("nama :" + users.get(i).getNama());
		//System.out.println("pin :" + Integer.toString(users.get(i).getPin()));
		//namadb = username.get(i);

		//pindb = Integer.toString(pinn.get(i));

		

		//System.out.println(namadb);
		//System.out.println(pindb);
		
		do{
		System.out.println("nama : ");
		nama = sc.nextLine();
		}while(nama.length()<3);
		
		//if(nama.equals(namadb)){
			
		System.out.println("pin : ");
		pin = Integer.toString(sc.nextInt());
		
		System.out.println(userr.get(nama));
		
		if(pin.equals(userr.get(nama))){
			System.out.println("sukses");
		}else{System.out.println("pin salah");}
		
		
		//}else{System.out.println("nama blm daftar");
		}
		//}
	//}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
