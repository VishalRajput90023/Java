package test;

public class thinkx {

	public static void main(String[] args) {
		int a,b;
		a = 12;
		b = 23;
		if(a < b){
			System.out.println(a+b);
		}
		else {
		a += 10; //a = a + 10
		System.out.print(a);
		}
		int choice = 3;
		switch(choice){
		case 1: System.out.println(a-b);break;//break flow of control
		case 2:System.out.println(a+b);break;
		default: System.out.println(b/a);break;
		}
		//for loop
		for(int i =0;i < 10;++i) {
			System.out.print(i);
		}
		System.out.println("");
		int j = 0;
		while(j<9) {
			System.out.println(j);
			++j;//Update
		}
		int k =11;
		do {
			System.out.println(k);//Run atleast once
			++k;
		}while(k<10);
		
		order: for(int i = 0;i < 10;++i) {//label
			System.out.print(i + " ");
			System.out.println("Ordered");//Order label
			if(i%2 == 0) {
				continue order;
			}
		    System.out.println("");
		}
  }
}

