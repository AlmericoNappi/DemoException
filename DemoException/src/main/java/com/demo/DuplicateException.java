package com.demo;

public class DuplicateException extends Exception{
	
	private static final long serialVersionID = 1L;

	private String messaggio = "Risorsa Duplicata";
	
	public DuplicateException()
	{ 
		super();
	}
	
	public DuplicateException(String Messaggio)
	{
		super(Messaggio);
		this.messaggio = Messaggio;
	}

	public String getMessaggio() {
		return messaggio;
	}

	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}
	
}