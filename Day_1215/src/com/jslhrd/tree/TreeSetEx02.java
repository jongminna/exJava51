package com.jslhrd.tree;
import java.util.*;
public class TreeSetEx02 {
	public static void main(String[] args) {
		TreeSet<Integer> score = new TreeSet();
		score.add(87);score.add(98);
		score.add(75);score.add(95);
		score.add(80);score.add(77);
		System.out.println(score);
		Integer val = null;
		val = score.first();
		System.out.println("가장 낮은 점수 :" + val);
		val = score.last();
		System.out.println("가장 높은 점수 :" + val);
		val = score.lower(90);
		System.out.println("90점아래 점수 :" + val);
		val = score.higher(90);
		System.out.println("90점 위 점수 :" + val);
		val = score.floor(94);
		System.out.println("94점이거나 바로 아래 점수 :" + val);
		val = score.ceiling(95);
		System.out.println("95점이거나 바로 위 점수 :" + val);
		
		System.out.println("객체 수 :" + score.size());
		while(!score.isEmpty()) {
			val = score.pollFirst();
			System.out.println("남은 객체 수 :" + score.size());
		}
	}

}
