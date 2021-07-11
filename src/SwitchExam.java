
public class SwitchExam {

	public static void main(String[] args) {
		int value = 1;
		char type = 'a';
			switch(type) {
			case 'a':
				System.out.println("Type is a");
				break;
			case 'b':
				System.out.println("Type is b");
				break;
			case 'c':
				System.out.println("Type is c");
				break;
			default:
				System.out.println("Type is neither a, b, or c");
			}
// switch conditional statements는 if conditional statements처럼 작동한다. switch() 괄호 안에 들어가는 variable에 따라서 switch block 안의
// case가 variable의 피연산자와 일치하는지 안하는지에 따라서 그 source code가 실행이 되거나 안된다. 하지만 case만으로는 한번 일치하는 순간, 그 밑의 case들이
// 일치하든 안하든 다 실행이 된다. 이런 현상을 막는게 break; 코드이다. 한번 break; 코드가 실행이 된다면 아예 그 switch문 밖으로 나가게 된다.
// default는 if conditional statements의 else처럼 작동하면서 그 위의 case들이 하나도 성립이 안되는 시에만 작동을 하게된다.
			
			switch(value) {
			case 1:
				System.out.println("Value is 1");
				break;
			case 2:
				System.out.println("Value is 1");
				break;
			case 3:
				System.out.println("Value is 1");
				break;
			default:
				System.out.println("Value is 1");
			}
	}

}
