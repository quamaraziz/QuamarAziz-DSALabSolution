package com.longestpath.service;

import java.util.ArrayList;

public class FindLongestPath {

	public static class Node {
		public Node left;
		public Node right;
		public int data;
	};

	public static Node newNode(int data) {
		Node node = new Node();

		node.data = data;
		node.left = null;
		node.right = null;

		return node;
	}

	public static ArrayList<Integer> findLongestPath(Node root) {

		if (root == null) {
			ArrayList<Integer> list = new ArrayList<>();
			return list;
		}

		// Recursive call right sub tree
		ArrayList<Integer> right = findLongestPath(root.right);

		// Recursive call on left sub tree
		ArrayList<Integer> left = findLongestPath(root.left);

		if (right.size() < left.size()) {
			left.add(root.data);
		} else {
			right.add(root.data);
		}

		return (left.size() > right.size() ? left : right);

	}
}
