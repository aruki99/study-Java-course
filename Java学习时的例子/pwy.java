
public class pwy {
	public static void main(String[] args){
		long []xuehao = {1,2,3,4,5,6,7,8,9,10};
		long []chenji = {83,43,54,68,98,76,87,99,100,84};
		System.err.println("成绩为0，则是成绩 < 80的情况");
		for (int i = 0; i <= xuehao.length - 1 ;) {
			if(chenji[i] < 80){
				chenji[i] = 0;
			}
			System.out.print("学号:" + xuehao[i] + "\t成绩" + chenji[i] + "\n");
			i++;
		}	
	}
}

