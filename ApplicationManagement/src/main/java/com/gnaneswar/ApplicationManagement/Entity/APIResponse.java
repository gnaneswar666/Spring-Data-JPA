package com.gnaneswar.ApplicationManagement.Entity;

public class APIResponse<T> {

	
	int recordCount;
	T records;
	public int getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}
	public T getRecords() {
		return records;
	}
	public void setRecords(T records) {
		this.records = records;
	}
	public APIResponse(int recordCount, T records) {
		super();
		this.recordCount = recordCount;
		this.records = records;
	}
	public APIResponse() {
		super();
	}
	
	
	
}
