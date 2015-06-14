package com.practice.trie.node;

import java.util.HashMap;

public class Trie {
	private TrieNode root = new TrieNode(new Character((char) 0));

	public void insert(String word) {
		TrieNode crawl = root;
		for (int index = 0; index < word.length(); index++) {
			HashMap<Character, TrieNode> child = crawl.getChildren();
			char ch = word.charAt(index);
			if (child.containsKey(ch)) {
				crawl = child.get(ch);
			} else {
				TrieNode temp = new TrieNode(ch);
				crawl.putChild(ch, temp);
				crawl = temp;
			}
		}
		crawl.setEnd(true);
	}

	public String getMatchingPrefix(String input) {
		String result = "";
		TrieNode crawl = root;
		for (int level = 0; level < input.length(); level++) {
			char ch = input.charAt(level);
			HashMap<Character, TrieNode> child = crawl.getChildren();
			if (child.containsKey(ch)) {
				result += ch;
				crawl = child.get(ch);
			} else
				break;
		}
		return result;
	}
}
