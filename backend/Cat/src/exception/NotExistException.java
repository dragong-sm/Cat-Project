package exception;

//찾는 값이 존재하지 않을 경우, 예외 발생을 위한 사용자 정의 예외 처리 
public class NotExistException extends Exception {
  public NotExistException(){}
	public NotExistException(String message){ //메시지를 받아서 super로 넘겨주면 에러메시지를 throw할 수 있다.
    super(message); 
  }  }
