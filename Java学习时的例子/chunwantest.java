
public class chunwantest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		director 喻嘉兴 = new director();
		singer 林俊杰 = new singer("林俊杰 No.1");
		daner 杨丽萍 = new daner("杨丽萍");
		actor 尼格买提 = new actor("尼格买提");
		
		喻嘉兴.action(林俊杰);
		喻嘉兴.action(杨丽萍);
		喻嘉兴.action(尼格买提);
	}

}
