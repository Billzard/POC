package com.billzard.vo.output;

public class ResultVO {

	private Integer status;

	private String message;

	public ResultVO(Integer status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ResultVO [status=" + status + ", message=" + message + "]";
	}

}
