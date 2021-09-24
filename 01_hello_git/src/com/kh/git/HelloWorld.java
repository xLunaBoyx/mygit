package com.kh.git;

import com.kh.animal.Cat;
import com.kh.animal.Dog;
import com.kh.foo.Foo;

/**
 * 원격저장소 등록 후 push 할 수 있다. 
 *
 */

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
	
	/**
	* 원격 저장소에서 수정된 내용
	*/
	public void hello() {
		System.out.println("저를 fetch해주세요");
	}
}
