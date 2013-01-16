package com.fjfhlqjtg.exception;
/**
 * 离线任务ID未获取异常
 * @author fjfhlqjtg
 *
 */
public class TaskIdIsEmptyException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TaskIdIsEmptyException(){
		super();
	}
	
	public TaskIdIsEmptyException(String msg){
		super(msg);
	}
}
