import java.util.Scanner;

//��Ϸ����
public class room {
	//���� �Ƿ��� ���� ������Ϸ����ң�����ţ��������ƣ�
	
	public human player1 = null;
	public computer player2 = null;
	//����id
	public int roomid;
	//��������
	public String roomname;
	//��������
	public String roompass;
	
	
	
	public room(String roomname,String roompass){
		if(!("ABC" == roomname && "123" == roompass)){
			System.out.println("������������ƴ�����Ϸǿ���˳�");
			System.exit(0);
		}
		this.setRoomname(roomname);
		intgame();
		stargame();
		endgame();
		
	}
	//������  ��ʼ��Ϸ ��ʼ����Ϸ ��ʾ�˵�  ѡ������  �ж���Ӯ 
	
	//��ʼ����Ϸ
	public void intgame(){
		//ʵ������Ϸ����
		player1 = new human();
		player2 = new computer();
		//��ʼ����Ϸ��������
		//�磺��Ϸ�еĻ����ݲݵ�
		for (int i = 0; i < 30; i++) {
			System.out.print("*");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println("��Ϸ���سɹ���");
	}
	//��ʼ��Ϸ
	public void stargame(){
		showmenu();
		choicerole();
		gaming();
		//��ӡ���
		
	}

	//��Ϸ�Ĵ�ѭ��
	private void gaming() {
		while(true){
		//˫����ȭ 
		System.out.println(player1.getName() + "���ȭ");
		int quan1 = player1.getQuan();
		//���1
		player1.setQuan(new Scanner(System.in).nextInt());
		//���Գ�ȭ
		player2.getQuan();
		int quan2 = player2.getQuan();
		//�ж�
		int jieguo = judge(quan1, quan2);//���÷��� �жϽ��
		//������� -1�����1ʤ�� ���Ϊ0 ��ƽ�����Ϊ 1�����2ʤ��
		if(jieguo == -1){
			System.out.println("�����У���" + player1.getName() + "ʤ��");
			System.out.println(player1.getName() + ":");
			player1.sendxinxi(human.typewin);
			System.out.println(player2.getName() + ":");
			player2.sendxinxi(computer.typelose);
		}else if(jieguo == 1){
			System.out.println("�����У���" + player2.getName() + "ʤ��");
			System.out.println(player1.getName() + ":");
			player1.sendxinxi(human.typelose);
			System.out.println(player2.getName() + ":");
			player2.sendxinxi(computer.typewin);
		}else if(jieguo == 0){
			System.out.println("�����У�ƽ��Ŷ~��");
			player1.sendxinxi(human.typefist);
			player2.sendxinxi(computer.typefist);
		}
		System.out.println("�Ƿ������Ϸ��\t y/n");
		String answer = new Scanner(System.in).next();
		if("y".equals(answer)){
			System.out.println("�����Ǽ���");
		}else{
			System.out.println("���˳�����");
			return;
		}
	}
	}
	//չʾ�˵�
	public void showmenu(){
		System.out.println("��ӭ����\t" + roomname + "����");
		System.out.println("ѡ�ų�ȭ:1 ʯͷ\t2 ����\t3 ��");
	}
	//ѡ������
	public void choicerole(){
		System.out.println("��ѡ�����:1 ���\t2 ����\t3 ����\t4 ���� \n��ѡ����֣�");
		int choice = new Scanner(System.in).nextInt();
		String[] namearray = {"���","����","����","����"};
		//ʡ�Զ��û��������֤
		player2.setName(namearray[choice - 1]);
		player1.setName("Ұԭ��֮��");
		System.out.println(player1.getName() + "vs" + player2.getName());
	}
	//�ж���Ӯ
	public int judge(int quan1, int quan2){
		if(quan1 == quan2) return 0;
		if(quan1 ==1 && quan2 == 2 || quan1 == 2 && 
				quan2 == 3 || quan1 == 3 && quan2 == 1) {
			//���1���� + 1�����2 ���� - 1 
			player1.setFenshu(player1.getFenshu() + 1);
			player2.setFenshu(player2.getFenshu() - 1);
			return -1;	//���1ʤ��
		}else{
			//���1���� - 1�����2 ���� + 1 
			player1.setFenshu(player1.getFenshu() - 1);
			player2.setFenshu(player2.getFenshu() + 1);
			return 1;
		}
	}
	
	//������Ϸ
	public void endgame(){
		System.out.println();
		System.out.println(player1.getName() + "\t" + player2.getName());
		System.out.println(player1.getFenshu() + "\t" + player2.getFenshu());
		System.out.println("��Ϸ�ѽ�������ӭ��������");
	}
	
	
	
	
	public int getRoomid() {
		return roomid;
	}
	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}
	public String getRoomname() {
		return roomname;
	}
	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}
	public String getRoompass() {
		return roompass;
	}
	public void setRoompass(String roompass) {
		this.roompass = roompass;
	}
	
	
}
