package com.longestpath.main;

import java.util.ArrayList;
import com.longestpath.service.FindLongestPath;
import com.longestpath.service.FindLongestPath.Node;

public class TreeMain {

	public static void main(String[] args) {
		Node root = FindLongestPath.newNode(100);
		root.left = FindLongestPath.newNode(20);
		root.right = FindLongestPath.newNode(130);
		root.left.left = FindLongestPath.newNode(10);
		root.left.right = FindLongestPath.newNode(50);
		root.left.left.left = FindLongestPath.newNode(5);
		root.right.left = FindLongestPath.newNode(110);
		root.right.right = FindLongestPath.newNode(140);

		ArrayList<Integer> output = FindLongestPath.findLongestPath(root);
		int n = output.size();

		System.out.print(output.get(n - 1));
		for (int i = n - 2; i >= 0; i--) {
			System.out.print(" -> " + output.get(i));
		}

	}

}
