package com.jeffrey.pattern.component;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Leaf implements Component {
	private String name;
	public Leaf(String name){
		this.name=name;
	}
	@Override
	public void add(Component component) {

	}

	@Override
	public void display() {
		System.out.println("leaf name:" + this.name);
	}

	@Override
	public void remove(Component component) {

	}
}
