package com.ls;

public class ArrayList {
	
	// 元素的数量
	private int size = 0;
	// 所有的元素
	private int[] elements;
	// 默认容量
	private static final int DEFAULT_CAPACITY = 10;
	// 索引为-1
	private static final int ELEMENT_NOT_FOUND = -1;
	
	public ArrayList(int capacity) {
		capacity = (capacity < DEFAULT_CAPACITY) ? DEFAULT_CAPACITY : capacity;
		elements = new int[capacity];
	}
	
	public ArrayList() {
		// 无参构造方法调用有参构造方法
		this(DEFAULT_CAPACITY);
	}
	
	/**
	 * 元素的数量
	 * @return
	 */
	public int size() {
		return size;
	}
	
	/**
	 * 是否为空
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	
	/**
	 * 是否包含某个元素
	 * @param element
	 * @return
	 */
	public boolean contains(int element) {
		return indexof(element) != ELEMENT_NOT_FOUND;
	}
	
	/**
	 * 在最后尾部添加一个元素
	 * @param element
	 */
	public void add(int element) {
		
	}
	
	/**
	 * 在index位置插入一个元素
	 * @param index
	 * @param element
	 */
	public void add(int index, int element) {
		
	}
	
	/**
	 * 获取index位置的元素
	 * @param index
	 * @return
	 */
	public int get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index:" + index + ", Size: " + size);
		}
		return elements[index];
	}
	
	/**
	 * 设置index位置的元素
	 * @param index
	 * @param element
	 * @return 原来的元素
	 */
	public int set(int index, int element) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index:" + index + ", Size: " + size);
		}
		
		int oldElement = elements[index];
		elements[index] = element;
		return oldElement;
	}
	
	/**
	 * 删除index位置的元素
	 * @param index
	 * @return
	 */
	public int remove(int index) {
		return 0;
	}
	
	/**
	 * 查看元素所在的位置（索引）
	 * @param element
	 * @return
	 */
	public int indexof(int element) {
		for (int i = 0; i < size; i++) {
			if (elements[i] == element) return i;
		}
		return ELEMENT_NOT_FOUND;
	}
	
	
	/**
	 * 清除所有元素
	 */
	public void clear() {
		
	}

}
