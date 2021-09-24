package com.kh.git;

import com.kh.animal.Cat;
import com.kh.animal.Dog;
import com.kh.foo.Foo;

public class HelloWorld {

	public static void main(String[] args_ ) {
		System.out.println("Hello world~");
		System.out.println("Hello git~");
		System.out.println("Good luck~");
		
		new Foo().sayFoo();
		new Foo().sayFoo();  // #sayFoo 에서 추가
		System.out.println("Lucky you~");  // #master 에서 추가
		
		new Dog().say();
		new Cat().say();
		// master branch 어디갔어
	}
}
