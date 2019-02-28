package problem03;

public class MyStack {
	
	private String[] buffer;
	private int point = 0;
	public MyStack( int size ) {
		buffer = new String[size*2];
	}
	
	public void push(String item) {
		if(point<buffer.length) {
			buffer[point] = item; 
			point++;
		}else {
			System.out.println(item+"추가 실패 : 스택크기를 초과하였습니다.");
		}
	}

	public String pop() {
		if(point==0)
			return null;
		String s = buffer[point-1];
		point--;
		return s;
	}

	public boolean isEmpty() {
		if(point==0)
			return true;
		return false;
	}
	
	public int size() {
		return buffer.length;
	}
}