package com.advanced_java.collection_framework_in_java.maindriver_controller;

import com.advanced_java.collection_framework_in_java.linkedlist_crud_operation.LinkedListCrudOperation;

public class MainDriver
{
	static LinkedListCrudOperation linkedListCrudOperation = new LinkedListCrudOperation();
	public static void main(String[] args)
	{
		linkedListCrudOperation.createTheData();
		
		linkedListCrudOperation.readTheData();
		
		linkedListCrudOperation.updateTheData();
		
		linkedListCrudOperation.deleteTheData();
	}
}