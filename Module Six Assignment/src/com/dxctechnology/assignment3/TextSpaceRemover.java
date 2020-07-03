package com.dxctechnology.assignment3;

public class TextSpaceRemover {

	public static void main(String[] args) {
		String data = "    hello      world     .  owycb  ";
		SpaceRemover remover = new SpaceRemover();
		System.out.println(remover.spaceRemover(data));
	}

}
