package com.practice.trie.node;

public class TrieTest {
	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.insert("ant");
		trie.insert("are");
		trie.insert("area");
		trie.insert("base");
		trie.insert("cat");
		trie.insert("basement");
		trie.insert("ask");
		trie.insert("test");
		trie.insert("taste");
		trie.insert("caterer");
		trie.insert("dog");
		trie.insert("dot");
		String input = "caterer";
		System.out.println("Matching prefix for " + input + ":"
				+ trie.getMatchingPrefix(input));
		input = "dom";
		System.out.println("Matching prefix for " + input + ":"
				+ trie.getMatchingPrefix(input));
		input = "catbase";
		System.out.println("Matching prefix for " + input + ":"
				+ trie.getMatchingPrefix(input));
	}

}
